
class Day_55 {
    // Function to count the number of possible triangles.
    static int countTriangles(int arr[]) {
        int n = arr.length;
        int count = 0;
        Arrays.sort(arr);
        for (int i = 2; i < n; i++) {
            int lp = 0, rp = i - 1;
            while (lp < rp) {
                int sum = arr[rp] + arr[lp];
                if (sum > arr[i]) {
                    count += rp - lp;
                    rp--;
                } else {
                    lp++;
                }
            }

        }
        return count;
    }
}