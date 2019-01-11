package org.usfirst.frc5933.Eve2019.commands;

import org.usfirst.frc5933.Eve2019.Robot;
import org.usfirst.frc5933.Eve2019.subsystems.Arm.ArmPosition;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class MoveArmVBus extends Command {

    public MoveArmVBus() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.arm);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run.
    protected void execute() {
    	Robot.arm.armPositionControl(ArmPosition.VBus, Robot.oi.getSubStick().getY());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
