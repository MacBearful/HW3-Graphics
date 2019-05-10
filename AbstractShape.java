import java.awt.Color;
import java.awt.Graphics;

public abstract class AbstractShape implements Shape {
    protected int x, y;
    protected Color c;
    
	public AbstractShape(int x, int y, Color c) {
		this.x = x;
		this.y = y;
		this.c = c;
	}
	
	public abstract void draw(Graphics g);
	public abstract Shape deepCopy();
	
}