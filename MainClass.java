import java.awt.*;
import javax.swing.*;

public class MainClass {
    public static void main(String[] args) {
        // create frame and give it a name
        JFrame frame = new JFrame("HW 3");
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // create a viewer object
        InterfaceView view = new InterfaceView();
        frame.add(view);

        // set height/width and make frame visible
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}
