package frc.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;

public class Intake implements AutoCloseable {
  private PWMSparkMax motor;
  private DoubleSolenoid piston;
  public static int MOTOR_PORT = 3;
  public static int PISTON_FWD = 0;
  public static int PISTON_REV = 1;

  public Intake() {
    this(new PWMSparkMax(MOTOR_PORT) ,new DoubleSolenoid(PneumaticsModuleType.CTREPCM, PISTON_FWD, PISTON_REV));
  }

  public Intake(PWMSparkMax m, DoubleSolenoid s) {
    motor = m;
    piston = s;
  }

  public String getMotorDescription() {
    return motor.getDescription();
  }

  public void deploy() {
    piston.set(DoubleSolenoid.Value.kForward);
  }

  public void retract() {
    piston.set(DoubleSolenoid.Value.kReverse);
    motor.set(0); // turn off the motor
  }

  public void activate(double speed) {
    if (piston.get() == DoubleSolenoid.Value.kForward) {
      motor.set(speed);
    } else { // if piston isn't open, do nothing
      motor.set(0);
    }
  }

  @Override
  public void close() throws Exception {
    piston.close();
    motor.close();
  }
}