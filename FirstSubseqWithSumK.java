import java.util.ArrayList;

public class FirstSubseqWithSumK {
    static boolean firstSubseqWithSumK(int index, int[] arr, ArrayList<Integer> ds, int target, int sum) {
        if (index == arr.length) {
            if (sum == target) {
                System.out.println(ds);
                return true;
            }
            return false;
        }
        // Pick the element
        ds.add(arr[index]);
        sum += arr[index];
        if (firstSubseqWithSumK(index +1, arr, ds, target, sum) == true)
            return true;
        // Not pick the element
        ds.remove(ds.size() -1);
        sum -= arr[index];
        if (firstSubseqWithSumK(index +1, arr, ds, target, sum) == true)
            return true;
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        ArrayList<Integer> ds = new ArrayList<>();
        firstSubseqWithSumK(0, arr, ds, 2, 0);
    }
}
