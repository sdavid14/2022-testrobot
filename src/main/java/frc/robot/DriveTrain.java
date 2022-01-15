package frc.robot;

import edu.wpi.first.math.controller.PIDController;

public class DriveTrain {
    PIDController _pid;
    int _kP;
    int _kI;
    int _kD;
   
    public DriveTrain(int kP, int kI, int kD) {
        // Creates a PIDController with gains kP, kI, and kD
        this(new PIDController(kP, kI, kD));
    }

    public DriveTrain(PIDController p) {
        _pid = p;
    }
}
