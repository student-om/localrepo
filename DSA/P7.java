import java.util.Arrays;

class SecondLargestElement {
    public static void main(String[] args) {
        int[] Arr = {12, 35, 1, 10, 34, 1}; 
               System.out.println(findSecondLargestDistinctElement(Arr));
    }
//1-1-10-12-34-35
    public static int findSecondLargestDistinctElement(int[] Arr) {
        if (Arr.length < 2) {
            return -1;
        }
        
        // Sort the array in ascending order
        Arrays.sort(Arr);// 1 1 10 12 34 35
        
        // Find the largest element->35
        int largest = Arr[Arr.length - 1];
        
        // Iterate from the second last element to find the second largest distinct element
        //34 to 1
        for (int i = Arr.length - 2; i >= 0; i--) {
            if (Arr[i] != largest) {
                return Arr[i];
            }
        }
        
        // If no second largest distinct element is found, return -1
        return -1;
    }
}

