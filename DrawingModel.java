import java.util.*;

public class DrawingModel {
	private List<Shape> shapes = new ArrayList<>();
	private List<View> views = new ArrayList<>();

	public void addView(View v) {
		views.add(v);
		v.update(this);
	}

	public void updateAll() {
		for (View v : views) {
			v.update(this);
		}
	}

	public void addShape(Shape s) {
		shapes.add(s);
		updateAll();
	}

	public List<Shape> getShapes() {
		List<Shape> copiedList = new ArrayList<>();
		for (Shape s: shapes) {
			copiedList.add(s.deepCopy());
		}
		return copiedList;
	}
}