
// 1) Largest Element in an Array

public class Solution {

    static int largestElement(int[] arr, int n) {
        // Write your code here.
        
        int largest = arr[0];
        for(int i = 1; i< n ; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }

        return largest;

    }
}



// 2)Second Largest
class Solution {
    public int print2largest(List<Integer> arr) {
        // Code Here
        
        if(arr == null || arr.size() < 2){
            return -1;
        }
        
        int largest = Integer.MIN_VALUE;
        int slargest = Integer.MIN_VALUE;
        
        for(int nums : arr){
            if(nums > largest){
                slargest = largest;
                largest = nums;
            }else if(nums < largest && nums > slargest){
                slargest = nums;
            }
        }
        
        return slargest;
        

    }
       
}



// 3)  Check if Array Is Sorted 

public class Solution {
    public boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}

//4) Remove Duplicates from Sorted Array

class Solution {
    public int removeDuplicates(int[] nums) {
        
        int i = 0;
        for(int j = 0 ; j < nums.length ; j++ ){
            if(nums[i] != nums[j]){
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i+1;
    }
}
