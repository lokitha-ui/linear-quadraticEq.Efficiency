public class linearAlgoJava2 {
    public static void linearAlgorithm(int n) {
        int val = 0; // Set iteration count to 0

        for (int i = 0; i < n; i++) // Looping n number of times
        {
            val++;
            System.out.println("Loading: " + val); // Printing value
        }
    }

    public static void main(String[] args) {
        long stime = System.currentTimeMillis(); // Getting the start time of the algorithm in milliseconds
        int n = 10000000; // n count
        linearAlgorithm(n); // Running the algorithm with the n value given
        long etime = System.currentTimeMillis(); // Getting the end time of the algorithm in milliseconds
        float timeelapsed = (etime - stime) / 1000; // converting milliseconds to seconds
        System.out.println("Time executed: " + timeelapsed + " seconds"); // Print out execution time
    }
}
