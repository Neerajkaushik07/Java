public class Recursion {

    public static void printDec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printDec(n - 1);
    }

    public static void printInc(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        printInc(n - 1);
        System.out.println(n);
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int calcSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + calcSum(n - 1);
    }

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fibNm1 = fib(n - 1);
        int fibNm2 = fib(n - 2);
        return fibNm1 + fibNm2;
    }

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return isSorted(arr, i + 1);
    }

    public static int firstOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurence(arr, key, i + 1);
    }

    public static int lastOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isfound = lastOccurence(arr, key, i + 1);
        if (isfound == -1 && arr[i] == key) {
            return i;
        }
        return isfound;
    }

    public static int Power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * Power(x, n - 1);
    }

    public static int optimisedPower(int a, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = optimisedPower(a, n / 2);
        int halfPowerSq = halfPower * halfPower;
        if (n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;
    }

    public static int tilingProblem(int n) {
        if (n == 0 || n==1) {
            return 1;
        }
        int verticalTiles = tilingProblem(n - 1);
        int horizontalTiles = tilingProblem(n - 2);
        return verticalTiles + horizontalTiles;
    }

    public static int freindsPairingProblem(int n){
        if(n==1||n==2){
            return n;
        }
        //single
        int fnm1 = freindsPairingProblem(n-1);
        //pair
        int fnm2 = freindsPairingProblem(n-2);
        int pairWays = (n-1) * fnm2;

        int totalWays = fnm1 + pairWays;
        return totalWays;
    }

    public static void printBinStrings(int n, int lastPlace, String str){
        // if(last place == 0){
        //     printBinStrings(n-1, 0, str.append("0"));
        //     printBinStrings(n-1, 1, str.append("1"));
        // }
        // else{
        //      printBinStrings(n-1, 0, str.append("0"));
        // }
        if(n==0){
            System.out.print(str);
            return;
        }

        printBinStrings(n-1, 0, str+"0");
        if(lastPlace == 0){
            printBinStrings(n-1, 1, str+"1");
        }        
    }

    public static void main(String[] args) {
        // int n = 10;
        // printDec(n);
        // printInc(n);
        // System.out.println(factorial(5));
        // System.out.println(calcSum(10));
        // System.out.println(fib(7));
        // int arr[] = {5,5,5,5};
        // System.out.println(isSorted(arr, 0));
        // System.out.println(lastOccurence(arr, 5, 0));
        // System.out.println(Power(2, 10));
        // System.out.println(optimisedPower(2, 10));
        // System.out.println(tilingProblem(3));
        // System.out.println(freindsPairingProblem(3));
        printBinStrings(3, 0, new String(" "));

    }
}