import java.awt.*;

public class Bishop extends Piece {

    public Bishop(boolean isBlack){
        super(isBlack);
    }

    public void showingW(Graphics g, int x, int y){
        if(isBlack){
            g.drawString("':v:'", x, y+10);
            g.drawString("(o:0)", x-4, y+20);
            g.drawString("( : )", x, y+30);
        }
        else{
            g.drawString("'\\v/'", x, y+10);
            g.drawString("(o 0)", x-4, y+20);
            g.drawString("(_)", x+1, y+30);
        }
    }
    public void showingB(Graphics g, int x, int y){
        if(isBlack){
            g.drawString("*********", x, y);
            g.drawString("***':v:'***", x, y+10);
            g.drawString("**(o:0)**", x, y+20);
            g.drawString("***( : )***", x-1, y+30);
            g.drawString("*********", x, y+40);
        }
        else{
            g.drawString("*********", x, y);
            g.drawString("***'\\v/'***", x, y+10);
            g.drawString("**(o 0)**", x, y+20);
            g.drawString("***(_)***", x, y+30);
            g.drawString("*********", x, y+40);
        }
    }
}
