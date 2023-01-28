
package Utilities;

import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D;

public class PanelData2 extends JPanel{

    private int roundTopLeft = 0;
    private int roundTopRight = 0;
    private int roundBottonLeft = 0;
    private int roundBottonRight = 0;

    public int getRoundTopLeft() {
        return roundTopLeft;
    }

    public void setRoundTopLeft(int roundTopLeft) {
        this.roundTopLeft = roundTopLeft;
        repaint();
    }

    public int getRoundTopRight() {
        return roundTopRight;
    }

    public void setRoundTopRight(int roundTopRight) {
        this.roundTopRight = roundTopRight;
        repaint();
    }

    public int getRoundBottonLeft() {
        return roundBottonLeft;
    }

    public void setRoundBottonLeft(int roundBottonLeft) {
        this.roundBottonLeft = roundBottonLeft;
        repaint();
    }

    public int getRoundBottonRight() {
        return roundBottonRight;
    }

    public void setRoundBottonRight(int roundBottonRight) {
        this.roundBottonRight = roundBottonRight;
        repaint();
    }

    public PanelData2() {
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics graphics){
        Graphics2D g2 = (Graphics2D) graphics.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(this.getBackground());
        Area area = new Area(createRoundTopLeft());
            if(roundTopRight>0){
                area.intersect(new Area(createRoundTopRight()));
            }
            if(roundBottonLeft>0){
                area.intersect(new Area(createRoundBottonLeft()));
            }
            if(roundBottonRight>0){
                area.intersect(new Area(createRoundBottonRight()));
            }
        g2.fill(area);
        g2.dispose();
        super.paintComponent(graphics);
    }

    private Shape createRoundTopRight(){
        int width=this.getWidth();
        int height=this.getHeight();
        int roundX=Math.min(width, roundTopRight);
        int roundY = Math.min(height, roundTopRight);
        Area area = new Area(new RoundRectangle2D.Double(0,0, width, height, roundX,roundY));
        area.add(new Area(new Rectangle2D.Double(0,0,width - roundX / 2 , height)));
        area.add(new Area(new Rectangle2D.Double(0,roundY/2, width, height - roundY / 2)));
        return area;
    }

    private Shape createRoundTopLeft(){
        int width=this.getWidth();
        int height=this.getHeight();
        int roundX=Math.min(width, roundTopLeft);
        int roundY = Math.min(height, roundTopLeft);
        Area area = new Area(new RoundRectangle2D.Double(0,0, width, height, roundX,roundY));
        area.add(new Area(new Rectangle2D.Double(roundX/2,0,width - roundX / 2 , height)));
        area.add(new Area(new Rectangle2D.Double(0,roundY/2, width, height - roundY / 2)));
        return area;
    }
    private Shape createRoundBottonLeft(){
        int width=this.getWidth();
        int height=this.getHeight();
        int roundX=Math.min(width, roundBottonLeft);
        int roundY = Math.min(height, roundBottonLeft);
        Area area = new Area(new RoundRectangle2D.Double(0,0, width, height, roundX,roundY));
        area.add(new Area(new Rectangle2D.Double(roundX/2,0,width - roundX / 2 , height)));
        area.add(new Area(new Rectangle2D.Double(0,0, width, height - roundY / 2)));
        return area;
    }

    private Shape createRoundBottonRight(){
        int width=this.getWidth();
        int height=this.getHeight();
        int roundX=Math.min(width, roundBottonRight);
        int roundY = Math.min(height, roundBottonRight);
        Area area = new Area(new RoundRectangle2D.Double(0,0, width, height, roundX,roundY));
        area.add(new Area(new Rectangle2D.Double(0,0,width - roundX / 2 , height)));
        area.add(new Area(new Rectangle2D.Double(0,0, width, height - roundY / 2)));
        return area;
    }


}
