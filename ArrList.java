import java.util.ArrayList;
/* OR
import java.util.*;
 */

public class ArrList {

    public static void MultidimensionalList() {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        mainList.add(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(8);
        list2.add(10);
        mainList.add(list2);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(3);
        list3.add(6);
        list3.add(9);
        list3.add(12);
        list3.add(15);
        mainList.add(list3);

        System.out.println(mainList);
    }

    // public static int storeWater(ArrayList<Integer> height) {
    // int maxWater = 0;
    // // brute force
    // for (int i = 0; i < height.size(); i++) {
    // for (int j = i + 1; j < height.size(); j++) {
    // int ht = Math.min(height.get(i), height.get(j));
    // int width = j - i;
    // int currWater = ht * width;
    // maxWater = Math.max(maxWater, currWater);
    // }
    // }
    // return maxWater;
    // }

    // 2 Pointer Approach
    public static int storeWater(ArrayList<Integer> height) {
        int maxWater = 0;
        int lp = 0;
        int rp = height.size() - 1;

        while (lp < rp) {
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int currWater = ht * width;
            maxWater = Math.max(maxWater, currWater);
            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;
    }

    // Brute Force
    public static boolean pairSum1(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    return true;
                }
            }
        }
        return false;
    }

    // 2 Pointer Approach
    public static boolean PairSum1(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size() - 1;

        while (lp != rp) {
            // case 1 lp+rp = target
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }
            if (list.get(lp) + list.get(rp) < target) {
                lp++;
            }
            if (list.get(lp) + list.get(rp) > target) {
                rp--;
            }
        }
        return false;
    }

    // 2 Pointer Approach
    public static boolean PairSum2(ArrayList<Integer> list, int target) {
        int bp = -1;
        int n = list.size();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }
        int lp = bp + 1;// smallest
        int rp = bp;// largest
        while (lp != rp) {
            // case 1
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }
            // case 2
            if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n;
            } else {
                // case 3
                rp = (n + rp - 1) % n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>();
        // // Operations on Array
        // // 1) Add
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        // System.out.println(list);
        // System.out.println(list.size());

        // // 2) GET
        // int index = list.get(3);
        // System.out.println(index);

        // // 3) Remove
        // list.remove(2);
        // System.out.println(list);

        // // 4) Set
        // list.set(3, 6);
        // System.out.println(list);

        // // 5) Contains
        // System.out.println(list.contains(10));

        // MultidimensionalList();

        ArrayList<Integer> height = new ArrayList<>();
        height.add(11);
        height.add(15);
        height.add(6);
        height.add(8);
        height.add(9);
        height.add(10);
        // System.out.println(storeWater(height));
        // System.out.println(pairSum1(height, 50));
        // System.out.println(PairSum1(height, 14));
        System.out.println(PairSum2(height, 16));
    }
}
