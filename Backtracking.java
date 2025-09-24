public class Backtracking {

    public static void changeArr(int arr[],int i,int value){
        if(i==arr.length){
            printArr(arr);
            return;
        }

        arr[i] = value;
        changeArr(arr, i+1, value+1);
        arr[i] = arr[i]-2;
    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print( arr[i] + " " );
        }
        System.out.println();
    }

    public static void findSubsets(String str, int i, String ans){
        if(i==str.length()){
            if(ans.length() == 0){
                System.out.println("Null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }
        //yes choice
        findSubsets(str, i+1, ans+str.charAt(i));
        //no choice
        findSubsets(str, i+1, ans);
    }

    public static void findPermutations(String str, String ans){
        //base case
        if(str.length() == 0) {
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            //abcde -> ab + de
            String NewStr = str.substring(0,i) + str.substring(i+1);
            findPermutations(NewStr, ans+curr);
        }
    }

    public static void main(String[] args) {
        // int arr[] = new int[5];
        // changeArr(arr, 0, 1);
        // printArr(arr);
        String str = "abc";
        // findSubsets(str, 0, "");
        findPermutations(str, "");
    }
}