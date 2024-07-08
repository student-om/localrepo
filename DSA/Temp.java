import java.util.List;
//leetcode Q2
class ListNode {
   
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    ListNode head=null;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuffer b1 = new StringBuffer();
      
        int a = giveNumber(l1);
       
        int[] a1 = new int[a];
        ListNode temp = l1;
        for(int i=0;i<a1.length;i++){
            a1[i] = temp.val;
            if (temp!=null){
            temp = temp.next;
            }
        }
        

        for(int i=0;i<a1.length;i++){
            b1.append(a1[i]+"");
        }
        b1.reverse();
        
        int n1 = Integer.parseInt(b1.toString());
        
        

StringBuffer b2 = new StringBuffer();
    int b = giveNumber(l2);
        int[] a2 = new int[b];
        ListNode temp1 = l2;
        for(int i=0;i<a2.length;i++){
            a2[i] = temp1.val;
            if (temp1!=null){
            temp1 = temp1.next;
            }
        }

         for(int i=0;i<a2.length;i++){
            b2.append(a2[i]+"");
        }
        b2.reverse();
        int n2 = Integer.parseInt(b2.toString());

        int n3 =  n1+ n2;
       
        StringBuffer sb = new StringBuffer();
        sb.append(n3);
       
        int n4 = Integer.parseInt(sb.toString());
       
        int n5 = n4;
        ListNode list = new ListNode();
        if(n5==0){
            this.addToList(n5);
        }

        while(n5>0){
            
            this.addToList(n5%10);
          
            n5=n5/10;
        }

        

        return head;

       







        
    }
    public static int giveNumber(ListNode n){
        int counter = 0;
        while(n!=null){
            counter ++;
    n=n.next;
        }

        return counter;

    }

    public static int compare(int a , int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }

    public static int countDigits(int a){
        int counter = 0;
        while(a>0){
            a/=10;
            counter++;
        }
        return counter;
    }

    public  void addToList(int a){
       ListNode list = new ListNode();
      
       list.val = a ;
       list.next = null;

       if(this.head == null){
        this.head = list;
       } 
       else{
        ListNode temp = this.head;
        while(temp.next!=null){
           
            temp= temp.next;
        }
        
        temp.next = list;
       }
    }

    public static void main(String args[]){
       ListNode n1 = new ListNode();
       
        Solution s = new Solution();
        s.addToList(0);
       

        ListNode v = s.head;

        Solution s2 = new Solution();
        s2.addToList(0);
        
        ListNode v1 = s2.head;

        Solution s3 = new Solution();
        ListNode z4 = s3.addTwoNumbers(v,v1);
       
        

    }

}
