import java.io.*;
class FileClass{
	public static void main(String args[]){
	File f = new File("t.txt");
	System.out.println(f.getName());
	System.out.println(f.getParent());
	System.out.println(f.getPath());
	System.out.println(f.isDirectory());
	System.out.println(f.length());
	System.out.println(f.mkdir());
	f.delete();//t.txt gets deleted(if it is craeted using createNewFile)
	}
}
