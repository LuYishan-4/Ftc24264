package org.firstinspires.ftc.teamcode.common.subsystem;


import com.arcrobotics.ftclib.command.SubsystemBase;
import com.arcrobotics.ftclib.drivebase.MecanumDrive;
import com.arcrobotics.ftclib.hardware.motors.Motor;
import com.arcrobotics.ftclib.hardware.motors.MotorEx;
import org.firstinspires.ftc.teamcode.common.Contast;



import org.firstinspires.ftc.teamcode.common.BOt;

public class DriveTrain extends SubsystemBase {
    public MotorEx FL;
    public MotorEx FR;
    public MotorEx BL;
    public MotorEx BR;
    public MecanumDrive driveTrain;

    public DriveTrain() {
        FL = new MotorEx(BOt.getInstance().gethardware(), Contast.drive.leftFrontMotorName, Motor.GoBILDA.RPM_312);
        FR = new MotorEx(BOt.getInstance().gethardware(), Contast.drive.rightFrontMotorName, Motor.GoBILDA.RPM_312);
        BL = new MotorEx(BOt.getInstance().gethardware(), Contast.drive.leftbehindMotorName, Motor.GoBILDA.RPM_312);
        BR = new MotorEx(BOt.getInstance().gethardware(), Contast.drive.rightbehindMotorName, Motor.GoBILDA.RPM_312);
        FL.setInverted(true);
        BL.setInverted(true);

        driveTrain = new MecanumDrive(false, FL, FR, BL, BR);

    }

    @Override
    public void periodic() {
        //bruh
    }

    public void driveRobotCentric(double x, double y, double rx) {
        driveTrain.driveRobotCentric(x, y, rx, true);
    }
}
