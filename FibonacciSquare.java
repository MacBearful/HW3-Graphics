import java.awt.*;

public class FibonacciSquare extends AbstractShape {
    /* The quadrant refers to the orientation of the arc, which is always a quarter circle and will be a different
    segment of the circle depending on which quadrant it is in.
     */
    private int quadrant;
    // n = length of the side of the square containing the arc
    private int n;

    // FibonacciSquare constructor. (int x, int y) is the location of the very top left coordinate of the square.
    public FibonacciSquare(int x, int y, Color c, int quadrant, int n){
        super(x,y,c);
        this.quadrant = quadrant;
        this.n = n;
    }
    
    public int fibCalculation(int num) {
    	if(num == 1 || num == 2) {
    		return 1;
    	}
    	return fibCalculation(num-1) + fibCalculation(num -2);
    }
    
    public void draw(Graphics g) {
    	int size = fibCalculation(n);
        g.setColor(c);
        g.drawRect(x, y, size, size);
        switch (quadrant) {
            case 1:
                g.drawArc(x - size, y, size * 2, size * 2, 0, 90);
                break;
            case 2:
                g.drawArc(x, y, size * 2, size * 2, 90, 90);
                break;
            case 3:
                g.drawArc(x, y - size, size * 2, size * 2, 180, 90);
                break;
            case 4:
                g.drawArc(x - size, y - size, size * 2, size * 2, 270, 90);
        }
    }
    
    public Shape deepCopy() {
    	FibonacciSquare copy = new FibonacciSquare(x,y,c,quadrant,n);
    	return copy;
    }
}