package frc.robot;

import edu.wpi.first.wpilibj.*;
import frc.robot.controller.*;
import frc.robot.controller.operations.*;
import frc.robot.gamecomponents.*;

public class Robot extends TimedRobot {

  private ControllerClass controller = null;
  private DriveBase driveBase = null;
  private WoF WoF = null;

  @Override
  public void robotInit() {
  }

  private void driveBaseInit(){

    driveBase = new DriveBase();

  }

  @Override
  public void robotPeriodic() {
  }

  @Override
  public void autonomousInit() {

    if(driveBase == null){

      driveBaseInit();

    }

  }

  @Override
  public void autonomousPeriodic() {

    operateRobot();

  }

  @Override
  public void teleopInit(){

    controller = new TeleopController();
    if(driveBase == null){

      driveBaseInit();

    }

  }

  @Override
  public void teleopPeriodic() {

    operateRobot();

  }

  @Override
  public void testPeriodic() {
  }

  private void operateRobot(){

    driveDriveBase();
    operateWoF();
  
  }

  private void driveDriveBase(){

    double speed = controller.getDriveSpeed();
    double direction = controller.getDriveDirection();
    driveBase.manualDrive(speed, direction);

  }

  private void operateWoF(){

    WoFOperation op = controller.getWoFOperation();
    switch (op) {

      case LEFT:
        WoF.left();

      case RIGHT:
        WoF.right();

      case STOP:
        WoF.stop();

    }

  }
}