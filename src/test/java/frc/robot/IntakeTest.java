package frc.robot;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class IntakeTest {
    
    Intake _intake;

    @Mock
    PWMSparkMax mockMotorPWM;

    @Mock
    DoubleSolenoid mockPiston;

    @Before
    public void init() {
         mockMotorPWM = mock(PWMSparkMax.class);
         mockPiston = mock(DoubleSolenoid.class);
        _intake= new Intake(mockMotorPWM, mockPiston);
    }

    @Test
    public void testMotorDescriptionTest1() {
       String testValue = "Hello 2590!";
       String incorrectValue = "Goodbye 2590!";
       Mockito.when(mockMotorPWM.getDescription()).thenReturn((String)testValue);
       Assert.assertEquals(_intake.getMotorDescription(), testValue);
       System.out.println("Found value: " + _intake.getMotorDescription());
    }

    @Test
    public void testMotorDescriptionTest2() {
       String testValue = "Hello 2590!";
       String incorrectValue = "Goodbye 2590!";
       Mockito.when(mockMotorPWM.getDescription()).thenReturn((String)testValue);
       Assert.assertEquals(_intake.getMotorDescription(), testValue);
       System.out.println("Found value: " + _intake.getMotorDescription());
    }
    @Test
    public void testMotorDescriptionTest3() {
       String testValue = "Hello 2590!";
       String incorrectValue = "Goodbye 2590!";
       Mockito.when(mockMotorPWM.getDescription()).thenReturn((String)testValue);
       Assert.assertEquals(_intake.getMotorDescription(), incorrectValue);
       System.out.println("Found value: " + _intake.getMotorDescription());
    }
}