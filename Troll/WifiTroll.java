class WifiTroll{

public static void main(String[] args){

String ip=args[0];

while(true){

try{
Runtime.getRuntime().exec("ping "+ip).waitFor();
}catch(Exception e){System.out.println(e);}


}





}






}