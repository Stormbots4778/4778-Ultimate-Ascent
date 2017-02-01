package org.usfirst.frc.team4778.robot;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Victor;

public class RobotMap {
	// XXX: conditional controller
	public static boolean gamepadDrive = true;
	public static Talon L = new Talon(1);
	public static Talon R = new Talon(0);
	public static Victor V1 = new Victor(4);
	public static Victor V2 = new Victor(5);
	public static Victor V3 = new Victor(9);
}
