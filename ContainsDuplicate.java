import java.util.*;

class containsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num))
                return true;
            seen.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Call containsDuplicate
        ContainsDuplicate sol = new ContainsDuplicate();
        boolean result = sol.containsDuplicate(nums);

        // Output result
        if (result) {
            System.out.println("Array contains duplicate.");
        } else {
            System.out.println("Array does not contain duplicate.");
        }

        sc.close();
    }
}
