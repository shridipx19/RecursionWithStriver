import java.util.ArrayList;

public class SubsequenceWithSumK {
    static void subsequenceSumK(int index, int[] arr, ArrayList<Integer> ds, int target, int sum) {
        if (index == arr.length) {
            if (sum == target)
                System.out.println(ds);
            return;
        }
        // Pick the element
        ds.add(arr[index]);
        sum += arr[index];
            subsequenceSumK(index +1, arr, ds, target, sum);

        // Not pick the element
        ds.remove(ds.size() -1);
        sum -= arr[index];
            subsequenceSumK(index +1, arr, ds, target, sum);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        ArrayList<Integer> ds = new ArrayList<>();
        subsequenceSumK(0, arr, ds, 2, 0);
    }
}
