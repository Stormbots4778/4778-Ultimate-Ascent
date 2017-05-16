package org.usfirst.frc.team4778.robot;

import edu.wpi.first.wpilibj.Victor;

public class RobotMap {
	// XXX: conditional controller
	public static boolean gamepadDrive = true;
	public static Victor L0 = new Victor(4);
	public static Victor L1 = new Victor(5);
	public static Victor R0 = new Victor(6);
	public static Victor R1 = new Victor(7);
	public static Victor V1 = new Victor(8);
	public static Victor V2 = new Victor(9);
	public static double speed = 0.5;
}
