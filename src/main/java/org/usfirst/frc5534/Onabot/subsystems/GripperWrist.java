// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

//FIXME Need to rework the wrist positions
//Need to push the DIO ticks into a counter

package org.usfirst.frc5534.Onabot.subsystems;


import org.usfirst.frc5534.Onabot.RobotMap;
import org.usfirst.frc5534.Onabot.commands.*;
import edu.wpi.first.wpilibj.command.Subsystem;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.Counter;

/**
* The GripperWrist subsystem
* Home to the gripperMotorController
* The GripperCounter, which is a AndyMark DIO converter hooked to the H+ and H-
* leads of Bosch seat motor.  This hope is that we can kind of figure out where
* we are on this lead screw.
* @author Russell R. Riker 
* 
*/

//TODO Need to update the up() and down() to take a speed from the operators controlls

public class GripperWrist extends Subsystem {

    private int wristBottemPOS = 180, wristTopPOS = 0, wristMiddlePOS = 90;
    private WPI_VictorSPX gripperWristMotorController;
    private Counter gripperWristCounter;

    public GripperWrist() {
        gripperWristMotorController = new WPI_VictorSPX(RobotMap.kGripperWristVictorID);
        gripperWristCounter = new Counter(RobotMap.kGripperWristDioPort);
        addChild("Gripper Wrist Counter",gripperWristCounter);     
    }

    @Override
    public void initDefaultCommand() {

        setDefaultCommand(new GripperWristStop());

    }

    @Override
    public void periodic() {
        // Put code here to be run every loop

    }



    /**
     * wristUp()
     * Drives the gripper wrist motor upward while the counter is greater then
     * the tick counter for being in the top posistion.
     */
    public void wristUp(double speed){ 
        // While wrist counter is not at top
        gripperWristMotorController.set(speed);
    }

    /**
     * wristDown()
     * Drives the gripper wrist motor downward while the pos counter greater then
     * the bottem pos.
     */
    public void wristDown(double speed){
        // while wrist counter is not at bottem pos drive the motor down
        gripperWristMotorController.set(speed);
    }

    /**
     * wristStop()
     * Does just that.  Stops the motor.
     */
    public void wristStop(){
        gripperWristMotorController.set(0.0);
    }

    /**
     * wristMiddle()
     * Sets the wrist to half way between the top and bottem
     */
    public void wristMiddle(){
        if (gripperWristCounter.get() >= wristMiddlePOS){
            wristDown(0.5);
        }
        else {
            wristUp(0.5);
        }
        
    }

}

