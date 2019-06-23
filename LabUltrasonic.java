package myproject;

import lejos.nxt.*;

public class LabUltrasonic {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		UltrasonicSensor Ultrasonic = new UltrasonicSensor(SensorPort.S4);
		while (!Button.ENTER.isDown()) {
		LCD.drawString("Distance cm:", 0, 0);
		LCD.drawInt(Ultrasonic.getDistance(), 4, 0, 1);
//		Motor.A.setSpeed(1000);
//		Motor.A.forward();
//		Motor.B.setSpeed(1000);
//		Motor.B.forward();
		
		
		if (Ultrasonic.getDistance() < 30) {
			Motor.A.setSpeed(500);
			Motor.A.forward();
			Motor.B.setSpeed(0);
			Motor.B.stop();
			
			
		} else
			{Motor.A.setSpeed(500);
		Motor.A.forward();
		Motor.B.setSpeed(500);
		Motor.B.forward();
			}
			}
}
} 