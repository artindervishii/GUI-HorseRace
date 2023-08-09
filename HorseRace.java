import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;


public class HorseRace {
    
    JFrame frame = new JFrame();

    
    JProgressBar h1 = new JProgressBar(0,100);
    JProgressBar h2 = new JProgressBar(0,100);
    JProgressBar h3 = new JProgressBar(0,100);
    JProgressBar h4 = new JProgressBar(0,100);
    JProgressBar h5 = new JProgressBar(0,100);
    JProgressBar h6 = new JProgressBar(0,100);
    JProgressBar h7 = new JProgressBar(0,100);
    JProgressBar h8 = new JProgressBar(0,100);

    
    JLabel msg = new JLabel("");
    JLabel msg2 = new JLabel("");
    
    private static int kaliFitues=0;
    private static boolean fituesi=false;
    private static boolean filloGarenButtoni=false; 
    private static boolean perseritGarenButtoni=false;

    

    
    
    public void finish(int i){


        msg.setVisible(true);
        msg2.setVisible(true);
        msg2.setText("===== FINISH =====");
        msg.setText("Kali " + kaliFitues + " e Fiton garen , per te filluar garen perseri kliko perserit garen" );
        
        if(i == 100){
            fituesi=true;
            System.out.println("======= FINISH =======");
            System.out.println("\"Kali \" + kaliFitues + \" e Fiton garen , per te filluar garen perseri kliko perserit garen");
        }
            
        frame.getContentPane().add(msg);
        frame.getContentPane().add(msg2);
    }
    
    public static void main(String [] args){        

        EventQueue.invokeLater(new Runnable(){
        
        public void run(){
        
            try{
                HorseRace gara = new HorseRace();
                gara.frame.setVisible(true);
            }catch(Exception e){
                e.printStackTrace();
            }
        
        }
    
  });     
}
    
     public HorseRace(){

        metodaGUI();
        buttonat();
        
    }    
    
    
    public void metodaGUI(){  
        

        msg = new JLabel();

        msg2 = new JLabel();

        msg.setFont(new Font("MV Boli",Font.PLAIN,16));
        msg.setForeground(Color.green);

        msg2.setFont(new Font("MV Boli",Font.PLAIN,16));
        msg2.setForeground(Color.green);
        

        ImageIcon image = new ImageIcon("pics/Blue.png");
       
        
        frame = new JFrame();
        frame.setBounds(100,100,598,430);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setTitle("Gara me kuaj");
        frame.getContentPane().setBackground(Color.darkGray);
        frame.setIconImage(image.getImage());
        

        //frame.setLayout(new GridLayout(8,2,10,10));
        //frame.setLayout(new FlowLayout(FlowLayout.CENTER,45,60));
    
        h1.setStringPainted(true);
        h1.setForeground(Color.RED);
        h1.setBounds(160,110,259,18);
        frame.getContentPane().add(h1);
        
        h2.setStringPainted(true);
        h2.setForeground(Color.BLUE);
        h2.setBounds(160,140,259,18);
        frame.getContentPane().add(h2);
        
        h3.setStringPainted(true);
        h3.setForeground(Color.YELLOW);
        h3.setBounds(160,170,259,18);
        frame.getContentPane().add(h3);
        
        h4.setStringPainted(true);
        h4.setForeground(Color.GRAY);
        h4.setBounds(160,200,259,18);
        frame.getContentPane().add(h4);
        
        h5.setStringPainted(true);
        h5.setForeground(Color.ORANGE);
        h5.setBounds(160,230,259,18);
        frame.getContentPane().add(h5);

        h6.setStringPainted(true);
        h6.setForeground(Color.black);
        h6.setBounds(160,260,259,18);
        frame.getContentPane().add(h6);

        h7.setStringPainted(true);
        h7.setForeground(Color.WHITE);
        h7.setBounds(160,290,259,18);
        frame.getContentPane().add(h7);

        h8.setStringPainted(true);
        h8.setForeground(Color.pink);
        h8.setBounds(160,320,259,18);
        frame.getContentPane().add(h8);

        msg.setBounds(25,70,600,16);
        msg.setVisible(false);
        frame.getContentPane().add(msg2);
        
        msg2.setBounds(205,350,600,16);
        msg2.setVisible(false);
        frame.getContentPane().add(msg);
        
    }


    public void buttonat(){

        JButton kali1 = new JButton("1");

        // ImageIcon k1= new ImageIcon("pics/Red.png");
        // kali1.setIcon(k1);

        kali1.setBounds(100,110,40,20);
        frame.getContentPane().add(kali1);
        kali1.setBackground(Color.RED);
        kali1.setFont(new Font("MV Boli",Font.PLAIN,15));
        kali1.setBorder(BorderFactory.createEtchedBorder());
        frame.add(kali1);

        JButton kali2 = new JButton("2");
        kali2.setBounds(100,140,40,20);
        frame.getContentPane().add(kali2);
        kali2.setBackground(Color.BLUE);
        kali2.setFont(new Font("MV Boli",Font.PLAIN,15));
        kali2.setBorder(BorderFactory.createEtchedBorder());

        JButton kali3 = new JButton("3");
        kali3.setBounds(100,170,40,20);
        frame.getContentPane().add(kali3);
        kali3.setBackground(Color.YELLOW);
        kali3.setFont(new Font("MV Boli",Font.PLAIN,15));
        kali3.setBorder(BorderFactory.createEtchedBorder());

        JButton kali4 = new JButton("4");
        kali4.setBounds(100,200,40,20);
        frame.getContentPane().add(kali4);
        kali4.setBackground(Color.GRAY);
        kali4.setFont(new Font("MV Boli",Font.PLAIN,15));
        kali4.setBorder(BorderFactory.createEtchedBorder());

        JButton kali5 = new JButton("5");
        kali5.setBounds(100,230,40,20);
        frame.getContentPane().add(kali5);
        kali5.setBackground(Color.ORANGE);
        kali5.setFont(new Font("MV Boli",Font.PLAIN,15));
        kali5.setBorder(BorderFactory.createEtchedBorder());

        JButton kali6 = new JButton("6");
        kali6.setBounds(100,260,40,20);
        frame.getContentPane().add(kali6);
        kali6.setBackground(Color.BLACK);
        kali6.setFont(new Font("MV Boli",Font.PLAIN,15));
        kali6.setBorder(BorderFactory.createEtchedBorder());

        JButton kali7 = new JButton("7");
        kali7.setBounds(100,290,40,20);
        frame.getContentPane().add(kali7);
        kali7.setBackground(Color.WHITE);
        kali7.setFont(new Font("MV Boli",Font.PLAIN,15));
        kali7.setBorder(BorderFactory.createEtchedBorder());

        JButton kali8 = new JButton("8");
        kali8.setBounds(100,320,40,20);
        frame.getContentPane().add(kali8);
        kali8.setBackground(Color.PINK);
        kali8.setFont(new Font("MV Boli",Font.PLAIN,15));
        kali8.setBorder(BorderFactory.createEtchedBorder());


        

        JButton btnFillo = new JButton("Fillo Garen");
        ImageIcon startIcon = new ImageIcon("pics/Startt.png");
        btnFillo.addActionListener(new FilloGaren());
        btnFillo.setBounds(0,10,170,40);
        frame.getContentPane().add(btnFillo);
        btnFillo.setFont(new Font("MV Boli",Font.PLAIN,19));
        //btnFillo.setIcon(startIcon);
        //btnFillo.setIconTextGap(-15);
        btnFillo.setBackground(Color.green);
        btnFillo.setBorder(BorderFactory.createEtchedBorder());

        
        
        JButton btnPerserit = new JButton("Perserit Garen");
        btnPerserit.addActionListener(new PerseritGaren());
        btnPerserit.setBounds(205,10,170,40);
        frame.getContentPane().add(btnPerserit);
        btnPerserit.setBackground(Color.blue);
        btnPerserit.setFont(new Font("MV Boli",Font.PLAIN,19));
        btnPerserit.setBorder(BorderFactory.createEtchedBorder());
        
        JButton btnQuit = new JButton("Lere Lojen");
        btnQuit.addActionListener(new QuitProgram());
        btnQuit.setBounds(410,10,170,40);
        frame.getContentPane().add(btnQuit);
        btnQuit.setBackground(Color.red);
        btnQuit.setFont(new Font("MV Boli",Font.PLAIN,19));
        btnQuit.setBorder(BorderFactory.createEtchedBorder());
    }
    
    
    public class FilloGaren implements ActionListener{
        
        public void actionPerformed(ActionEvent a){
        
            if(!filloGarenButtoni){
                
                perseritGarenButtoni=false;
                filloGarenButtoni=true;
                
                
                H1 h1 = new H1();
                h1.start();
        
                H2 h2 = new H2();
                h2.start();
                
                H3 h3 = new H3();
                h3.start();
                
                H4 h4 = new H4();
                h4.start();
                
                H5 h5 = new H5();
                h5.start();

                H6 h6 = new H6();
                h6.start();

                H7 h7 = new H7();
                h7.start();

                H8 h8 = new H8();
                h8.start();
       
            }
        }
    }
    
    
    public  class PerseritGaren implements ActionListener{
        
        public void actionPerformed(ActionEvent a){
        
            if(!perseritGarenButtoni){
                msg.setVisible(false);
                msg2.setVisible(false);
                
                perseritGarenButtoni=true;
                filloGarenButtoni=false;
                fituesi=false;
                
                H1 h1 = new H1();
                h1.reset();
                
                H2 h2 = new H2();
                h2.reset();
                
                H3 h3 = new H3();
                h3.reset();
                
                H4 h4 = new H4();
                h4.reset();
                
                H5 h5 = new H5();
                h5.reset();

                H6 h6 = new H6();
                h6.reset();

                H7 h7 = new H7();
                h7.reset();

                H8 h8 = new H8();
                h8.reset();
       
            }
        }
    }
    
    public class QuitProgram implements ActionListener{
        
        public void actionPerformed(ActionEvent a){
        
            System.exit(0);
        }
    
    }
    
    public class H1 extends Thread{
        
        public void reset(){
            h1.setValue(0);
            // if(h1.getString() == "----  FINISH  ----"){

            //     h1.setValue(0);

            // }
        }
        
        public void run(){
            
            for(int i = 0; i<101;i++){
                if(fituesi){
                    break;
                }
                h1.setValue(i);

                if(i==100){
                    kaliFitues=1;
                    finish(i);
                    // h1.setString("----  FINISH  ----");
                    // h1.setFont(new Font("MV Boli",Font.BOLD,17));
                
                }

                try{

                    Random r=new Random();
                    Thread.sleep(r.nextInt(150));

                }catch(InterruptedException er){
                    er.printStackTrace();
                }
            }
        }
    }
    
    
    
    public class H2 extends Thread{
        
        public void reset(){

            h2.setValue(0);
            // if(h2.getString() == "----  FINISH  ----"){

            //     h2.setValue(0);

            // }
           
          
            
        }
        
        public void run(){
            
            for(int i = 0; i<101;i++){
                if(fituesi){
                    break;
                }
                h2.setValue(i);
              

                if(i==100){
                    kaliFitues=2;
                    finish(i);
                    // h2.setString("----  FINISH  ----");
                    // h2.setFont(new Font("MV Boli",Font.BOLD,17));
                }

                try{

                    Random r=new Random();
                    Thread.sleep(r.nextInt(150));

                }catch(InterruptedException er){
                    er.printStackTrace();
                }
            }
        }
    }
    
    
    
    public class H3 extends Thread{
        
        public void reset(){
            h3.setValue(0);
           

            // if(h3.getString() == "----  FINISH  ----"){

            //     h3.setValue(0);

            // }
        }
        
        public void run(){
            
            for(int i = 0; i<101;i++){
                if(fituesi){
                    break;
                }
                h3.setValue(i);
               

                if(i==100){
                    kaliFitues=3;
                    finish(i);
                    // h3.setString("----  FINISH  ----");
                    // h3.setFont(new Font("MV Boli",Font.BOLD,17));
                   
                }

                try{

                    Random r=new Random();
                    Thread.sleep(r.nextInt(150));

                }catch(InterruptedException er){
                    er.printStackTrace();
                }
            }
        }
    }
    
    
    public class H4 extends Thread{
        
        public void reset(){
            h4.setValue(0);
            h4.repaint();

            // if(h4.getString() == "----  FINISH  ----"){

            //     h4.setValue(0);

            // }
            
        }
        
        public void run(){
            
            for(int i = 0; i<101;i++){
                if(fituesi){
                    break;
                }
                h4.setValue(i);
                h4.repaint();

                if(i==100){
                    kaliFitues=4;
                    finish(i);
                    // h4.setString("----  FINISH  ----");
                    // h4.setFont(new Font("MV Boli",Font.BOLD,17));

                }

                try{

                    Random r=new Random();
                    Thread.sleep(r.nextInt(150));

                }catch(InterruptedException er){
                    er.printStackTrace();
                }
            }
        }
    }
    
    
    public class H5 extends Thread{
        
        public void reset(){
            h5.setValue(0);
            h5.repaint();

            // if(h5.getString() == "----  FINISH  ----"){

            //     h5.setString("");

            // }
        }
        
        public void run(){
            
            for(int i = 0; i<101;i++){
                if(fituesi){
                    break;
                }
                h5.setValue(i);
                h5.repaint();

                if(i==100){
                    kaliFitues=5;
                    finish(i);
                    // h5.setString("----FINISH----");
                    // h5.setFont(new Font("MV Boli",Font.BOLD,17));
                }

                try{
                    Random r=new Random();
                    Thread.sleep(r.nextInt(150));

                }catch(InterruptedException er){
                    er.printStackTrace();
                }
            }
        }
    }


    public class H6 extends Thread{
        
        public void reset(){
            h6.setValue(0);
            h6.repaint();

            // if(h5.getString() == "----  FINISH  ----"){

            //     h5.setString("");

            // }
        }
        
        public void run(){
            
            for(int i = 0; i<101;i++){
                if(fituesi){
                    break;
                }
                h6.setValue(i);
                h6.repaint();

                if(i==100){
                    kaliFitues=6;
                    finish(i);
                    // h5.setString("----FINISH----");
                    // h5.setFont(new Font("MV Boli",Font.BOLD,17));
                }

                try{

                    Random r=new Random();
                    Thread.sleep(r.nextInt(150));

                }catch(InterruptedException er){
                    er.printStackTrace();
                }
            }
        }
    }

    public class H7 extends Thread{
        
        public void reset(){
            h7.setValue(0);
            h7.repaint();

            // if(h5.getString() == "----  FINISH  ----"){

            //     h5.setString("");

            // }
        }
        
        public void run(){
            
            for(int i = 0; i<101;i++){
                if(fituesi ){
                    break;
                }
                h7.setValue(i);
                h7.repaint();

                if(i==100){
                    kaliFitues=7;
                    finish(i);
                    // h5.setString("----FINISH----");
                    // h5.setFont(new Font("MV Boli",Font.BOLD,17));
                }

                try{

                    Random r=new Random();
                    Thread.sleep(r.nextInt(150));

                }catch(InterruptedException er){
                    er.printStackTrace();
                }
            }
        }
    }


    public class H8 extends Thread{
        
        public void reset(){
            h8.setValue(0);
            h8.repaint();

            // if(h5.getString() == "----  FINISH  ----"){

            //     h5.setString("");

            // }
        }
        
        public void run(){
            
            for(int i = 0; i<101;i++){
                if(fituesi){
                    break;
                }
                h8.setValue(i);
                h8.repaint();

                if(i==100){
                    kaliFitues=8;
                    finish(i);
                    // h5.setString("----FINISH----");
                    // h5.setFont(new Font("MV Boli",Font.BOLD,17));
                }

                try{

                    Random r=new Random();
                    Thread.sleep(r.nextInt(150));

                }catch(InterruptedException er){
                    er.printStackTrace();
                }
            }
        }
    }
    



    
}

