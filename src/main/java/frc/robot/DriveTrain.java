package frc.robot;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj.Encoder;

public class DriveTrain {
    PIDController _pid;
    Encoder _enc;

    int _kP;
    int _kI;
    int _kD;
   
    public DriveTrain(int kP, int kI, int kD) {
        // Creates a PIDController with gains kP, kI, and kD
        this(new PIDController(kP, kI, kD), new Encoder(1, 2));
    }

    public DriveTrain(PIDController p, Encoder e) {
        _pid = p;
        _enc = e;
    }
}
