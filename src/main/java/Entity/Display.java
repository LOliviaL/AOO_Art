package Entity;
import java.awt.Canvas;
import javax.swing.JFrame;

public class Display extends Canvas{
    public static final int WIDTH = 800;
    public static final int HEIGHT = 800;

    public static void main(String[] args) {
        Display art = new Display();
        JFrame frame = new JFrame();
        frame.add(art);
        frame.setSize(WIDTH, HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);



    }


}