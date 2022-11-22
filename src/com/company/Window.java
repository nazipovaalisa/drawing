package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class WindowFrame extends JFrame{

    public boolean night;

    JPanel buttonPanel;

    windowPanel panel;

    JButton bt1;

    public WindowFrame(String s){

        super(s);

        bt1=new JButton("Ночь");
        night = false;

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);


        setSize(700, 500);

        panel = new windowPanel();

        Container contentPane = getContentPane();

        contentPane.setLayout(new BorderLayout());

        contentPane.add(panel, BorderLayout.CENTER);

        panel.setPaintColor(Color.CYAN,Color.yellow);

        bt1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                if(night) {

                    night =false;

                    panel.setPaintColor(Color.cyan, Color.yellow);
                    bt1.setText("Ночь");

                }
                else{
                    night = true;
                    panel.setPaintColor(Color.BLACK, Color.white);
                    bt1.setText("День");
                }

            }

        });


        buttonPanel = new JPanel(new FlowLayout());

        buttonPanel.add(bt1);


        contentPane.add(panel,BorderLayout.CENTER);

        contentPane.add(buttonPanel,BorderLayout.SOUTH);

    }

}

class windowPanel extends JPanel {

    private Color ColorSky;

    private Color ColorObj;

    public void setPaintColor(Color color3, Color color4) {


        ColorSky = color3;

        ColorObj = color4;

        repaint();

    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        Stroke stroke = new BasicStroke(20);//ширина окна

        g2.setStroke(stroke);

        Rectangle2D rectangle1 = new Rectangle.Double(100, 50, 250, 295);

        Rectangle2D rectangle2 = new Rectangle.Double(350, 50, 250, 295);

        Rectangle2D rectangle3 = new Rectangle.Double(100, 300, 500, 40);

        g2.setPaint(ColorSky);

        g2.fill(rectangle1);

        g2.fill(rectangle2);


        g2.setPaint(Color.gray);//окно

        g2.draw(rectangle1);

        g2.draw(rectangle2);

        g2.draw(rectangle3);

        g2.fill(rectangle3);

        g2.setPaint(Color.orange);

        Rectangle2D rectangle4 = new Rectangle.Double(250, 260, 50, 55);//горшок

        Ellipse2D circle3 = new Ellipse2D.Double(250, 320, 50, 15);//дно горшка

        g2.draw(circle3);

        g2.fill(circle3);

        g2.draw(rectangle4);

        g2.fill(rectangle4);

        g2.setPaint(new Color(116, 78, 59));

        Ellipse2D circle2 = new Ellipse2D.Double(249, 247, 52, 15);//земля в горшке

        g2.draw(circle2);

        g2.fill(circle2);

        g2.setPaint(new Color(154, 211, 95));

        Rectangle2D rectangle5 = new Rectangle.Double(276, 200, 1, 50);

        circle3 = new Ellipse2D.Double(248, 230, 58, 4);//листы цветка

        g2.draw(circle3);

        g2.fill(circle3);

        g2.draw(rectangle5);

        g2.fill(rectangle5);

        g2.setPaint(Color.white);

        Ellipse2D center = new Ellipse2D.Double(268, 140, 20, 20);//цветок

        g2.draw(center);

        g2.fill(center);


        g2.setPaint(Color.PINK);

        Ellipse2D circle = new Ellipse2D.Double(268, 170, 20, 20);

        g2.draw(circle);

        g2.fill(circle);

        circle = new Ellipse2D.Double(268, 110, 20, 20);

        g2.draw(circle);

        g2.fill(circle);

        circle = new Ellipse2D.Double(240, 140, 20, 20);

        g2.draw(circle);

        g2.fill(circle);

        circle = new Ellipse2D.Double(295, 140, 20, 20);

        g2.draw(circle);

        g2.fill(circle);

        g2.setPaint(ColorObj);

        Ellipse2D ob = new Ellipse2D.Double(430, 120, 80, 80);//солнце, луна

        g2.draw(ob);

        g2.fill(ob);

        setBackground(new Color(255, 228, 196));

    }
}