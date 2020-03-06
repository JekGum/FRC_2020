package frc.robot.gamecomponents;

import edu.wpi.first.wpilibj.VictorSP;
import frc.robot.*;

public class BallGrab{

    private VictorSP motor = new VictorSP(Config.BALLGRAB_CHANNEL);
    private SoftSpeedController controller = new SoftSpeedController(motor);

    public void s_in(){

        controller.set(Config.BG_SIN_SPEED);

    }

    public void s_out(){

        controller.set(Config.BG_SOUT_SPEED);
        
    }

    public void f_in(){

        controller.set(Config.BG_FIN_SPEED);
        
    }

    public void f_out(){

        controller.set(Config.BG_FOUT_SPEED);
        
    }

    public void stop(){

        controller.stopMotor();
        
    }

}