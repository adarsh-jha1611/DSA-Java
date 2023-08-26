package Arrays;

public static int sequentialSearch(int[] arr, int value) {
  for (int i = 0; i < arr.length; i++) {
    if (arr[i] == value) {
      return 0;
    }
  }

  return -1;
}
