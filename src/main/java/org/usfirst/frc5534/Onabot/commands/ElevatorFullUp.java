/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc5534.Onabot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class ElevatorFullUp extends CommandGroup {
  /**
   * ElevatorFullUp()
   * Will raise both Elevator1 and 2 up to their top point
   * at the same time.
   */
  public ElevatorFullUp() {

    addParallel(new Elev1Up());
    addParallel(new Elev2Up());

  }
}
