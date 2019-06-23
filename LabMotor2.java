package myproject;
import lejos.nxt.*;
import lejos.util.Delay;

public class LabMotor2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LCD.drawString("LabMotor 2", 0, 0);
		Button.waitForAnyPress();
		Motor.A.setSpeed(90);
		Motor.A.forward();
		LCD.clear();
		Delay.msDelay(2000);
		LCD.drawInt(Motor.A.getTachoCount(), 0, 0);
		Motor.A.stop();
		LCD.drawInt(Motor.A.getTachoCount(), 0, 1);
		Motor.A.backward();
		while (Motor.A.getTachoCount()>0);
		LCD.drawInt(Motor.A.getTachoCount(), 0, 2);
		Motor.A.stop();
		LCD.drawInt(Motor.A.getTachoCount(), 0, 3);
		Button.waitForAnyPress();
	}

}
