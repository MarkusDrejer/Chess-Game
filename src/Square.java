import javax.swing.*;
import java.awt.*;

public class Square extends JComponent {

    private boolean isBlack;
    private int x;
    private int y;
    private Piece piece = null;

    public Square(boolean isBlack, int x, int y){
        this.isBlack = isBlack;
        this.x = x;
        this.y = y;
    }

    public Square(boolean isBlack, int x, int y, Piece piece){
        this.isBlack = isBlack;
        this.x = x;
        this.y = y;
        this.piece = piece;
    }

    public void paint(Graphics g){
        if(getPiece() != null && isBlack){
            piece.showingB(g, x+75, (y)+75);
        }
        else if(getPiece() != null && !isBlack){
            piece.showingW(g, x+90, (y)+75);
        }
        for(int i = 0; i < 50; i+=10) {
            if (isBlack && getPiece() == null) {
                g.drawString("*********", x+75, (y+i)+75);
            } else if(!isBlack && getPiece() == null) {
                g.drawString("", x+75, (y+i)+75);
            }
        }
        lines(g);
    }

    public Piece getPiece(){
        return piece;
    }
    public void addPiece(Piece p){
        piece = p;
    }
    public void deletePiece(){
        piece = null;
    }



        //This should not be part of the Square Class, but unable to input it elsewhere at this time
    private void lines(Graphics g){
        g.drawString("Row(i)", 255, 45);
        g.drawString("Column(r)", 0, 270);
        for(int i = 0; i < 400; i+=50){
            g.drawString(""+i/50, 60, 90+i);
            g.drawString(""+i/50, 90+i, 58);
        }
    }
}
