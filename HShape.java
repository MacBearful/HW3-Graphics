import java.awt.*;

public class HShape extends AbstractShape {
    // squareMatrix[][] contains the row and column location for a 9 by 9 grid
    private Point[][] squareMatrix = new Point[3][3];
    // size = length of the side of a grid square
    private int size;

    // HShape constructor. (int x, int y) is the location of the very top left coordinate of the HShape.
    public HShape(int x, int y, Color c, int size){
        super(x,y,c);
    	this.size = size;
    }

    public void draw(Graphics g) {
    	int squareWidth = (int)(size/3.0);
    	
    	for(int i = 0; i < 3; i++){
            squareMatrix[i][0] = new Point(x + squareWidth * i,y);
            squareMatrix[i][1] = new Point(x + squareWidth * i,y + squareWidth);
            squareMatrix[i][2] = new Point(x + squareWidth * i,y + squareWidth * 2);
        }
    	
    	g.setColor(c);
        // create square objects at each correct grid location in order to build an HShape
        g.fillRect((int)squareMatrix[0][0].getX(),(int)squareMatrix[0][0].getY(),squareWidth,squareWidth);
        g.fillRect((int)squareMatrix[2][0].getX(),(int)squareMatrix[2][0].getY(),squareWidth,squareWidth);
        g.fillRect((int)squareMatrix[0][1].getX(),(int)squareMatrix[0][1].getY(),squareWidth,squareWidth);
        g.fillRect((int)squareMatrix[1][1].getX(),(int)squareMatrix[1][1].getY(),squareWidth,squareWidth);
        g.fillRect((int)squareMatrix[2][1].getX(),(int)squareMatrix[2][1].getY(),squareWidth,squareWidth);
        g.fillRect((int)squareMatrix[0][2].getX(),(int)squareMatrix[0][2].getY(),squareWidth,squareWidth);
        g.fillRect((int)squareMatrix[2][2].getX(),(int)squareMatrix[2][2].getY(),squareWidth,squareWidth);
    }
    
    public Shape deepCopy() {
    	HShape copy = new HShape(x,y,c,size);
    	return copy;
    }
    
}
