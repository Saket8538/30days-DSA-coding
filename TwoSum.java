/* 167. Two Sum II - Input Array Is Sorted
Leetcode Problem Link - https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
*/

import java.util.*;

class TwoSum{
    public int[] twoSum(int[] numbers , int target){
        int n = numbers.length;
        int left = 0;
        int right = n-1;

        while(left < right ){
           int sum = numbers[left] + numbers[right];

           if( sum == target){
            return new int[]{left+1,right+1};
           }

           else if(sum > target){
            right--;
           }

           else{
            left++;
           }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        System.out.println("Enter the array elements:");
        int numbers[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            numbers[i] = sc.nextInt();
        }
        
        System.out.println("Enter the target value:");
        int target = sc.nextInt();

        TwoSum obj = new TwoSum();

        int res[] = obj.twoSum(numbers, target);

        System.out.println(res[0] + " " + res[1]);
    }
}
