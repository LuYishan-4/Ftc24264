package org.firstinspires.ftc.teamcode.common.commandbase;
import com.arcrobotics.ftclib.command.CommandBase;
import org.firstinspires.ftc.teamcode.common.subsystem.DriveTrain;

public class drivetrain extends CommandBase {

    private DriveTrain driveTrain;
    private double x;
    private double y;
    private double rx;

    public drivetrain(DriveTrain driveTrain,double x,double y,double rx) {
        this.driveTrain = driveTrain;
        this.x = x;
        this.y = y;
        this.rx = rx;
        addRequirements(driveTrain);
    }
    @Override
    public void initialize() {
        driveTrain.driveRobotCentric(x,y,rx);
    }
    @Override
    public boolean isFinished() {
        return false;
    }
}
