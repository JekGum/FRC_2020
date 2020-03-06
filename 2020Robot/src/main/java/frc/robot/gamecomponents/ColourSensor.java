package frc.robot.gamecomponents;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.util.Color;
import com.revrobotics.ColorMatch;
import com.revrobotics.ColorMatchResult;
import com.revrobotics.ColorSensorV3;


public class ColourSensor{

    private ColorSensorV3 cS = new ColorSensorV3(I2C.Port.kOnboard);
    private ColorMatch cM = new ColorMatch();
    private Color rC = cS.getColor();
    public ColorMatchResult cMR = cM.matchColor(rC);

}