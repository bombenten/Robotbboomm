package myproject;
import lejos.nxt.*;

public class LabMotor3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LCD.drawString("LabMotor 3", 0, 0);
		Button.waitForAnyPress();
		LCD.clear();
		Motor.A.rotate(1440);
		LCD.drawInt(Motor.A.getTachoCount(), 0, 0);
		Motor.A.rotate(0);
		LCD.drawInt(Motor.A.getTachoCount(), 0, 1);
		Button.waitForAnyPress();
		for (;;){
			MotorPort.A.controlMotor(80, 1);
			if(Motor.A.getTachoCount()>2000){
				MotorPort.A.controlMotor(0, 4);
				Button.waitForAnyPress();
				MotorPort.A.resetTachoCount();
			}
			LCD.drawString("Motor A:", 0, 2);
			LCD.drawInt(MotorPort.A.getTachoCount(), 10, 2);
			LCD.refresh();
		}
	}

}
