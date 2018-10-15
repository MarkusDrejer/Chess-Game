import java.awt.*;

public class Queen extends Piece {

    public Queen(boolean isBlack){
        super(isBlack);
    }

    public void showingW(Graphics g, int x, int y){
        if(isBlack){
            g.drawString("/\\:/\\", x, y+10);
            g.drawString("/(o:o)\\", x-7, y+20);
            g.drawString("( : )", x, y+30);
        }
        else{
            g.drawString("_", x+5, y);
            g.drawString("/\\*/\\", x, y+10);
            g.drawString("/(o o)\\", x-7, y+20);
            g.drawString("(_)", x, y+30);
        }
    }
    public void showingB(Graphics g, int x, int y){
        if(isBlack){
            g.drawString("*********", x, y);
            g.drawString("***/\\:/\\***", x, y+10);
            g.drawString("**/(o:o)\\*", x-2, y+20);
            g.drawString("***( : )***", x, y+30);
            g.drawString("*********", x, y+40);
        }
        else{
            g.drawString("****_****", x, y);
            g.drawString("***/\\*/\\***", x, y+10);
            g.drawString("**/(o o)\\*", x-1, y+20);
            g.drawString("***(_)***", x+1, y+30);
            g.drawString("*********", x, y+40);
        }
    }
}
