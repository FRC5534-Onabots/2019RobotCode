/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc5534.Onabot;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DigitalOutput;

/**
 * RobotMap
 * A nice place to save all the ID, and Port numbers that our robot is plugged into
 */
public class RobotMap {
    // USB port numbers for the xbox controllers used in OI
    public static final int kDriverControllerPort = 0;
    public static final int kOperatorControllerPort = 1;
    
    // Can ID numbers for the drive train motor controllers
    public static final int kFrontLeftTalonID = 2;
    public static final int kFrontRightTalonID = 5;
    public static final int kRearLeftTalonID = 3;
    public static final int kRearRightTalonID = 6;

    // Can ID and DIO port numbers for the elevator1 subsystem
    public static final int kElev1VictorID = 1;
    public static final int kElev1TopSwitchDioPort = 0;
    public static final int kElev1BottomSwitchDioPort = 1;

    // Can ID and DIO port numbers for the elevator2 subsystem
    public static final int kElev2VictorID = 4;
    public static final int kElev2TopSwitchDioPort = 2;
    public static final int kElev2BottomSwitchDioPort = 3;

    // Can ID numbers for the elevator table subsystem
    public static final int kElevTablePCMForwardPort = 0;
    public static final int kElevTablePCMBackwardPort = 1;

    // Can ID numbers for the gripper subsystem
    public static final int kGripperPCMForwardPort = 2; // Used to OPEN the gripper
    public static final int kGripperPCMBackwardPort = 3; // Used to CLOSE the gripper

    // Can ID numbers for the gripper wrist subsystem
    public static final int kGripperWristVictorID = 7;
    public static final int kGripperWristDioPort = 4;

    // Can ID numbers for other items
    public static final int kPDPCanID = 8;
    public static final int kPCMCanID = 0;

	public static final int kPingDio = 6;
	public static final int kEchoDio = 7;

}
