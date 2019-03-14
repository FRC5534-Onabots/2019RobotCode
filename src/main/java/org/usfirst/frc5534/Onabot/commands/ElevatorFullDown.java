/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc5534.Onabot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class ElevatorFullDown extends CommandGroup {
  /**
   * Add your docs here.
   */
  public ElevatorFullDown() {


    addParallel(new Elev2Down());
    addParallel(new Elev1Down());
  }
}
