class Test {
  public static void main(String[] args) {
    int[] arr = { 2, 2, 2, 3, 1 };
    int target = 1;
    int pivot = findPivotElement(arr);
    if (pivot == -1) {
      System.out.println(Binarysearch(arr, target, 0, arr.length - 1));
    } else if (arr[pivot] == target) {
      System.out.println(pivot);
    } else if (target >= arr[0]) {
      System.out.println(Binarysearch(arr, target, 0, pivot));
    } else {
      System.out.println(Binarysearch(arr, target, pivot + 1, arr.length - 1));
    }
  }

  static public boolean Binarysearch(int[] nums, int target, int start, int end) {
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (target == nums[mid]) {
        return true;
      } else if (target > nums[mid]) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }

    }
    return false;
  }

  public static int findPivotElement(int[] arr) {
    int start = 0;
    int end = arr.length - 1;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      // 4 cases over here
      if (mid < end && arr[mid] > arr[mid + 1]) {
        return mid;
      }
      if (mid > start && arr[mid] < arr[mid - 1]) {
        return mid - 1;
      }

      // if elements at middle, start, end are equal then just skip the duplicates
      if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
        // skip the duplicates
        // NOTE: what if these elements at start and end were the pivot??
        // check if start is pivot
        if (start < end && arr[start] > arr[start + 1]) {
          return start;
        }
        start++;

        // check whether end is pivot
        if (end > start && arr[end] < arr[end - 1]) {
          return end - 1;
        }
        end--;
      }
      // left side is sorted, so pivot should be in right
      else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return -1;
  }
}

// 7 8 9 10 11 12 13 13 13 13 1 2 3 4 5 6

// 0+15/2=7

// 8+15/2
// 11
