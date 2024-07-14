import java.util.HashMap;
import java.util.Stack;

public class Q726 {
    public static void main(String args[]){
        
        String s = "H2(SO)4";
        int index=0;
        int index1 = 0;
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        Stack<Character> stack = new Stack<Character>();
        Object o = 32;
        System.out.println(o.getClass().getName());
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                index = i;
            }
            else if(s.charAt(i)==')' && (!stack.isEmpty()) && !hm.containsValue(i)){
               int z = Integer.parseInt(s.charAt(i+1)+"");

            }
            else{
                stack.push(s.charAt(i));
            }
        }
    }
}
