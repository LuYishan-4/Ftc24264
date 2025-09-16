package org.firstinspires.ftc.teamcode.common;

import com.arcrobotics.ftclib.gamepad.GamepadEx;
import com.qualcomm.robotcore.hardware.HardwareMap;
import org.firstinspires.ftc.teamcode.common.subsystem.DriveTrain;
import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.common.subsystem.vision;
import org.firstinspires.ftc.teamcode.common.subsystem.colorsensor;

public class BOt {
    public DriveTrain driveTrain;
    public vision vision;

    private GamepadEx gamepad;

    public colorsensor colorsensor;

    private HardwareMap hmp;


    private static BOt instance = null;


    public void initHardware(HardwareMap hardwareMap, Telemetry telemetry, GamepadEx gamepadEx,double x, double y, double rx) {
        this.hmp = hardwareMap;
        this.telem = telemetry;
        this.gamepad = gamepadEx;
        //claw = new claw();
        vision = new vision();
        colorsensor = new colorsensor();
        driveTrain = new DriveTrain();
    }




    public static BOt getInstance() {
        if (instance == null) instance = new BOt();
        return instance;

    }


    public Telemetry telem;



    public HardwareMap gethardware() {
        return this.hmp;
    }

    public Telemetry getTelemetry() {
        return telem;
    }
}









