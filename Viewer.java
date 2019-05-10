import java.awt.*;
import javax.swing.*;

public class Viewer extends JPanel implements View {
	// The model the Viewer is registered with
	private DrawingModel model;

	public Viewer() {
		setBackground(Color.WHITE);
	}

	@Override
	public void update(DrawingModel model) {
		this.model = model;
		repaint(); // will eventually call paintComponent
	}

	@Override
	protected void paintComponent(Graphics g) {
		// paint background
		super.paintComponent(g);

		// display of the shapes
		if (model != null) {
			for (Shape s : model.getShapes()) {
				s.draw(g);
			}
		}
	}
}



