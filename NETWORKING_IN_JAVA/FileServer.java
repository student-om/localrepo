import java.io.*;
import java.net.*;
//que:Client will send file name to server, Server will check if file is present(exists()) , if it exists it will send Yes and will also send File Contents
class FileServer{
 public static void main(String args[])throws Exception{
 ServerSocket ss = new ServerSocket(8888);
 Socket s = ss.accept();
 System.out.println("Connection Established");
 BufferedReader kb = new BufferedReader(new InputStreamReader(s.getInputStream()));
  PrintStream ps = new PrintStream(s.getOutputStream());
 String fname = kb.readLine();
 boolean flag;
 FileReader fr = null;
 BufferedReader br = null;
 File f = new File(fname);
 
 if(f.exists()){
 System.out.println("true");
 flag = true;
 }
 else{
  System.out.println("false");
 flag = false;
 }
 
 if(flag == true){
 ps.println("Yes");
 }
 else{
 ps.println("No");
 }
 
 if(flag == true){
 fr = new FileReader(fname);
 br = new BufferedReader(fr);
 String str;
  while((str = br.readLine())!= null){
  ps.println(str );
  }
  fr.close();
  ps.close();
  br.close();
  ss.close();
  s.close();
  kb.close();
 
 }
 
 
 }

}
