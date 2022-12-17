import java.util.ArrayList;

public class AllSubsequences {
    static void subSequences(int index, int[] arr, ArrayList<Integer> ds) {
        if (index == arr.length) {
//            for (int e : ds) {
//                System.out.print(e + " ");
//            }
            System.out.println(ds);
            return;
        }
        ds.add(arr[index]);
        subSequences(index +1 , arr, ds);
        ds.remove(ds.size() -1);
        subSequences(index +1 , arr, ds);
    }
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        ArrayList<Integer> ds = new ArrayList<>();
        subSequences(0, arr, ds);
    }
}
