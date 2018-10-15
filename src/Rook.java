import java.awt.*;

public class Rook extends Piece {

    public Rook(boolean isBlack){
        super(isBlack);
    }

    public void showingW(Graphics g, int x, int y){
        if(isBlack){
            g.drawString("[' '  ' ']", x-5, y+10);
            g.drawString(" |:::|", x-2, y+20);
            g.drawString(" |:::|", x-2, y+30);
        }
        else{
            g.drawString("[' '  ' ']", x-5, y+10);
            g.drawString(" |   |", x-2, y+20);
            g.drawString(" |   |", x-2, y+30);
        }
    }
    public void showingB(Graphics g, int x, int y){
        if(isBlack){
            g.drawString("*********", x, y);
            g.drawString("**[' '  ' ']**", x, y+10);
            g.drawString("***|:::|***", x, y+20);
            g.drawString("***|:::|***", x, y+30);
            g.drawString("*********", x, y+40);
        }
        else{
            g.drawString("*********", x, y);
            g.drawString("**[' '  ' ']**", x, y+10);
            g.drawString("***|   |***", x, y+20);
            g.drawString("***|   |***", x, y+30);
            g.drawString("*********", x, y+40);
        }
    }
}
