import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

class Gameset extends JPanel implements ActionListener,KeyListener{
  Timer t = new Timer(15,this);
  private int panx = 0;
  private int pany = 340;

  private int sc = 0;
  private int scgw = 0;
  private int scrw = 0;
  private int scyw = 0;
  private int scli = 5;

  private int ee = 5;


  private boolean left = false;
  private boolean right = false;
  private boolean up = false;
  private boolean down = false;
  private boolean a = false;
  private boolean s = false;
  private boolean d = false;

  private Random ran = new Random();

  private int[] bomx = {170,200,390,420,610,640};
  private int[] bomy = {40,80,120,160,200,240,280,320};
  private int ranxbom = ran.nextInt(6);
  private int ranybom = ran.nextInt(8);

  private int[] rwrlx = {200,420,640};
  private int[] rwrly = {20,60,100,140,180,220,260,300};
  private int ranxrwrl = ran.nextInt(3);
  private int ranyrwrl = ran.nextInt(8);

  private int[] rwrrx = {170,390,610};
  private int[] rwrry = {20,60,100,140,180,220,260,300};
  private int ranxrwrr = ran.nextInt(3);
  private int ranyrwrr = ran.nextInt(8);

  private int[] gwrlx = {200,420,640};
  private int[] gwrly = {20,60,100,140,180,220,260,300};
  private int ranxgwrl = ran.nextInt(3);
  private int ranygwrl = ran.nextInt(8);

  private int[] gwrrx = {170,390,610};
  private int[] gwrry = {20,60,100,140,180,220,260,300};
  private int ranxgwrr = ran.nextInt(3);
  private int ranygwrr = ran.nextInt(8);

  private int[] ywrlx = {200,420,640};
  private int[] ywrly = {20,60,100,140,180,220,260,300};
  private int ranxywrl = ran.nextInt(3);
  private int ranyywrl = ran.nextInt(8);

  private int[] ywrrx = {170,390,610};
  private int[] ywrry = {20,60,100,140,180,220,260,300};
  private int ranxywrr = ran.nextInt(3);
  private int ranyywrr = ran.nextInt(8);

  public Gameset(){
    t.start();
    addKeyListener(this);
    setFocusable(true);
    setFocusTraversalKeysEnabled(false);
  }
  public void end(){
    JOptionPane.showMessageDialog(null,"Score : "+sc);
    System.exit(0);
  }
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    Icon bg = new ImageIcon("bgplay.png");
    bg.paintIcon(this,g,120,0);

    Icon bgsc = new ImageIcon("bgsc.png");
    bgsc.paintIcon(this,g,0,0);

    Icon li = new ImageIcon("like.png");
    li.paintIcon(this,g,15,70);
    g.setFont(new Font("Angsana New",Font.BOLD,20));
    g.drawString(" x : "+scli,50,90);

    Icon scgwr = new ImageIcon("gwr.png");
    scgwr.paintIcon(this,g,0,100);
    g.setFont(new Font("Angsana New",Font.BOLD,20));
    g.drawString(" x : "+scgw,50,150);

    Icon scrwr = new ImageIcon("rwr.png");
    scrwr.paintIcon(this,g,0,170);
    g.setFont(new Font("Angsana New",Font.BOLD,20));
    g.drawString(" x : "+scrw,50,220);

    Icon scywr = new ImageIcon("ywr.png");
    scywr.paintIcon(this,g,0,230);
    g.setFont(new Font("Angsana New",Font.BOLD,20));
    g.drawString(" x : "+scyw,50,300);

    g.setFont(new Font("Angsana New",Font.BOLD,30));
    g.drawString("Score : "+sc,10,40);

    if (right) {
      Icon panda = new ImageIcon("chapanright.png");
      panda.paintIcon(this,g,panx,pany);
      if (up) {
        Icon panda1 = new ImageIcon("chapanright.png");
        panda1.paintIcon(this,g,panx,pany);
      }
      if (down) {
        Icon panda1 = new ImageIcon("chapanright.png");
        panda1.paintIcon(this,g,panx,pany);
      }
    }

    if (left) {
      Icon panda = new ImageIcon("chapanleft.png");
      panda.paintIcon(this,g,panx,pany);
      if (up) {
        Icon panda1 = new ImageIcon("chapanleft.png");
        panda1.paintIcon(this,g,panx,pany);
      }
      if (down) {
        Icon panda1 = new ImageIcon("chapanleft.png");
        panda1.paintIcon(this,g,panx,pany);
      }
    }

    Icon rwrl = new ImageIcon("rwrl.gif");
    rwrl.paintIcon(this,g,rwrlx[ranxrwrl],rwrly[ranyrwrl]);
    if (panx > rwrlx[ranxrwrl] - 12 && pany > rwrly[ranyrwrl] - 12) {
      if (panx < rwrlx[ranxrwrl] + 12 && pany < rwrly[ranyrwrl] + 12) {
        sc = sc+10;
        scrw = scrw+1;
        ranxrwrl = ran.nextInt(3);
        ranyrwrl = ran.nextInt(8);

      }
    }

    Icon rwrr = new ImageIcon("rwrr.gif");
    rwrr.paintIcon(this,g,rwrrx[ranxrwrr],rwrry[ranyrwrr]);
    if (panx > rwrrx[ranxrwrr] - 12 && pany > rwrry[ranyrwrr] - 12) {
      if (panx < rwrrx[ranxrwrr] + 12 && pany < rwrry[ranyrwrr] + 12) {
        sc = sc+10;
        scrw = scrw+1;
        ranxrwrr = ran.nextInt(3);
        ranyrwrr = ran.nextInt(8);

      }
    }

    Icon gwrl = new ImageIcon("gwrl.gif");
    gwrl.paintIcon(this,g,gwrlx[ranxgwrl],gwrly[ranygwrl]);
    if (panx > gwrlx[ranxgwrl] - 12 && pany > gwrly[ranygwrl] - 12) {
      if (panx < gwrlx[ranxgwrl] + 12 && pany < gwrly[ranygwrl] + 12) {
        sc = sc+10;
        scgw = scgw+1;
        ranxgwrl = ran.nextInt(3);
        ranygwrl = ran.nextInt(8);

      }
    }

    Icon gwrr = new ImageIcon("gwrr.gif");
    gwrr.paintIcon(this,g,gwrrx[ranxgwrr],gwrry[ranygwrr]);
    if (panx > gwrrx[ranxgwrr] - 12 && pany > gwrry[ranygwrr] - 12) {
      if (panx < gwrrx[ranxgwrr] + 12 && pany < gwrry[ranygwrr] + 12) {
        sc = sc+10;
        scgw = scgw+1;
        ranxgwrr = ran.nextInt(3);
        ranygwrr = ran.nextInt(8);

      }
    }

    Icon ywrl = new ImageIcon("ywrl.gif");
    ywrl.paintIcon(this,g,ywrlx[ranxywrl],gwrly[ranyywrl]);
    if (panx > ywrlx[ranxywrl] - 12 && pany > ywrly[ranyywrl] - 12) {
      if (panx < ywrlx[ranxywrl] + 12 && pany < ywrly[ranyywrl] + 12) {
        sc = sc+10;
        scyw = scyw+1;
        ranxywrl = ran.nextInt(3);
        ranyywrl = ran.nextInt(8);

      }
    }

    Icon ywrr = new ImageIcon("ywrr.gif");
    ywrr.paintIcon(this,g,ywrrx[ranxywrr],ywrry[ranyywrr]);
    if (panx > ywrrx[ranxywrr] - 12 && pany > ywrry[ranyywrr] - 12) {
      if (panx < ywrrx[ranxywrr] + 12 && pany < ywrry[ranyywrr] + 12) {
        sc = sc+10;
        scyw = scyw+1;
        ranxywrr = ran.nextInt(3);
        ranyywrr = ran.nextInt(8);

      }
    }
    Icon bomb = new ImageIcon("bomb.png");
    bomb.paintIcon(this,g,bomx[ranxbom],bomy[ranybom]);
    if (panx > bomx[ranxbom] - 12 && pany > bomy[ranybom] - 12) {
      if (panx < bomx[ranxbom] + 12 && pany < bomy[ranybom] + 12) {
        sc = sc-100;
        scli = scli-1;
        ee = ee-1;
        ranxbom = ran.nextInt(3);
        ranybom = ran.nextInt(8);

      }
    }

    if (pany <= 0) {
      pany = 0;
    }
    if (pany > 340) {
      pany = 340;
    }

    if (scli == 0 && ee == 0) {
      ee = ee+1;
      end();
    }

  }

  public void actionPerformed(ActionEvent e){
      if (a) {
        if (up) {
          pany -= 5;
          repaint();
        }
        if (down) {
          pany += 5;
          repaint();
        }
        if (left) {
          panx = 160;
          repaint();
        }
        if (right) {
          panx = 200;
          repaint();
        }
      }
      if (s) {
        if (up) {
          pany -= 5;
          repaint();
        }
        if (down) {
          pany += 5;
          repaint();
        }
        if (left) {
          panx = 380;
          repaint();
        }
        if (right) {
          panx = 420;
          repaint();
        }
      }
      if (d) {
        if (up) {
          pany -= 5;
          repaint();
        }
        if (down) {
          pany += 5;
          repaint();
        }
        if (left) {
          panx = 600;
          repaint();
        }
        if (right) {
          panx = 640;
          repaint();
        }
      }
  }

  public void keyPressed(KeyEvent e){
    int key = e.getKeyCode();
    if (key == KeyEvent.VK_UP) {
      up = true;
      down = false;
    }
    if (key == KeyEvent.VK_DOWN) {
      up = false;
      down = true;
    }
    if (key == KeyEvent.VK_LEFT) {
      right = false;
      left = true;
    }
    if (key == KeyEvent.VK_RIGHT) {
      right = true;
      left = false;
    }
    if (key == KeyEvent.VK_A) {
      a = true;
      s = false;
      d = false;
    }
    if (key == KeyEvent.VK_S) {
      a = false;
      s = true;
      d = false;
    }
    if (key == KeyEvent.VK_D) {
      a = false;
      s = false;
      d = true;
    }
}

  public void keyTyped(KeyEvent e){}
  public void keyReleased(KeyEvent e){}

}
