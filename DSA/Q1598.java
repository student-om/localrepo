//one of the most easiest question of the leetcode.
public class Q1598 {
    public int minOperations(String[] logs) {
        int counter = 0;
        for(int i=0;i<logs.length;i++){
         switch(logs[i]){
             case "../":
             if(counter!=0){
                 counter--;
             }
             break;
 
             case "./":
             break;
 
              default:
             counter++;
         }  
        }
        return counter;
    }
}
