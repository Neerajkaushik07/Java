public class largestNumber {

    public static int largest_number(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if (numbers[i]>largest) {
                largest = numbers[i];
            }
        }
        return largest;
    }


    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        int key = 10;

        System.out.println(" largest number is " + largest_number(numbers));
    }
}