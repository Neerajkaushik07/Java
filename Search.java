public class Search {
    
    public static int linear_search (int numbers[],int key){
        for(int i=0;i<=numbers.length;i++){
            if (numbers[i]==key) {
                return i;                
            }
        }
        return -1;
    }

    public static int binary_search(int numbers[],int key){
        int start = 0;
        int end = numbers.length-1;
        
        while(start<=end) {
        int mid = (start + end)/2;
           if(numbers[mid]==key){
            return mid;
           }
           else if(numbers[mid]>key){
            end = mid-1;
           }
           else{
            start=mid+1;
           }            
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        int key = 10;
                
        int index = linear_search(numbers, key);         
        if (index == -1) {                               
            System.out.println(" Key is not found ");  
        }                                                
        else{                                            
            System.out.println(" Key found at " + index);
        }                                                

        int indx = binary_search(numbers, key);         
        if (index == -1) {                               
            System.out.println(" Key is not found ");  
        }                                                
        else{                                            
            System.out.println(" Key found at " + index);
        }                                                
        
    }
}
