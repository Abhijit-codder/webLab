class RotateArray {
    void leftRotate(int arr[], int d, int n) {
        for (int i = 0; i < d; i++)
            leftRotateByOne(arr, n);
    }

    void leftRotateByOne(int arr[], int n) {
        int temp = arr[0];
        int i;
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[i] = temp;
    }

    void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++)
            System.out.println(arr[i] + " ");
            System.out.print(arr.length);

    }

    public static void main(String[] args) {
        RotateArray rotate = new RotateArray();
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        int d = 2;
        rotate.leftRotate(arr, d, n);
        rotate.printArray(arr, n);
    }
}