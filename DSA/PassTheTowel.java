

   
    class Solution {

     public static int passThePillow(int n, int time) {
            int pointer = 1;
       
           

        
            while(time>0){
                if(pointer<=n){
                pointer++;
                time--;
               
                }
                if(pointer==n){
                    while(pointer>1){
                        if(time!=0){
                    pointer--;
                    time--;
                        }
                        else{
                            break;
                        }
                        
                    }
                }

            }


            

        return pointer;
        }
        public static void main(String[] args) {
           int a = passThePillow(3,2);
            System.out.println(a);

            String z = new String("oops");
            System.out.println(z);
            int start = 0;
            int end = z.length()-1;
            
               
                char[] s1 = z.toCharArray();
            while(start<end){
                char c1 = s1[start];
                s1[start]=s1[end];
                s1[end]=c1;
                start++;
                end--;
    
            }
            String bb = s1.toString();
           System.out.println(s1);
    
    }
}

