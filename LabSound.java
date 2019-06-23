package myproject;
import lejos.nxt.*;
public class LabSound {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		SoundSensor sound = new SoundSensor(SensorPort.S3);
		while (!Button.ENTER.isDown()){
			LCD.drawString("Sound bB:", 0, 0);
			LCD.drawInt(sound.readValue(), 10, 0);
			if(sound.readValue() >= 80){
				Motor.A.setSpeed(1000);
				Motor.A.forward();
			} else
				Motor.A.stop();
			}
			
		}
		
	}

