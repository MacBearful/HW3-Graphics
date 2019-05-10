import java.awt.Color;
import java.awt.Graphics;

public abstract class AbstractShape implements Shape {
    protected int x, y,size;
    protected Color c;
    
	public AbstractShape(int x, int y, Color c, int size) {
		this.x = x;
		this.y = y;
		this.c = c;
		this.size = size;
	}
	
	public abstract void draw(Graphics g);
	public abstract Shape deepCopy();
	
}