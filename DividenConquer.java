public class DividenConquer {

    public static void printArr(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int nums[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergeSort(nums, si, mid);
        mergeSort(nums, mid + 1, ei);
        merge(nums, si, mid, ei);
    }

    public static void merge(int nums[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;// left
        int j = mid + 1;// right
        int k = 0;// temp array
        while (i <= mid && j <= ei) {
            if (nums[i] < nums[j]) {
                temp[k] = nums[i];
                i++;
            } else {
                temp[k] = nums[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k] = nums[i++];
        }
        while (j <= ei) {
            temp[k++] = nums[j++];
        }
        for (k = 0, i = si; k < temp.length; k++, i++) {
            nums[i] = temp[k];
        }
    }

    public static void quickSort(int nums[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pindx = partition(nums, si, ei);
        quickSort(nums, si, pindx - 1);
        quickSort(nums, pindx + 1, ei);
    }

    public static int partition(int nums[], int si, int ei) {
        int pivot = nums[ei];
        int i = si - 1;
        for (int j = si; j < ei; j++) {
            if (nums[j] <= pivot) {
                i++;
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        nums[ei] = nums[i];
        nums[i] = temp;
        return i;
    }

    public static int search(int nums[], int tar, int si, int ei) {
        int mid = si + (ei - si) / 2;

        if (nums[mid] == tar) {
            return mid;
        }
        // L1
        if (nums[si] <= nums[mid]) {
            // left
            if (nums[si] <= tar && tar <= nums[mid]) {
                return search(nums, tar, si, mid - 1);
            }
            // right
            else {
                return search(nums, tar, mid + 1, ei);
            }
        }
        // L2
        else {
            // left
            if (nums[mid] <= tar && tar <= nums[ei]) {
                return search(nums, tar, mid + 1, ei);
            }
            // right
            else {
                return search(nums, tar, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        // int nums[] = { 6, 3, 9, 5, 2, 8 };
        // mergeSort(nums, 0, nums.length - 1);
        // quickSort(nums, 0, nums.length-1);
        // printArr(nums);
        int nums[] = { 4, 5, 6, 7, 0, 1, 2 };
        int tar = 0;
        int taridx = search(nums, tar, 0, nums.length - 1);
        System.out.println(taridx);
    }
}
