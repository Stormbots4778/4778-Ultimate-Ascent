package org.usfirst.frc.team4778.robot;

import org.usfirst.frc.team4778.robot.commands.AlterShooterSpeed;
import org.usfirst.frc.team4778.robot.commands.RunLoader;
import org.usfirst.frc.team4778.robot.commands.RunShooter;
import org.usfirst.frc.team4778.robot.commands.SetShooterSpeed;
import org.usfirst.frc.team4778.robot.subsystems.Shooter;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {
	public static Joystick gamepad = new Joystick(2);
	public static Button gamepadLeftBumper = new JoystickButton(gamepad, 5);
	public static Button gamepadRightBumper = new JoystickButton(gamepad, 6);
	public static JoystickButton gamepadUp = new JoystickButton(gamepad, 4);
	public static JoystickButton gamepadDown = new JoystickButton(gamepad, 1);
	public static JoystickButton gamepadLeft = new JoystickButton(gamepad, 3);
	public static JoystickButton gamepadRight = new JoystickButton(gamepad, 2);

	public OI() {
		Shooter.setSpeed(-0.35);
		gamepadLeftBumper.whileHeld(new RunLoader());
		gamepadRightBumper.whileHeld(new RunShooter());
		gamepadUp.whileHeld(new AlterShooterSpeed(-0.01));
		gamepadDown.whileHeld(new AlterShooterSpeed(0.01));
		gamepadLeft.whileHeld(new SetShooterSpeed(-0.35));
		gamepadRight.whileHeld(new SetShooterSpeed(-0.35));
	}
}
