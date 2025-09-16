package org.firstinspires.ftc.teamcode.opmode;

import com.arcrobotics.ftclib.command.Command;
import com.arcrobotics.ftclib.command.CommandOpMode;
import com.arcrobotics.ftclib.command.CommandScheduler;
import com.arcrobotics.ftclib.gamepad.GamepadEx;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.common.commandbase.drivetrain;
import org.firstinspires.ftc.teamcode.common.BOt;
import org.firstinspires.ftc.teamcode.pedroPathing.Constants;




@TeleOp(name = "Teleop")
public class Teleop extends CommandOpMode {




    GamepadEx gamePad1;



    @Override
    public void initialize() {
        gamePad1 = new GamepadEx(gamepad1);
        BOt.getInstance().initHardware(hardwareMap, telemetry, gamePad1, gamePad1.getLeftX(), gamePad1.getLeftY(), gamePad1.getRightX());
        Command drive = new drivetrain(BOt.getInstance().driveTrain, gamePad1.getLeftX(), gamePad1.getLeftY(), gamePad1.getRightX());
        BOt.getInstance().driveTrain.setDefaultCommand(drive);
        //gamePad1.getGamepadButton(GamepadKeys.Button.A).whenPressed(new toggle(BOt.getInstance().claw));
    }
        @Override
        public void run() {
            CommandScheduler.getInstance().run();
            telemetry.update();
        }
    }

