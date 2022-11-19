public class quadraticAlgoJava1 {
  public static void quadraticAlgorithm(int n) {
    int val = 0; // Setting iteration count to 0

    for (int i = 0; i < n; i++) // Iterating n times
    {
      for (int j = 0; j < n; j++) {
        val++;
        System.out.println("Loading: " + val); // Printing the value
      }
    }
  }

  public static void main(String[] args) {
    long stime = System.currentTimeMillis(); // Getting the current time
    int n = 10000;// Iteration count
    quadraticAlgorithm(n); // Running the linear algorithm
    long etime = System.currentTimeMillis(); // get the end time
    float timeelapsed = (etime - stime) / 1000; // convert milliseconds to seconds
    System.out.println("Time executed: " + timeelapsed + " seconds"); // Print out execution time
  }

}
