/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc5534.Onabot.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class ElevPlatformRetractCmdGrp extends CommandGroup {
  /**
   * ElevPlatformRetract
   * This will raise Elev1 up so the rails are clear to retract
   * Then retract the platform
   * then lower the elev1 down
   */
  public ElevPlatformRetractCmdGrp() {

    addSequential(new Elev1Up(0.6), 1);
    addSequential(new ElevPlatformBackwards());
    addSequential(new Elev1Down(0.6));

  }
}
