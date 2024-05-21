import java.awt.*;
import javax.swing.JFrame;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;

public class GraphicsDemo1 extends Canvas
{
    private BufferedImage bbc;

    public GraphicsDemo1 (){
        try{
            bbc = ImageIO.read(new File("src/bbc.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void paint( Graphics g )
    {   g.drawImage(bbc, 200, 200, this);



    }

    public static void main( String[] args )
    {
        // You can change the title or size here if you want.
        JFrame win = new JFrame("GraphicsDemo1");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GraphicsDemo1 canvas = new GraphicsDemo1();
        win.add( canvas );
        win.setVisible(true);
    }
}
