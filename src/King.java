import java.awt.*;

public class King extends Piece {

    public King(boolean isBlack){
        super(isBlack);
    }

    public void showingW(Graphics g, int x, int y){
        if(isBlack){
            g.drawString("|:+:|", x, y+10);
            g.drawString("(o:o)", x-3, y+20);
            g.drawString("( : )", x+1, y+30);
        }
        else{
            g.drawString("|'+'|", x, y+10);
            g.drawString("(o o)", x-4, y+20);
            g.drawString("(_)", x+1, y+30);
        }
    }
    public void showingB(Graphics g, int x, int y){
        if(isBlack){
            g.drawString("*********", x, y);
            g.drawString("***|:+:|**", x-1, y+10);
            g.drawString("**(o:o)**", x, y+20);
            g.drawString("***( : )***", x-1, y+30);
            g.drawString("*********", x, y+40);
        }
        else{
            g.drawString("*********", x, y);
            g.drawString("***|'+'|***", x-1, y+10);
            g.drawString("**(o o)**", x, y+20);
            g.drawString("***(_)***", x-1, y+30);
            g.drawString("*********", x, y+40);
        }
    }
}
