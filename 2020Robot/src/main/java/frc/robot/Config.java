package frc.robot;

import edu.wpi.first.wpilibj.util.Color;

public class Config {

    //Controller Ports
    public static int STICK_PORT = 0;
    public static int XBOX_PORT = 1;

    //PWM Channels
    public static int DB_LEFTSIDE_CHANNEL = 7;
    public static int DB_RIGHTSIDE_CHANNEL = 8;
    public static int WoF_CHANNEL = 2;
    public static int BALLGRAB_CHANNEL = 6;

    //DIO Channels
    public static int HE_CHANNEL = 0;
    public static int HE2_CHANNEL = 1;
    public static int LS_CHANNEL = 2;
    public static int LS2_CHANNEL = 3;
    public static int CS_CHANNEL = 4;

    //Speeds
    public static int SSC_RUT = 500;
    public static double WoF_SPEED = 0.3;
    public static double BG_SIN_SPEED = 0.5;
    public static double BG_SOUT_SPEED = -0.5;
    public static double BG_FIN_SPEED = 0.8;
    public static double BG_FOUT_SPEED = -0.8;

    //Colours
    public static Color COLOUR_RED = new Color(0.390, 0.410, 0.183);
    public static Color COLOUR_BLUE = new Color(0.156, 0.439, 0.398);
    public static Color COLOUR_YELLOW = new Color(0.302, 0.531, 0.164);
    public static Color COLOUR_GREEN = new Color(0.201, 0.541, 0.257);

    //Misc
    public static double DIRECTION_SENSITIVITY = 0.75;
    public static int BG_SIN_BUTTON = 9;
    public static int BG_SOUT_BUTTON = 10;
    public static int BG_FIN_BUTTON = 11;
    public static int BG_FOUT_BUTTON = 12;

}