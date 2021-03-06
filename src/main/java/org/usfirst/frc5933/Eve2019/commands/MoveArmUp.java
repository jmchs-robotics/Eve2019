package org.usfirst.frc5933.Eve2019.commands;

import org.usfirst.frc5933.Eve2019.Robot;
import org.usfirst.frc5933.Eve2019.subsystems.Arm.ArmPosition;

import edu.wpi.first.wpilibj.command.Command;

/**
 * raise arm by calling Arm.armUp()
 */
public class MoveArmUp extends Command {

    public MoveArmUp() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.arm);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run.
    protected void execute() {
    	Robot.arm.armUp();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
