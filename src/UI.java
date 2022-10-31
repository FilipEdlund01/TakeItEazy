import java.awt.*;
import javax.swing.*;
import java.lang.Math;


public class UI extends JPanel {


    public Polygon poly;
    public Polygon poly2;
    public Polygon poly3;
    public Polygon poly4;
    public Polygon poly5;

    public Polygon Poly2;
    public Polygon Poly3;
    public Polygon Poly4;

    public Polygon Poly5;
    public int a = 50;

   /* Let the length of the sides of the regular hexagon be  a  units.

⇒  The coordinates of vertex  A  and vertex  D  are  (a,0)  and  (−a,0)  respectively.

    Each interior angle of a regular hexagon is  120o.

⇒  The triangle formed by each side and the lines joining the end points of the side to the circumcentre are equilateral.

⇒  The circumradius of the hexagon is  a  units.

            ⇒  The coordinates of vertex  B  are  (acos60o,asin60o)=(a2,3√a2).

            ⇒  The coordinates of vertex  C  are  (acos120o,asin120o)=(−a2,3√a2).

            ⇒  The coordinates of vertex  E  are  (acos240o,asin240o)=(−a2,−3√a2).

            ⇒  The coordinates of vertex  F  are  (acos300o,asin300o)=(a2,−3√a2).*/

    // https://www.quora.com/How-can-you-find-the-coordinates-in-a-hexagon


    public double Ex = 500 - (a / 2);
    public double Ey = 500 - ((Math.sqrt(3) * a) / 2);

    public double Fx = 500 + (a / 2);
    public double Fy = 500 - ((Math.sqrt(3) * a) / 2);

    public double Ax = 500 + a;
    public double Ay = 500;

    public double Dx = 500 - a;
    public double Dy = 500;

    public double Bx = 500 + (a / 2);
    public double By = 500 + ((Math.sqrt(3) * a) / 2);

    public double Cx = 500 - (a / 2);
    public double Cy = 500 + ((Math.sqrt(3) * a) / 2);


    int EX = (int) Ex;
    int EY = (int) Ey;

    int FX = (int) Fx;
    int FY = (int) Fy;

    int AX = (int) Ax;
    int AY = (int) Ay;

    int DX = (int) Dx;
    int DY = (int) Dy;

    int BX = (int) Bx;
    int BY = (int) By;

    int CX = (int) Cx;
    int CY = (int) Cy;


    public boolean drawed = false;
    int[] xPoints = {EX, FX, AX, BX, CX, DX};
    int[] yPoints = {EY, FY, AY, BY, CY, DY};

     /* int[] xPoints = {900,1000,1050,1000,900,850};// vytvori sipku -muze se hodit
        int[] yPoints = {500,500,400,300,300,400};
*/


    public UI() {

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


        poly2.translate(0, -90);

        /*poly3.translate(0, 105);


        poly4.translate(0, 50);


        poly5.translate(0, 100);*/


        Poly2 = poly2;
        Poly3 = poly3;
        Poly4 = poly4;
        Poly5 = poly5;


        drawed = true;

    }

    @Override
    public void paintComponent(Graphics g) {


        super.paintComponent(g);
        this.setBackground(Color.white);



       /* int[] xPoints = {900,1000,950,1000,900,850};// vytvori sipku -muze se hodit
        int[] yPoints = {500,500,400,300,300,400};*/


        // first polygon in center

        if (drawed == true) {
            g.setColor(Color.BLACK);
            g.drawPolygon(poly);


            g.drawPolygon(Poly2);


            g.drawPolygon(Poly3);

            g.drawPolygon(Poly4);


            g.drawPolygon(Poly5);


        }

    }
}
