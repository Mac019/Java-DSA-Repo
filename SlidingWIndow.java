public class SlidingWIndow {
    

    static int slidingWindowMax( int arr []   , int k ){

        int windowSum = 0 ; 
        int maxWindowSum = 0 ; 
        int start = 0 ; 
        for(int end = 0  ; end < arr.length ; end ++){
            windowSum = windowSum + arr[end];

            if( end - start + 1 /*I assuem to overcome the 0 index right */ == k ) {
                 maxWindowSum = Math.max(maxWindowSum, windowSum);
                 windowSum = windowSum - arr[start];
                
                start++;
            }
        }

        return maxWindowSum;
    }

    static int slidingWindowMin( int arr []   , int k ){

        int windowSum = 0 ; 
        int minWindowSum = Integer.MAX_VALUE ; 
        int start = 0 ; 
        for(int end = 0  ; end < arr.length ; end ++){
            windowSum = windowSum + arr[end];

            if( end - start + 1 /*I assuem to overcome the 0 index right */ == k ) {
                 minWindowSum = Math.min(minWindowSum, windowSum);
                 windowSum = windowSum - arr[start];
                
                start++;
            }
        }

        return minWindowSum;
    }
    public static void main(String[] args) {
        
        int arr [] = {  2 , 9  , 4 , 7 , 8 };
        int k = 3;

       int result =  slidingWindowMax(arr, k);
       int result2 =  slidingWindowMin(arr, k);
       System.out.println("The maximum Sum is "+ result);
       System.out.println("The minimum  Sum is "+ result2);
    }
}
