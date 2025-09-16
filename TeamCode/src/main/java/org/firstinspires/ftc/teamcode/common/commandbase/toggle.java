package org.firstinspires.ftc.teamcode.common.commandbase;

import com.arcrobotics.ftclib.command.CommandBase;
import org.firstinspires.ftc.teamcode.common.subsystem.intake;

public class toggle extends CommandBase {
    private intake intake;
    public toggle(intake intake) {
        this.intake = intake;
        addRequirements(intake);
    }
    @Override
    public void initialize() {
        intake.toggle();

    }
    @Override
    public boolean isFinished() {
        return true;
    }
}
