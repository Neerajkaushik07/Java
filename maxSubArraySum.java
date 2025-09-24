public class maxSubArraySum {
    
    //This is Brute force method for maxSubArraySum
    // public static void maxSubarraySum1(int numbers[]){
    //     int currSum=0;
    //     int maxSum=Integer.MIN_VALUE;

    //     for(int i=0;i<numbers.length;i++){
    //         int start=i;
    //         for(int j=i;j<numbers.length;j++){
    //             int end=j;
    //             currSum=0;
    //             for(int k=start;k<=end;k++){
    //                 currSum+=numbers[k];
    //             }
    //             System.out.println(currSum);
    //             if(currSum>maxSum){
    //                 maxSum=currSum;
    //             }
    //         }
    //     }
    //     System.out.println("max sum = " + maxSum);
    // }

    //This is Prefix Sum method for maxSubArraySum
    public static void maxSubArraySum2(int numbers[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]= new int[numbers.length];
        prefix[0] = numbers[0];

        //Calculate Prefix Array
        for(int i=1;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                currSum = start == 0 ?prefix[end]:prefix[end]-prefix[start-1];
                if(currSum>maxSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("max sum = " + maxSum);
    }

    //This is Kadane's Algorithm for maxSubArraySum
    public static void maxSubArraySum3(int numbers[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++){
            cs = cs + numbers[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("Our MaxSubArraySum is : " + ms);

    }

    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        
        // maxSubarraySum1(numbers);
        // maxSubArraySum2(numbers);
        // maxSubArraySum3(numbers);
    }
}