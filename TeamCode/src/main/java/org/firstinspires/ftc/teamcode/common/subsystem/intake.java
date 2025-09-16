package org.firstinspires.ftc.teamcode.common.subsystem;

import com.arcrobotics.ftclib.command.SubsystemBase;

import com.qualcomm.robotcore.hardware.CRServo;
import org.firstinspires.ftc.teamcode.common.BOt;
public class intake extends SubsystemBase {
    private CRServo intake;
    private state statee = state.STOP;

    private enum state{
        START,
        STOP
    }
    public intake(){
        intake = BOt.getInstance().gethardware().get(CRServo.class,"intake");
    }
    public void start(){
        intake.setPower(1.0);
        statee = state.START;
    }
    public void stop(){
        intake.setPower(0.0);
        statee = state.STOP;
    }
    public void toggle(){
        if(statee == state.START){
            stop();
        }else{
            start();
        }
    }


}
