// A Server Provides Service
// A Client recieves Service
// A Socket is a two end logical thing makes A connection between server and client
// Server just have to send the data to the socket and socket will take care to send data to the client
// there are 2 sockets between sender and reciever
// ServerSocket object is connected to 1 socket and Socket object is connected to 1 Socket...
import java.io.*;
import java.net.*;

//here Server will act as both reciever and sender 
class Client1{
 public static void main(String args[])throws Exception{
 Socket s = new Socket("localhost" , 5000);
 //localhost -> Client an Server file is on the same laptop(for diff laptop use ip Add of server laptop instead of localhost)
 // port number should also be same as ServerSocket object created in Server1.java
 DataOutputStream dos = new DataOutputStream(s.getOutputStream());
 BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
 //InputStreamReader constructor needs 1 inputstream object which is given by socket and outputstream object is also given by socket
 //to read data from keyboard
  BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
  
  String str,str1;
  while(!(str=kb.readLine()).equals("exit")){ // whwn exit is typed Sockets wii get closed
  dos.writeBytes(str+"\n");//send to server
  str1 = br.readLine();//recieve data from server
  System.out.println(str1);
  
  }
  //close connection
  dos.close();
  br.close();
  kb.close();
  s.close();
  
 
 
 }


}



