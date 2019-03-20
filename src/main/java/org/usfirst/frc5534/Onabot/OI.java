// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5534.Onabot;

import org.usfirst.frc5534.Onabot.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;

import org.usfirst.frc5534.Onabot.BobController;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 * These can be on a joystick or controller, on as buttons on the drivers station.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    BobController driver, operator;


    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        operator = new BobController(RobotMap.kOperatorControllerPort);
        
        driver = new BobController(RobotMap.kDriverControllerPort);
        

        // SmartDashboard Buttons
        //SmartDashboard.putData("Arcade Drive", new ArcadeDrive());
        SmartDashboard.putData("Elev1 Up", new Elev1Up(0.5));
        SmartDashboard.putData("Elev1 Down", new Elev1Down(0.5));
        //SmartDashboard.putData("Elev2 Up", new Elev2Up());
        SmartDashboard.putData("Elev2 Down", new Elev2Down());
        //SmartDashboard.putData("Elev Platform Forward", new ElevPlatformForward());
        //SmartDashboard.putData("Elev Platform Backwards", new ElevPlatformBackwards());
        SmartDashboard.putData("Gripper Open", new GripperOpen());
        SmartDashboard.putData("Gripper Close", new GripperClose());
        SmartDashboard.putData("Gripper Wrist Up", new GripperWristUp());
        SmartDashboard.putData("Gripper Wrist Middle", new GripperWristMiddle());
        SmartDashboard.putData("Gripper Wrist Down", new GripperWristDown());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        driver.aButton.whenActive(new ElevPlatformDeploy());
        driver.bButton.whenActive(new ElevPlatformRetract());
        operator.xButton.whenActive(new GripperOpen());
        operator.yButton.whenActive(new GripperClose());
        operator.leftBumper.whenPressed(new GripperWristUp());
        operator.leftBumper.whenReleased(new GripperWristStop());
        operator.rightBumper.whenPressed(new GripperWristDown());
        operator.rightBumper.whenReleased(new GripperWristStop());

        if (operator.getLeftStickY() > 0.0) {
            new Elev1Up(operator.getLeftStickY());
        } else if (operator.getLeftStickY() < 0.0) {
            new Elev1Down(operator.getLeftStickY());
        }

        

        

    }


    public Joystick getDriver() {
        return driver;
    }

    public double getDriverLeftJoyStickY(){
        return driver.getLeftStickY();// <-- Return the up/down on the driver left JS 
    }

    public double getDriverLeftJoyStickX(){
        return driver.getLeftStickX();// <-- Return the left/right on driver left JS
    }

    public double getDriverRightJoyStickY(){
        return driver.getRightStickY();// <-- Return the up/down on the driver right JS
    }

    public double getDriverRightJoyStickX(){
        return driver.getRightStickX();// <-- Return the left/right on the driver right JS
    }

    public Joystick getOperator() {
        return operator;
    }

    public double getOperatorLeftJoyStickX(){
        return operator.getLeftStickX();
    }
    public double getOperatorLeftJoyStickY(){
        return operator.getLeftStickY();
    }
    public double getOperatorRightJoyStickX(){
        return operator.getRightStickX();
    }
    public double getOperatorRightJoyStickY(){
        return operator.getRightStickY();
    }

    public double getOperatorLeftTrigger(){ // Should make the gripper wrist go up.
        return operator.getRawAxis(2);
    }

    public double getOperatorRightTrigger(){ // Should make the gripper wrist go down.
        return operator.getRawAxis(3);
    }


}

