//Q1190 --> all the testcases are accepted but still we was not able to submit.
//must so question on stack.
import java.util.Stack;

class Q1190{
    public static void main(String args[]){
        Solution s = new Solution();

        String a = s.reverseParentheses( "(ed(et(oc))el)");
        System.out.println(a);
        // String b = "(uevoli)";
        // System.out.println(b.substring(3, 7));
        // System.out.println(b.substring(b.lastIndexOf("(")+1, b.indexOf(")")));

    }

    //correct code

    public String reverseParentheses(String s) {
        Stack<Integer> openParenthesesIndices = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (char currentChar : s.toCharArray()) {
            if (currentChar == '(') {
                // Store the current length as the start index for future reversal
                openParenthesesIndices.push(result.length());
            } else if (currentChar == ')') {
                int start = openParenthesesIndices.pop();
                // Reverse the substring between the matching parentheses
                reverse(result, start, result.length() - 1);
            } else {                                                                    
                // Append non-parenthesis characters to the processed string
                result.append(currentChar);
            }
        }

        return result.toString();
    }

    private void reverse(StringBuilder sb, int start, int end) {
        while (start < end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start++, sb.charAt(end));
            sb.setCharAt(end--, temp);
        }
    }    

    // public static String reverseParentheses(String s) {
    //     StringBuffer sb = new StringBuffer(s);
    //     int k = giveCounter(s);
    //     while(k>0){
            
    //         int index = sb.lastIndexOf("(");
    //         int index1 = sb.indexOf(")");

    //         String s1 = sb.substring(index+1, index1);
            
    //         sb.replace(index+1,index1,reverse(s1));
            
    //         sb.deleteCharAt(sb.lastIndexOf("("));
    //         sb.deleteCharAt(sb.indexOf(")"));
    //         k--;
            

    //     }
        

        

    //    return sb.toString();
        
        
    // }

    // public static String reverse(String s){
    //     StringBuffer sb = new StringBuffer(s);
    //     return sb.reverse().toString();
    // }

    // public static int giveCounter(String s){
    //     int k=0;
         
    //     for(int i=0;i<s.length();i++){
    //         if(s.charAt(i)=='('){
    //             k++;
    //         }
    //     }
    //     return k;
    // }
}