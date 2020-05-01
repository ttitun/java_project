import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Start extends JPanel{
  public static void main(String[] args) {
    Font font1 = new Font("Courier New",Font.BOLD,50);
    Font font2 = new Font("Courier New",Font.BOLD,30);
    Font font3 = new Font("Courier New",Font.BOLD,30);

    Color c = new Color(127,255,212);

    JFrame frame = new JFrame("PandaWooHoo");
    frame.setSize(800,650);
    frame.setLocation(350,100);

    JLabel label1 = new JLabel("[ PANDA WooHoo ]",SwingConstants.CENTER);
    label1.setPreferredSize(new Dimension(600,50));
    label1.setFont(font1);
    label1.setForeground(Color.BLACK);

    JPanel panel = new JPanel();
    panel.setBackground(c);

    JButton btn1 = new JButton("[START]");
    btn1.setPreferredSize(new Dimension(170,50));
    btn1.setFont(font2);
    btn1.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent event){
        frame.dispose();
        JFrame f = new JFrame();
        Gameset game = new Gameset();
        f.add(game);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(720,450);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setTitle("PandaWooHoo");

      }
    }
    );

    Icon icon = new ImageIcon("Pandabg.gif");
    JLabel label2 = new JLabel(icon);

    JButton btn2 = new JButton("[EXIT]");
    btn2.setPreferredSize(new Dimension(170,50));
    btn2.setFont(font2);

    btn2.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent event){
        frame.dispose();
      }
    }
    );

    JButton btn3 = new JButton("[HOW TO PLAY]");
    btn3.setPreferredSize(new Dimension(300,50));
    btn3.setFont(font3);
    btn3.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent event){
        frame.dispose();
        How a = new How();
      }
    }
    );



    panel.add(label1);
    panel.add(label2);
    panel.add(btn1);
    panel.add(btn3);
    panel.add(btn2);

    frame.add(panel);
    frame.setVisible(true);
    frame.setResizable(false);
    frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
  }
}
