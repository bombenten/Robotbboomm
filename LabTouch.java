package myproject;

import lejos.nxt.*;

public class LabTouch {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LCD.drawString("Labtouch", 0, 0);
		TouchSensor touch = new TouchSensor(SensorPort.S1);
		while (true) {
			Motor.A.setSpeed(200);
			Motor.A.forward();
			Motor.B.setSpeed(200);
			Motor.B.forward();
			if (touch.isPressed()) {
				LCD.drawString("S1 is Pressed", 2, 3);
				Motor.A.backward();
				Motor.B.backward();
				Button.waitForAnyPress();
				
				

			}

		}
	}
	
	}