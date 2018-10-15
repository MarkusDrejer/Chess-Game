import java.awt.*;

public abstract class Piece {

    protected boolean isBlack;

    public Piece(boolean isBlack){
        this.isBlack = isBlack;
    }

    protected abstract void showingW(Graphics g, int x, int y);

    protected abstract void showingB(Graphics g, int x, int y);

    //protected abstract void move();
}
