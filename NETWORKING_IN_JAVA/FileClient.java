import java.io.*;
import java.net.*;

class FileClient{
 public static void main(String args[])throws Exception{
 Socket s  = new Socket("localhost",8888);
 BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

 BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));


 
 String str1 = kb.readLine();
  PrintStream ps = new PrintStream(s.getOutputStream());
  ps.println(str1);
   String str = br.readLine();
   
 if(str.equals("Yes")){
 
  while((str = br.readLine()) != null){
  System.out.println(str);
  }
  s.close();
  br.close();
  ps.close();
  kb.close();
 
 }
 else{
 System.out.println("File Not Found");
 }
 

 } 


}














































