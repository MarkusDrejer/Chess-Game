import java.awt.*;

public class Knight extends Piece {

    public Knight(boolean isBlack){
        super(isBlack);
    }

    public void showingW(Graphics g, int x, int y){
        if(isBlack){
            g.drawString("\\ ' . ' /", x-5, y+10);
            g.drawString("(o:o)", x-5, y+20);
            g.drawString("\\ : / :\\", x, y+30);
            g.drawString("\"", x+6, y+40);
        }
        else{
            g.drawString("\\ '~'  /", x-5, y+10);
            g.drawString("(o o)", x-5, y+20);
            g.drawString("\\   /  \\", x, y+30);
            g.drawString("\"", x+6, y+40);
        }
    }
    public void showingB(Graphics g, int x, int y){
        if(isBlack){
            g.drawString("*********", x, y);
            g.drawString("**\\ ' . ' /**", x, y+10);
            g.drawString("**(o:o)**", x, y+20);
            g.drawString("***\\ : / :\\*", x, y+30);
            g.drawString("****\"****", x, y+40);
        }
        else{
            g.drawString("*********", x, y);
            g.drawString("**\\ '~'  /**", x, y+10);
            g.drawString("**(o o)**", x, y+20);
            g.drawString("***\\   /  \\*", x, y+30);
            g.drawString("****\"****", x, y+40);
        }
    }
}
