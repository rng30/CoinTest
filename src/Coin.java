import java.awt.Image;
import java.awt.Graphics;

public class Coin {
	// fields
		private Image heads;
		private Image tails;
		private int currentFace = 0;
		// 0 is heads, 1 is tails
		
	// constructors
	public Coin(Image headsImg, Image tailsImg){
		this.heads = headsImg;
		this.tails = tailsImg;	
	}
	//methods
	public void flip()
	{
		if (currentFace == 0){
			currentFace = 1;
		}
		else{
			currentFace = 0;
		}
	 }
	public void draw(Graphics g, int x, int y)
	{
		if (currentFace == 0)
		{
			g.drawImage(heads, x, y, null);
		// draw heads	
		}
		else { //draw tails
			g.drawImage(tails, x, y, null);
		}
		
	}
	

}