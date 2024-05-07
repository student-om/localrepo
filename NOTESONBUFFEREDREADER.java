//Java BufferedReader class is used to read the text from a character-based input stream. It can be used to read data line by line by readLine() method. It makes the performance fast. It inherits Reader class.

//declaration for BufferedReader class
//2 constructors

//i)BufferedReader(Reader rd):It is used to create a buffered character input stream that uses the default size for an input buffer.

//ii)BufferedReader(Reader rd, int size):It is used to create a buffered character input stream that uses the specified size for an input buffer.

//------------------------------------------------------------------------------------------------------------------------

//Methods:
//i)read():It is used for reading a single character.

//ii)int read(char[] cbuf, int off, int len):It is used for reading characters into a portion of an array.

//iii)void mark(int readAheadLimit):It is used for marking the present position in a stream.

//iv)void reset():It repositions the stream at a position the mark method was last called on this input stream.

//v)long skip(long n):It is used for skipping the characters.

//vi)boolean markSupported():It is used to test the input stream support for the mark and reset method.

//vii)void reset():It repositions the stream at a position the mark method was last called on this input stream.

//viii)void close():It closes the input stream and releases any of the system resources associated with the stream.

//----------------------------------------------------------------------------------------------------------------------

In this example, we are reading the data from the text file testout.txt using Java BufferedReader class.
package com.javatpoint;  
import java.io.*;  
public class BufferedReaderExample {  
    public static void main(String args[])throws Exception{    
          FileReader fr=new FileReader("D:\\testout.txt");    
          BufferedReader br=new BufferedReader(fr);    
  
          int i;    
          while((i=br.read())!=-1){  
          System.out.print((char)i);  
          }  
          br.close();    
          fr.close();    
    }    
} 

Output:

Welcome to javaTpoint.
//---------------------------------------------------------------------------------------------------------

Reading data from console by InputStreamReader and BufferedReader

In this example, we are connecting the BufferedReader stream with the InputStreamReader stream for reading the line by line data from the keyboard.

    package com.javatpoint;  
    import java.io.*;  
    public class BufferedReaderExample{    
    public static void main(String args[])throws Exception{             
        InputStreamReader r=new InputStreamReader(System.in);    
        BufferedReader br=new BufferedReader(r);            
        System.out.println("Enter your name");    
        String name=br.readLine();    
        System.out.println("Welcome "+name);    
    }    
    }  

Output:

Enter your name
Nakul Jain
Welcome Nakul Jain

//-----------------------------------------------------------------------------------------------------------


Another example of reading data from console until user writes stop

In this example, we are reading and printing the data until the user prints stop.

    package com.javatpoint;  
    import java.io.*;  
    public class BufferedReaderExample{    
    public static void main(String args[])throws Exception{             
         InputStreamReader r=new InputStreamReader(System.in);    
         BufferedReader br=new BufferedReader(r);           
         String name="";    
         while(!name.equals("stop")){    
          System.out.println("Enter data: ");    
          name=br.readLine();    
          System.out.println("data is: "+name);    
         }              
        br.close();    
        r.close();    
        }    
        }  

Output:

Enter data: Nakul
data is: Nakul
Enter data: 12
data is: 12
Enter data: stop
data is: stop


//------------------------------------------------------------------------------------------------------------

Java InputStreamReader

An InputStreamReader is a bridge from byte streams to character streams: It reads bytes and decodes them into characters using a specified charset. The charset that it uses may be specified by name or may be given explicitly, or the platform's default charset may be accepted.
Constructor
Constructor name 	                                    Description
InputStreamReader(InputStream in) 	It creates an InputStreamReader that uses the default charset.


Methods:


Modifier and Type 	                                                   Method 	Description
void 	close() 	                   It closes the stream and releases any system resources associated with it.
String 	getEncoding() 	                    It returns the name of the character encoding being used by this stream.
int 	read() 	                                                 It reads a single character.
int 	read(char[] cbuf, int offset, int length) 	             It reads characters into a portion of an array.
boolean 	ready() 	                                         It tells whether this stream is ready to be read.

Example

    public class InputStreamReaderExample {  
        public static void main(String[] args) {  
            try  {  
                InputStream stream = new FileInputStream("file.txt");  
                Reader reader = new InputStreamReader(stream);  
                int data = reader.read();  
                while (data != -1) {  
                    System.out.print((char) data);  
                    data = reader.read();  
                }  
            } catch (Exception e) {  
                e.printStackTrace();  
            }  
        }  
    }  

Output:

I love my country

The file.txt contains text "I love my country" the InputStreamReader 
reads Character by character from the file

//-----------------------------------------------------------------------------------------------------------------------
Java FileReader Class

Java FileReader class is used to read data from the file. It returns data in byte format like FileInputStream class.

It is character-oriented class which is used for file handling in java.
Java FileReader class declaration

Let's see the declaration for Java.io.FileReader class:

    public class FileReader extends InputStreamReader  

Constructors of FileReader class
Constructor 	Description
FileReader(String file) =>	It gets filename in string. It opens the given file in read mode. If file doesn't exist, it throws FileNotFoundException.
FileReader(File file) 	It gets filename in file instance. It opens the given file in read mode. If file doesn't exist, it throws FileNotFoundException.
Methods of FileReader class
Method 	Description


int read() 	It is used to return a character in ASCII form. It returns -1 at the end of file.
void close() 	It is used to close the FileReader class.


Java FileReader Example

In this example, we are reading the data from the text file testout.txt using Java FileReader class.

    package com.javatpoint;  
      
    import java.io.FileReader;  
    public class FileReaderExample {  
        public static void main(String args[])throws Exception{    
              FileReader fr=new FileReader("D:\\testout.txt");    
              int i;    
              while((i=fr.read())!=-1)    
              System.out.print((char)i);    
              fr.close();    
        }    
    }    

Here, we are assuming that you have following data in "testout.txt" file:

//-----------------------------------------------------------------------------------------------------------------


Java FileWriter Class

Java FileWriter class is used to write character-oriented data to a file. It is character-oriented class which is used for file handling in java.

Unlike FileOutputStream class, you don't need to convert string into byte array because it provides method to write string directly.
Java FileWriter class declaration

Let's see the declaration for Java.io.FileWriter class:

    public class FileWriter extends OutputStreamWriter  

Constructors of FileWriter class
Constructor 	Description
FileWriter(String file) 	Creates a new file. It gets file name in string.
FileWriter(File file) 	Creates a new file. It gets file name in File object.
Methods of FileWriter class
Method 	Description
void write(String text) 	It is used to write the string into FileWriter.
void write(char c) 	It is used to write the char into FileWriter.
void write(char[] c) 	It is used to write char array into FileWriter.
void flush() 	It is used to flushes the data of FileWriter.
void close() 	It is used to close the FileWriter.
void write(String,true): to write to a file without losing its past contents
Java FileWriter Example

In this example, we are writing the data in the file testout.txt using Java FileWriter class.

ADVERTISEMENT
ADVERTISEMENT

    package com.javatpoint;  
    import java.io.FileWriter;  
    public class FileWriterExample {  
        public static void main(String args[]){    
             try{    
               FileWriter fw=new FileWriter("D:\\testout.txt");    
               fw.write("Welcome to javaTpoint.");    
               fw.close();    
              }catch(Exception e){System.out.println(e);}    
              System.out.println("Success...");    
         }    
    }  

Output:

Success...

testout.txt:

Welcome to javaTpoint.






























































