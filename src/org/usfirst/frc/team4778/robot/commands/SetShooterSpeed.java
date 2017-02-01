package org.usfirst.frc.team4778.robot.commands;

import org.usfirst.frc.team4778.robot.subsystems.Shooter;

import edu.wpi.first.wpilibj.command.Command;

public class SetShooterSpeed extends Command {
	private double speed;

	public SetShooterSpeed(double speed) {
		this.speed = speed;
	}

	@Override
	protected void initialize() {}

	@Override
	protected void execute() {
		Shooter.setSpeed(speed);
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {}

	@Override
	protected void interrupted() {
		end();
	}
}
