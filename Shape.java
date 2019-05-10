import java.awt.*;

public interface Shape{
    // draw Shape on given graphics object
    public void draw(Graphics g);
    public Shape deepCopy();
}