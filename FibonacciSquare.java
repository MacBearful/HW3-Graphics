import java.awt.*;

public class FibonacciSquare extends AbstractShape {
    private int x;
    private int y;
    private Color c;
    /* The quadrant refers to the orientation of the arc, which is always a quarter circle and will be a different
    segment of the circle depending on which quadrant it is in.
     */
    private int quadrant;
    // n = length of the side of the square containing the arc
    private int n;

    // FibonacciSquare constructor. (int x, int y) is the location of the very top left coordinate of the square.
    public FibonacciSquare(int x, int y, Color c, int quadrant, int n){
        this.x = x;
        this.y = y;
        this.c = c;
        this.quadrant = quadrant;
        this.n = n;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(c);
        g.drawRect(x, y, n, n);
        switch (quadrant) {
            case 1:
                g.drawArc(x - n, y, n * 2, n * 2, 0, 90);
                break;
            case 2:
                g.drawArc(x, y, n * 2, n * 2, 90, 90);
                break;
            case 3:
                g.drawArc(x, y - n, n * 2, n * 2, 180, 90);
                break;
            case 4:
                g.drawArc(x - n, y - n, n * 2, n * 2, 270, 90);
        }
    }
}