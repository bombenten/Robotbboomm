package myproject;
import javax.microedition.lcdui.Graphics;

public class LCDGraphics {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Graphics g = new Graphics();
		g.drawLine(5,5,60,60);
		g.drawRect(50,10,15,20);
		g.fillRect(70,10,16,21);
		Thread.sleep(10000);
	}

}
