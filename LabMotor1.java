package myproject;
import lejos.nxt.*;

public class LabMotor1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LCD.drawString("LabMotor 1", 0, 0);
		Motor.A.setSpeed(90);
		Motor.A.forward();
		LCD.drawString("Forward: 180", 0, 1);
		Button.waitForAnyPress();
		Motor.A.setSpeed(360);
		Motor.A.backward();
		LCD.drawString("Backward: 720", 0, 2);
		Button.waitForAnyPress();
		Motor.A.stop();
		
	}

}
