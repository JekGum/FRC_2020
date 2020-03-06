package frc.robot;

import edu.wpi.first.wpilibj.*;
import frc.robot.controller.*;
import frc.robot.controller.operations.*;
import frc.robot.dashboard.*;
import frc.robot.gamecomponents.*;

public class Robot extends TimedRobot {

  private ControllerClass controller = null;
  private DriveBase driveBase = null;
  private WoF WoF = new WoF();
  private BallGrab bG = new BallGrab();
  public Dashboard dB = new Dashboard();

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

    dB.getGameMessage();

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
    operateColourSensor();
    operateBallGrab();
  
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

  private void operateColourSensor(){

    ColourSensorOperation op = controller.getColourSensorOperation();
    switch (op) {

      case RED:
      dB.displayMessage("RED");

      case BLUE:
      dB.displayMessage("BLUE");

      case YELLOW:
      dB.displayMessage("YELLOW");

      case GREEN:
      dB.displayMessage("GREEN");

      case NULL:
      dB.displayMessage("NULL");

    }

  }

  private void operateBallGrab(){

    BallGrabOperation op = controller.getBallGrabOperation();
    switch (op){

      case S_IN:
      bG.s_in();

      case S_OUT:
      bG.s_out();

      case F_IN:
      bG.f_in();

      case F_OUT:
      bG.f_out();

      case STOP:
      bG.stop();

    }

  }
}