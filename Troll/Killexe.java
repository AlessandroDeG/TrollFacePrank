

class Killexe{

public static void main(String args[]) throws InterruptedException{
		
String exe = args[0];	
		
while(true){
	
kill(exe);
}

}

 public static void kill(String string) {
    try {
      Runtime.getRuntime().exec("TASKKILL /F /IM " + string).waitFor();
    } catch (Exception e) {System.out.println(e);   }
  }

}