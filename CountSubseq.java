import java.util.ArrayList;

public class CountSubseq {
        static int countSubseq(int index, int[] arr, int target, int sum) {
            if (index == arr.length) {
                if (sum == target)
                    return 1;
                return 0;
            }
            // We dont need any data structures to return count, as sum will keep track of it
            // Pick the element
            sum += arr[index];
            int left = countSubseq(index +1, arr, target, sum);

            // Not pick the element
            sum -= arr[index];
            int right = countSubseq(index +1, arr, target, sum);

            return left + right;
        }
        public static void main(String[] args) {
            int[] arr = {1,2,1};
            // WE dont need a data structure here, as we want to return an INTEGER count
            System.out.format("Number of subseq: %d",countSubseq(0, arr, 2, 0));

        }
}
