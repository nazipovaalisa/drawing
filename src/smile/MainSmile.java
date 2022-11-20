package smile;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;


class Smile extends JFrame {

    SmilePanel smile;

    public Smile(String s) {

        super(s);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
        setSize(600, 500);

        smile = new SmilePanel();
        smile.setBackground(Color.WHITE);

        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(smile, BorderLayout.CENTER);


        contentPane.add(smile,BorderLayout.CENTER);
    }
}
class SmilePanel extends JPanel {

    public Arc2D Arc2DD = new Arc2D.Double(215, 160, 100, 90, 200, 150, Arc2D.OPEN);


    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        g2.setPaint(Color.black);
        Rectangle2D rectangle1 = new Rectangle.Double(40, 45, 450, 300);
        g2.fill(rectangle1);
        g2.setPaint(new Color(199, 190, 186));
        Rectangle2D rectangle2 = new Rectangle.Double(68, 75, 390, 245);
        g2.draw(rectangle1);
        g2.draw(rectangle2);
        g2.fill(rectangle2);
        Rectangle2D rectangle3 = new Rectangle.Double(252, 338, 40, 50);
        Rectangle2D rectangle4 = new Rectangle.Double(145, 370, 245, 50);

        g2.setPaint(Color.yellow);
        Ellipse2D head = new Ellipse2D.Double(163, 95, 200, 200);
        Ellipse2D eye1 = new Ellipse2D.Double(220, 140, 20, 20);
        Ellipse2D eye2 = new Ellipse2D.Double(286, 140, 20, 20);

        g2.setPaint(Color.yellow);
        Stroke stroke = new BasicStroke(5);
        g2.setStroke(stroke);

        g2.fill(head);
        g2.setPaint(Color.black);
        g2.draw(eye1);
        g2.draw(eye2);
        g2.fill(eye1);
        g2.fill(eye2);

        g2.setPaint(Color.black);
        g2.fill(rectangle3);
        g2.fill(rectangle4);

        g2.draw(Arc2DD);
    }

    public static void main (String[] args) {
        Smile frame = new Smile("Ñלאיכ");
    }
}



