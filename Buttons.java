package myproject;
import lejos.nxt.*;

public class Buttons {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		while (true){
			LCD.clear();
			if (Button.ENTER.isDown()){
				LCD.drawString("ENTER", 0, 0); Thread.sleep(2000);
			}
			if (Button.ESCAPE.isDown()){
				LCD.drawString("ESCAPE", 0, 0); Thread.sleep(2000);
			}
			if (Button.LEFT.isDown()){
				LCD.drawString("LEFT", 0, 0); Thread.sleep(2000);
			}
			if (Button.RIGHT.isDown()){
				LCD.drawString("RIGHT", 0, 0); Thread.sleep(2000);	
			}
		}
	}

}