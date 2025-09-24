public class BitManipulation {
    public static void OddEven(int n){
        int bitmask = 1;
        if((n&1) == 0){
            System.out.println("Number is Even.");
        }
        else{
            System.out.println("Number is Odd.");
        }
    }

    public static int getithBit(int n,int i){
        int bitmask = 1<<i;
        if((n&bitmask) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }

    public static int setithBit(int n, int i){
        int bitmask = 1<<i;
        return n|bitmask;
    }

    public static int clearithBit(int n,int i){
    int bitmask = ~(1<<i);
    return n&bitmask;
}

    public static int clearIBits(int n,int i){
        int bitmask= ~(0)<<i;
        return n&bitmask;    
    }

    public static int clearBitsinRange(int n, int i, int j){
        int a = ~(0)<<(j+1);
        int b = (1<<i)-1;
        int bitmask = a|b;
        return n&bitmask;
    }

    public static boolean isPoweroftwo(int n){
        return (n&(n-1))==0;
    }

    public static int countSetBits(int n){
        int count = 0;
        while(n>0){
            if((n&1)!=0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }

    public static int fastExpo(int a,int n){
        int ans =1;
        while(n>0){
            if((n&1)!=0){
                ans = ans*a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans;
    }

    public static void main(String[] args) {
        // System.out.println(5&6);
        // System.out.println(5|6);
        // System.out.println(5^6);
        // System.out.println(~5);
        // System.out.println(5<<2);
        // System.out.println(5>>2);
        // OddEven(3);
        // System.out.println(getithBit(10,2));
        // System.out.println(setithBit(10, 2));
        // System.out.println(clearithBit(10, 2));
        // System.out.println(clearIBits(15, 2));
        // System.out.println(clearBitsinRange(10, 2, 4));
        // System.out.println(isPoweroftwo(16));
        // System.out.println(countSetBits(15));
        System.out.println(fastExpo(3, 5));
    }
}
