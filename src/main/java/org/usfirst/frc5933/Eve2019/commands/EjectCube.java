package org.usfirst.frc5933.Eve2019.commands;

import org.usfirst.frc5933.Eve2019.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class EjectCube extends Command {

	double time = -1;
	public EjectCube() {
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
		requires(Robot.spinner);
	}

	public EjectCube(double timeout) {
		requires(Robot.spinner);

		time = timeout;
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		Robot.spinner.ejectCube();
		
		if(time >= 0) {
			setTimeout(time);
		}
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		Robot.spinner.ejectCube();
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return isTimedOut();
	}

	// Called once after isFinished returns true
	protected void end() {
		Robot.spinner.controlFlyWheels(0);
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
		end();
	}
}
