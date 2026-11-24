import java.util.Arrays;

/*
Feature: Find first and last position of a target value in a sorted array.

Problem solved:
- Given a sorted integer array and a target, return the inclusive range [firstIndex, lastIndex].
- Return [-1, -1] when target is not present.

Expected input/output:
- Input: int[] nums (sorted in non-decreasing order), int target
- Output: int[] range of size 2

Constraints and edge cases handled:
- null array -> [-1, -1]
- empty array -> [-1, -1]
- single element array
- duplicate values
- target outside array value range

Success criteria:
- Correctness across representative interview cases
- Readable, modular methods
- Reusable logic independent of console input
- Compatible with repository's standalone Java-file style

Complexity:
- Time: O(log n)
- Space: O(1)
*/
public class BinarySearchRange {

    public static int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[] { -1, -1 };
        }

        int first = findBound(nums, target, true);
        if (first == -1) {
            return new int[] { -1, -1 };
        }

        int last = findBound(nums, target, false);
        return new int[] { first, last };
    }

    private static int findBound(int[] nums, int target, boolean findFirst) {
        int low = 0;
        int high = nums.length - 1;
        int answer = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                answer = mid;
                if (findFirst) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] testArrays = {
                { 5, 7, 7, 8, 8, 10 },
                { 1, 2, 3, 4, 5 },
                { 2, 2, 2, 2 },
                {},
                { 9 }
        };
        int[] targets = { 8, 6, 2, 1, 9 };

        for (int i = 0; i < testArrays.length; i++) {
            int[] range = searchRange(testArrays[i], targets[i]);
            System.out.println("Array: " + Arrays.toString(testArrays[i])
                    + ", target: " + targets[i]
                    + " -> range: " + Arrays.toString(range));
        }
    }
}
