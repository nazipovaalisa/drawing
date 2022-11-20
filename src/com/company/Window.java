package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class WindowFrame extends JFrame{

    boolean night;

    JPanel buttonPanel;
    windowPanel panel;
    JButton bt1;

    public WindowFrame(String s){
        super(s);
        this.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

        bt1=new JButton("День/ночь");

        setTitle("День/ночь");
        setSize(700, 500);

        panel = new windowPanel();
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(panel, BorderLayout.CENTER);
        panel.setPaintColor(Color.PINK,Color.red,Color.CYAN,Color.yellow);

        bt1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(night==true) {
                    night=false;
                    panel.setPaintColor(Color.PINK, Color.red, Color.cyan, Color.yellow);
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
    private Color paintColor1;
    private Color paintColor2;
    private Color paintColor3;
    private Color paintColor4;

    public void setPaintColor(Color color1, Color color2, Color color3, Color color4) {
        paintColor1 = color1;
        paintColor2 = color2;
        paintColor3 = color3;
        paintColor4 = color4;
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

        g2.setPaint(paintColor3);
        g2.fill(rectangle1);
        g2.fill(rectangle2);
        g2.setPaint(paintColor2);

        g2.setPaint(Color.gray);//окно
        g2.draw(rectangle1);
        g2.draw(rectangle2);
        g2.draw(rectangle3);
        g2.fill(rectangle3);
        g2.setPaint(Color.blue);
        Rectangle2D rectangle4 = new Rectangle.Double(250, 260, 50, 55);//горшок
        Ellipse2D circle3 = new Ellipse2D.Double(250, 320, 50, 15);//дно горшка
        g2.draw(circle3);
        g2.fill(circle3);
        g2.draw(rectangle4);
        g2.fill(rectangle4);
        g2.setPaint(new Color(116, 78, 59));
        Ellipse2D circle2 = new Ellipse2D.Double(249, 250, 52, 15);//земля в горшке
        g2.draw(circle2);
        g2.fill(circle2);
        g2.setPaint(new Color(154, 211, 95));
        Rectangle2D rectangle5 = new Rectangle.Double(276, 200, 1, 50);
        circle3 = new Ellipse2D.Double(248, 230, 58, 4);//листы цветка
        g2.draw(circle3);
        g2.fill(circle3);
        g2.draw(rectangle5);
        g2.fill(rectangle5);
        g2.setPaint(paintColor2);

        circle3 = new Ellipse2D.Double(430, 120, 80, 80);//солнце
        g2.draw(circle3);
        g2.fill(circle3);
        setBackground(new Color(255, 228, 196));
    }

}