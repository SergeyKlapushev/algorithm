public class Task {
    public static void main(String[] args) {
        int[] arr = {1234, 4, 7, 2, 1, -3, 0, 567, 45, 90, 34, 2, 234};

        heapSort(arr);

        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static void heapSort(int[] arr) {
        int l = arr.length;
        for (int i = l / 2 - 1; i >= 0; i--) {
            heapyfy(arr, i, l);
        }

        for (int i = l - 1; i >= 0; i--){
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;

            heapyfy(arr, 0, i);
        }
    }

    public static void heapyfy(int[] arr, int i, int l) {
        int left = i * 2 + 1;
        int right = i * 2 + 2;
        int fat = i;

        if (left < l && arr[left] > arr[fat]) {
            fat = left;
        }

        if (right < l && arr[right] > arr[fat]) {
            fat = right;
        }

        if (i != fat) {
            int temp = arr[i];
            arr[i] = arr[fat];
            arr[fat] = temp;

            heapyfy(arr, fat, l);
        }
    }
}