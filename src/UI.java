import java.awt.*;
import javax.swing.*;


public class UI extends JPanel {
    //  int[] xPoints = {200,300,350,300,200,150};
    // int[] yPoints = {350,350,250,150,150,250};

    public Polygon poly;
    public Polygon poly2;
    public Polygon poly3;
    public Polygon poly4;
    public Polygon poly5;

    public Polygon Poly2;
    public Polygon Poly3;
    public Polygon Poly4;
    public Polygon Poly5;


    public boolean drawed = false;
    int[] xPoints = {475, 525, 550, 525, 475, 450};
    int[] yPoints = {550, 550, 500, 450, 450, 500};


    public UI() {
        //movePolygons();
        initComponents();


        movePolygons();


    }

    public void initComponents() {


        poly = new Polygon(xPoints, yPoints, xPoints.length); // posledni cast  "xPoints.length" vezme vsechny souradnice z toho pole
        poly2 = new Polygon(xPoints, yPoints, xPoints.length);
        poly3 = new Polygon(xPoints, yPoints, xPoints.length);
        poly4 = new Polygon(xPoints, yPoints, xPoints.length);
        poly5 = new Polygon(xPoints, yPoints, xPoints.length);


    }


    public void movePolygons() {


        poly2.translate(0, -105);

        poly3.translate(0, 105);


        poly4.translate(0, 50);


        poly5.translate(0, 100);


        Poly2 = poly2;
        Poly3 = poly3;
        Poly4 = poly4;
        Poly5 = poly5;


        drawed = true;

    }

    @Override
    public void paintComponent(Graphics g) {



      /*  public void Polygon (int[] xPoints, int[] yPoints, int numPoints){
            g.fillPolygon(xPoints, yPoints, xPoints.length);
        }*/


        super.paintComponent(g);
        this.setBackground(Color.white);



       /* int[] xPoints = {900,1000,950,1000,900,850};// vytvori sipku -muze se hodit
        int[] yPoints = {500,500,400,300,300,400};*/

      /*  int[] xPoints = {900,1000,1050,1000,900,850};
        int[] yPoints = {600,600,500,400,400,500};
        g.fillPolygon(xPoints, yPoints, xPoints.length);*/

        // first polygon in center

        if (drawed == true) {
            g.setColor(Color.BLACK);
            g.drawPolygon(poly);


        /* g.drawPolygon(Poly2);


            g.drawPolygon(Poly3);

            g.drawPolygon(Poly4);


            g.drawPolygon(Poly5);*/







       /* Image chessPiecesImage;
        chessPiecesImage=new ImageIcon("ChessPieces.png").getImage();*/


        }

    }
}
