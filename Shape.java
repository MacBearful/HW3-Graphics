import java.awt.*;

public interface Shape{
    // draw Shape on given graphics object
    default void draw(Graphics g) {
    }
}