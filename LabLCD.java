package myproject;
import lejos.nxt.LCD;

public class LabLCD {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		LCD.drawString("Hello There", 3, 0);
		LCD.drawString("Free RAM:", 0, 1);
		LCD.drawInt((int) System.getRuntime().freeMemory(), 6, 9, 1);
		Thread.sleep(5000);
	}

}
 