package org.firstinspires.ftc.teamcode.common.subsystem;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.qualcomm.robotcore.hardware.ColorSensor;
import org.firstinspires.ftc.teamcode.common.BOt;

public class colorsensor extends SubsystemBase {
    private ColorSensor colorSensor;
    private double red,green,blue;
    public colorsensor(){
        colorSensor = BOt.getInstance().gethardware().get(ColorSensor.class,"color");
    }
    public void get3Color(){
        red = colorSensor.red();
        green = colorSensor.green();
        blue = colorSensor.blue();
    }
    @Override
    public void periodic() {
        get3Color();
        BOt.getInstance().telem.addData("r",red);
        BOt.getInstance().telem.addData("g",green);
        BOt.getInstance().telem.addData("b",blue);
    }
}


