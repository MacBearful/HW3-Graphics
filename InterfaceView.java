import java.awt.*;
import javax.swing.*;

public class InterfaceView extends JPanel {

    public InterfaceView() {
        setBackground(Color.WHITE);
    }

    public void paintComponent(Graphics g){
        // paint background
        super.paintComponent(g);

        // testing HShape
        HShape shapeTest = new HShape(150, 150, Color.RED, 50);
        shapeTest.draw(g);
    }

    public void update() {
        repaint();
    }
}