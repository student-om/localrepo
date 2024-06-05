//to find the second largest element of the array
public class P6 {
   public static void main(String[] args) {
    P6 p = new P6();
    int[] arr = {1,2,3,4,5,6};
    p.findSecondLargest(arr);
   } 
   public void findSecondLargest(int[] arr){
   
    for(int i=0;i<(arr.length-1);i++){
        if(arr[i]>arr[i+1]){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }
    for(int i=0;i<(arr.length-2);i++){
        if(arr[i]>arr[i+1]){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
            
        }
        // else{
        //     return -1; for{10,10,10} no second largest element
        // }
    }
    
    System.out.println(arr[arr.length-2]);
   }
}
