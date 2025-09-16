package org.firstinspires.ftc.teamcode.common.subsystem;
import com.arcrobotics.ftclib.command.CommandScheduler;
import com.arcrobotics.ftclib.command.SubsystemBase;
import com.qualcomm.hardware.limelightvision.Limelight3A;
import com.qualcomm.hardware.limelightvision.LLResult;
import com.qualcomm.hardware.limelightvision.LLResultTypes;
import com.qualcomm.hardware.limelightvision.LLStatus;
import org.firstinspires.ftc.teamcode.common.BOt;
import org.firstinspires.ftc.robotcore.external.navigation.Pose3D;
import com.pedropathing.geometry.Pose;
import com.pedropathing.math.Vector;

public class vision extends SubsystemBase{
    private Limelight3A limelight;
    private BOt bot;
    private LLResult result;
    private Pose3D botpose;
    private static final double CAMERA_HEIGHT = 57.0;
    private static final double CAMERA_ANGLE = 0.0;
    private static final double TARGET_HEIGHT = 19.05;

    private LLStatus status;
    private Pose startPose = new Pose();


    public vision(){
        limelight = BOt.getInstance().gethardware().get(Limelight3A.class, "limelight");
        limelight.pipelineSwitch(0);
        limelight.start();


    }
    public double getTx(double defaultValue) {
        if (result == null) {
            return defaultValue;
        }
        return result.getTx();
    }

    public double getTy(double defaultValue) {
        if (result == null) {
            return defaultValue;
        }
        return result.getTy();
    }


    @Override
    public void periodic() {

        result =limelight.getLatestResult();

        if (result != null) {
            BOt.getInstance().getTelemetry().addData("Tx", result.getTx());
            BOt.getInstance().getTelemetry().addData("Ty", result.getTy());
            BOt.getInstance().getTelemetry().addData("Ta", result.getTa());
            BOt.getInstance().getTelemetry().update();
        }
    }
}
