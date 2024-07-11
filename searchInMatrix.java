public class searchInMatrix {
  public static void main(String[] args) {

    int[][] arr = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
    System.out.println(searchMatrix(arr, 20));
  }

  static public boolean searchMatrix(int[][] matrix, int target) {

    for (int i = 0; i < matrix.length; i++) {
      if (target >= matrix[i][0] && target <= matrix[i][matrix[0].length - 1]) {
        return Binarysearch(matrix[i], 0, matrix[0].length - 1, target);
      }
    }

    return false;
  }

  static public Boolean Binarysearch(int[] arr, int start, int end, int target) {
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (target == arr[mid]) {
        return true;
      } else if (target < arr[mid]) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }

    }
    return false;
  }
}
