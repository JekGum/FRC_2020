package frc.robot.controller;

import frc.robot.controller.operations.*;
import frc.robot.Config;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;

public class TeleopController implements ControllerClass{

    private Joystick stick = new Joystick(Config.STICK_PORT);
    private XboxController xbox = new XboxController(Config.XBOX_PORT);

    @Override
    public double getDriveSpeed(){

        double speedY = stick.getY();
        double throttle = stick.getThrottle() * -1;
        double nThrottle = (throttle + 1) / 2;
        double sOut = speedY * nThrottle;
        return sOut;

    }

    @Override
    public double getDriveDirection(){

        double dOut = stick.getZ();
        return dOut;

    }

    @Override
    public WoFOperation getWoFOperation(){

        WoFOperation opOut = WoFOperation.STOP;

        if (xbox.getXButton()){

            opOut = WoFOperation.LEFT;

        }

        else if (xbox.getBButton()){

            opOut = WoFOperation.RIGHT;

        }

        return opOut;

    }

}