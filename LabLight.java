package myproject;
import lejos.nxt.*;
public class LabLight {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		LightSensor light = new LightSensor(SensorPort.S2);
		while (true) {
			LCD.drawString("gL-Value", 0, 0);
			LCD.drawInt(light.getLightValue(), 12, 0);
			LCD.drawString("gNL-Value", 0, 1);
			LCD.drawInt(light.getNormalizedLightValue(), 12, 1);
			LCD.drawString("rR-Value", 0, 2);
			LCD.drawInt(SensorPort.S2.readRawValue(), 12, 2);
			LCD.drawString("R-value", 0, 3);
			LCD.drawInt(SensorPort.S2.readRawValue(), 12, 3);
			
			
	}
	}
}