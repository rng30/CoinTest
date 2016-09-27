// Chapter 4 Question 9

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.Timer;

public class CoinTest extends JPanel
   implements ActionListener
{
  private Coin coin;

  public CoinTest ()
  {
    Image heads = (new ImageIcon(this.getClass().getResource("/heads.gif"))).getImage();
    Image tails = (new ImageIcon(this.getClass().getResource("/tails.gif"))).getImage();
    // gets images from resources folder in Formative repository
    coin = new Coin(heads, tails);

    Timer clock = new Timer(2000, this);
    clock.start();
  }

  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);

    int x = getWidth() / 4;
    int y = getHeight() / 4;
    coin.draw(g, x, y);
  }

  public void actionPerformed(ActionEvent e)
  {
    coin.flip();
    repaint();
  }

  public static void main(String[] args)
  {
    JFrame w = new JFrame("Flipping coin");
    w.setSize(800, 750);
    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    CoinTest panel = new CoinTest();
    panel.setBackground(Color.BLUE);
    Container c = w.getContentPane();
    c.add(panel);

    w.setVisible(true);
  }
}