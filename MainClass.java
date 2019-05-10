import java.awt.*;
import javax.swing.*;

public class MainClass {
    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> buildGUI());
    }

    private static void buildGUI() {
        // create frame, give it a name, close operation, and set height/width
        JFrame frame = new JFrame("HW 3");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        // create a Viewer object and make the frame visible
        Viewer panel = new Viewer();
        frame.add(panel);
        frame.setVisible(true);
        // create a DrawingModel object
        DrawingModel model = new DrawingModel();

        // create and add HShapes to the model
        Shape h1 = new HShape(150, 150, Color.RED, 175);
        model.addShape(h1);
        Shape h2 = new HShape(250, 350, Color.GREEN, 75);
        model.addShape(h2);
        Shape h3 = new HShape(350, 180, Color.BLUE, 100);
        model.addShape(h3);
        Shape h4 = new HShape(20, 165, Color.BLACK, 65);
        model.addShape(h4);
        // create and add FibonacciSquares to the model
        Shape f1 = new FibonacciSquare(40,40, Color.BLACK, 1, 11);
        model.addShape(f1);
        Shape f2 = new FibonacciSquare(400,40, Color.RED, 2, 9);
        model.addShape(f2);
        Shape f3 = new FibonacciSquare(350,400, Color.DARK_GRAY, 3, 10);
        model.addShape(f3);
        Shape f4 = new FibonacciSquare(40,360, Color.GREEN, 4, 12);
        model.addShape(f4);

        /*
        This calls the addView() method in DrawingModel, which calls the update() method in Viewer, which re-registers
        the model and then repaints each shape in the DrawingModel array.
        */
        model.addView(panel);
    }
}