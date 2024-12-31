class Quicksort {
    public static void quick(int[] a, int l, int h) {
        if (l < h) {
            int piv = part(a, l, h);
            quick(a, l, piv - 1);
            quick(a, piv + 1, h);
        }
    }

    public static int part(int[] a, int l, int h) {
        int piv = a[h]; // Pivot element
        int i = l - 1;

        for (int j = l; j < h; j++) {
            if (a[j] < piv) {
                i++;
                // Swap a[i] and a[j]
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        // Swap a[i+1] and pivot
        int temp = a[i + 1];
        a[i + 1] = a[h];
        a[h] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        int[] a = {9, 3, 1, 4, 0};

        System.out.println("Before sorting:");
        for (int n : a) {
            System.out.print(n + " ");
        }

        quick(a, 0, a.length - 1);

        System.out.println("After sorting:");
        for (int n : a) {
            System.out.print(n + " ");
        }
    }
}
