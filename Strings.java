import java.util.*;
public class Strings {

    public static boolean isPalindrome(String str){
        for(int i=0; i<str.length()/2; i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }

    public static float getPath(String path){
        int x = 0 ,y = 0;
        for(int i=0; i<path.length(); i++){
            char dir = path.charAt(i);
            if(dir == 'N'){
                y++;
            }
            else if(dir == 'S'){
                y--;
            }
            else if(dir == 'E'){
                x++;
            }
            else{
                x--;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float) Math.sqrt(x2+y2);
    }

    public static String substring(String str,int si, int ei){
        String substr = "";
        for(int i=si; i<=ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }

    public static String Compress(String str){
        String newstr = " ";
        for(int i=0; i<str.length(); i++){
            Integer count =1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newstr += str.charAt(i);
            if(count>1){
                newstr += count.toString();
            }
        }
        return newstr;
    }

    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder(" ");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // String str = "racecar";
        // System.out.println(isPalindrome(str));
        // String path = "WNEENESENNN";
        // System.out.println(getPath(path));
        // String str = "Hello";
        // System.out.println(substring(str, 0, 2));

        // String fruits[] = {"Apple","Mango","Banana"};
        // String largest = fruits[0];
        // for(int i=1; i<fruits.length; i++){
        //     if(largest.compareTo(fruits[i])<0){
        //         largest = fruits[i];
        //     }
        // }
        // System.out.println(largest);

        // StringBuilder sb = new StringBuilder("hello");
        // for(char ch='a'; ch<='z'; ch++){
        //     sb.append(ch);
        // }
        // System.out.println(sb);

        // String str = "aaabbbcccddd";
        // System.out.println(Compress(str));

        String str = "Hi i am jarvis";
        System.out.println(toUpperCase(str));

    }
}