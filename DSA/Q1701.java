/* accepted -> but was not able to submit 32/28 cases pass hogye the.
 * class Solution {
    public double averageWaitingTime(int[][] customers) {
        int average = 0;
         int arrivalTime = 0;
        int waitingTime = 0;
       int tracker = 0;

       average = tracker-arrivalTime;
       
        
        for(int i=0;i<customers.length;i++){
             
           arrivalTime = customers[i][0];
           waitingTime = customers[i][1];
           if(tracker>arrivalTime){
           int totalTime = tracker+waitingTime-arrivalTime;
           average+=totalTime;
           tracker = tracker + waitingTime;
           }
           else{
            int k = arrivalTime + waitingTime-arrivalTime;
            tracker = arrivalTime+waitingTime;
            average+=k;
           }
        }
        return (double)average/(double)customers.length;
    }
}
 * 
 */
public class Q1701 {
    

        public double averageWaitingTime(int[][] customers) {
            int nextIdleTime = 0;
            long netWaitTime = 0;
    
            for (int i = 0; i < customers.length; i++) {
                // The next idle time for the chef is given by the time of delivery
                // of current customer's order.
                nextIdleTime = Math.max(customers[i][0], nextIdleTime) +
                customers[i][1];
    
                // The wait time for the current customer is the difference between
                // his delivery time and arrival time.
                netWaitTime += nextIdleTime - customers[i][0];
            }
    
            // Divide by total customers to get average.
            double averageWaitTime = (double) netWaitTime / customers.length;
            return averageWaitTime;
        }
    }

