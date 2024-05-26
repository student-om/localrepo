import java.util.ArrayList;
import java.util.ListIterator;

class IteratorExample{
 public static void main(String args[]){
  ArrayList<Integer> arr = new ArrayList<>(); 
  arr.add(10);
  arr.add(20);
  arr.add(30);
  ListIterator it = arr.listIterator();
   while(it.hasNext()){
   System.out.println(it.next());
   }
   
   
   while(it.hasPrevious()){
   System.out.println(it.previous());
   }	
 }


}




