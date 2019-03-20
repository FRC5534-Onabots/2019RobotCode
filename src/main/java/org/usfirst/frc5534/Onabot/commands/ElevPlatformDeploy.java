/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc5534.Onabot.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class ElevPlatformDeploy extends CommandGroup {
  /**
   * ElevPlatformDeploy
   * Will call the commands to 
   * Raise up Elev1 for 1 sec so the platform rails are clear
   * Then run the platform forward
   * then lower Elev1 back down.
   */
  public ElevPlatformDeploy() {

    addSequential(new Elev1Up(0.6));
    addSequential(new ElevPlatformForward());
    addSequential(new Elev1Down(-0.6));


  }
}
