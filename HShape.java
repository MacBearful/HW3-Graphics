import java.awt.*;

public class HShape extends AbstractShape {
    // squareMatrix[][] contains the row and column location for a 9 by 9 grid
    private Point[][] squareMatrix = new Point[3][3];

    // length of the side of a grid square
    private int size;

    private Color c;

    // HShape constructor. (int x, int y) is the location of the very top left coordinate of the HShape
    public HShape(int x, int y, Color c, int size){
        this.size = size;
        this.c = c;
        for(int i = 0; i < 3; i++){
            squareMatrix[i][0] = new Point(x + size * i,y);
            squareMatrix[i][1] = new Point(x + size * i,y + size);
            squareMatrix[i][2] = new Point(x + size * i,y + size * 2);
        }
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(c);
        // create square objects at each correct grid location in order to build an HShape
        g.fillRect((int)squareMatrix[0][0].getX(),(int)squareMatrix[0][0].getY(),size,size);
        g.fillRect((int)squareMatrix[2][0].getX(),(int)squareMatrix[2][0].getY(),size,size);
        g.fillRect((int)squareMatrix[0][1].getX(),(int)squareMatrix[0][1].getY(),size,size);
        g.fillRect((int)squareMatrix[1][1].getX(),(int)squareMatrix[1][1].getY(),size,size);
        g.fillRect((int)squareMatrix[2][1].getX(),(int)squareMatrix[2][1].getY(),size,size);
        g.fillRect((int)squareMatrix[0][2].getX(),(int)squareMatrix[0][2].getY(),size,size);
        g.fillRect((int)squareMatrix[2][2].getX(),(int)squareMatrix[2][2].getY(),size,size);
    }
}
