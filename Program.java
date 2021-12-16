import javax.swing.JFrame;
import java.awt.*;

/**
*   This program displays the growth of an investment. 
*/
public class Program
{  
  public static void main(String[] args)
  {  
    JFrame frame = new JFrame();
    frame.add(new MainPanel());
//    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
//    double width = screen.width;
//    double height = screen.height;
//    frame.getContentPane().setPreferredSize(new Dimension((int)width, (int)height));

    frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
  private static final int FRAME_WIDTH = 1920;
  private static final int FRAME_HEIGHT = 1080;
}
   