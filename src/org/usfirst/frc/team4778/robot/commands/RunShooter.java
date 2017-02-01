package org.usfirst.frc.team4778.robot.commands;

import org.usfirst.frc.team4778.robot.Robot;
import org.usfirst.frc.team4778.robot.RobotMap;
import org.usfirst.frc.team4778.robot.subsystems.Shooter;

import edu.wpi.first.wpilibj.command.Command;

public class RunShooter extends Command {
	public RunShooter() {
		requires(Robot.shooter);
	}

	@Override
	protected void initialize() {}

	@Override
	protected void execute() {
		RobotMap.V1.set(Shooter.getSpeed());
		RobotMap.V2.set(Shooter.getSpeed());
		// RobotMap.S1.set(OI.joystickRight.getZ());
		// RobotMap.S2.set(OI.joystickRight.getZ());
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {
		RobotMap.V1.set(0);
		RobotMap.V2.set(0);
	}

	@Override
	protected void interrupted() {
		end();
	}
}
