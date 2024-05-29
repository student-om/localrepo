// A Server Provides Service
// A Client recieves Service
// A Socket is a two end logical thing makes A connection between server and client
// Server just have to send the data to the socket and socket will take care to send data to the client
import java.io.*;
import java.net.*;

//here Server will act as both reciever and sender 
class Server1{
 public static void main(String args[])throws Exception{
 ServerSocket ss = new ServerSocket(5000);
 Socket s = ss.accept();//make server wait until client makes request
 // accept() is a method of ServerSocket class which returns Socket object;
 System.out.println("Connection Established");
 PrintStream ps = new PrintStream(s.getOutputStream());//socket par ayi hui OutputStream do
 //here i connected OutputStream with Socket 
 // i used PrintStream because OutputStream does not contains methods which sends data to Client or Server
 //getOutputStream() is method of Socket Class which returns OutputStream object
 //we use OutputStream inside PrintStream constructor to sent data using println(...) or print(...) method
 //or instead you can use DataOutputStream Class instead of PrintStream and use method named writeBytes(...) 
 BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
  //getOutputStream() is method of Socket Class which returns InputStream object to read data from Client
 BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));//to send data connected to keyboard
 
  while(true){ //server executes continuousely
  String str,str1;
   
   while((str = br.readLine()) != null){ //jabtak new line pe Enter dabaoge tabtak
   str1 = kb.readLine();
   ps.println(str1);//sent data from server to client
   System.out.println(str);//print data recieved from client
   
  }
  ps.close(); //whenever server sends stream which sends data will get closed
  ss.close(); //whenever server recieves null streams which recieves data will get closed
  s.close();
  kb.close();
  br.close();
  System.exit(0); // terminate application
  }//end of while
  
 }


}


//not imp Just for Knowledge
// agar tum ps.close() line 41 pe likhoge to error ayega as unreachable statement karke b/c wo infinite loop hai aur uske niche wale statements execute hi nahi honge 


