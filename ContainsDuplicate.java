/*
Leetcode Problem Link - 
 */

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

/*
Problem Description - 
217. Contains Duplicate

Given an integer array nums, return true if any value appears at least twice in the array,
and return false if every element is distinct.
 
Example 1:
Input: nums = [1,2,3,1]
Output: true
Explanation:
The element 1 occurs at the indices 0 and 3.

Example 2:
Input: nums = [1,2,3,4]
Output: false
Explanation:
All elements are distinct.

Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true

Constraints:
1 <= nums.length <= 105
-109 <= nums[i] <= 109
*/