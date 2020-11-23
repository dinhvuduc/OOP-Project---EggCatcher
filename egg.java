import java.awt.*;
import java.awt.event.*;
import java.lang.annotation.Target;
import java.util.Random;
import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.border.StrokeBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.MouseInputAdapter;
import javax.swing.event.MouseInputListener;

import org.w3c.dom.events.MouseEvent;
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


    public Eggs(){

        b.set.Mx(30);
        b.set.My(200);
        setOpaque(false);

        try{
            setBorder(BorderFactory.createTitledBorder(null, "", TitledBorder.CENTER,TitledBorder.ABOVE_TOP,new Font("Tahoma",1,24), new Color (200, 0 , 0 )));
            for (LookAndFeelInfo inf: UIManager.getInstalledLookAndFeels()){
                if (inf.getName().equals("Nimbus")){
                    UIManager.setLookAndFeel(inf.getClassName());
                    break;
                }
            }
        }


        catch(Exception e){
            System.out.println(e);
        }
        //Listener Starts//

        for(int i = 0; i < egg.length; i++ ){
            egg[i]  =   new Egg();
            egg[i].setMy(30);
            egg[i].reset();
        
    }
        for(in = 0; in < egg.length; ++in){
            movers[in]= new EggMover(egg[in], b);
            movers[in].setInitialDelay((in + 1) * 1500);
            movers[in].move();

        }

        MouseInputListener ml = new MouseAdapter(){
            public void mousePressed(MouseEvent me){
                dx= (int)me.getPoint().getX();
                if(b.contains(me.getPoint())){
                    inside = true;
                }
            }
            public void mouseReleased(MouseEvent me){ inside = false;}
        };

        addMouseListener(ml);

        MouseMotionListener mll = new MouseAdapter(){
            public void mouseDragged( MouseEvent me){
                if (inside == true){
                    b.setMx( int)me.getPoint().getX();
                }
            }
        };

        addMouseListener(mll);

        th= new Thread(Target this);
        th.start();
    }

    

}
