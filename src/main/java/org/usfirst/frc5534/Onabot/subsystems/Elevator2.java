// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package org.usfirst.frc5534.Onabot.subsystems;

import org.usfirst.frc5534.Onabot.RobotMap;
import org.usfirst.frc5534.Onabot.commands.*;

import edu.wpi.first.wpilibj.command.Subsystem;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Counter;


/**
 *
 */
public class Elevator2 extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private DigitalInput elev2BottomSwitch;
    private DigitalInput elev2TopSwitch;
    private WPI_VictorSPX elev2MotorController;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private Counter elev2TopCounter;
    private Counter elev2BottomCounter;

    public Elevator2() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        elev2BottomSwitch = new DigitalInput(RobotMap.kElev2BottomSwitchDioPort);
        addChild("Elev2 Bottom Switch",elev2BottomSwitch);
        
        
        elev2TopSwitch = new DigitalInput(RobotMap.kElev2TopSwitchDioPort);
        addChild("Elev2 Top Switch",elev2TopSwitch);
        
        elev2MotorController = new WPI_VictorSPX(RobotMap.kElev2VictorID);
        
        elev2BottomCounter = new Counter(elev2BottomSwitch);
        elev2TopCounter = new Counter(elev2TopSwitch);
    }

    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new Elev2Down());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop

    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initTopCounter(){
        elev2TopCounter.reset();
    }

    public void initBottomCounter(){
        elev2BottomCounter.reset();
    }

    public boolean isTopSwitchSet(){
        return elev2TopCounter.get() > 0;
    }

    public boolean isBottomSwitchSet(){
        return elev2BottomCounter.get() > 0;
    }

    public void stop(){
        elev2MotorController.set(0);
    }

    public void up(){
        elev2MotorController.set(-0.5);
    }

    public void down(){
        elev2MotorController.set(0.5);
    }
}

