import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.border.TitledBorder;
public class egg extends Jpanel implements Runnable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    Thread th;
    Graphics2D g;
    int dx,dy;
    Bowl b= new Bowl();
    int NUM=5;
    Egg egg[]= new Egg[NUM];
    EggMover movers[]= new EggMover[NUM];
    boolean inside=false;
    Timer timer[] = new Timer[NUM];
    static int FWIDTH=500,FHEIGHT=400;
    int in=0;
    int speed=15;
    int lifes=10;
    static Color c1=Color.ORANGE,c2=Color.YELLOW;
   
}
