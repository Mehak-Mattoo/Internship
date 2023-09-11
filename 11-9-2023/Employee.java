import java.util.Scanner;

public class Employee {
    // Function to check if a number is prime
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of employees
        int[] arr = new int[n];

        for (int i = 1; i < n; i++) {
            arr[i] = sc.nextInt(); // Rank of the immediate senior
        }

        int blackListedCount = 0;
        for (int i = 1; i < n; i++) {
            int rankSum = i + 1; // Rank of the employee plus 1 (to account for 0-based indexing)
            int senior = arr[i];
            while (senior != 0) {
                rankSum += 1; // Increment rankSum for each senior
                senior = arr[senior];
            }
            if (isPrime(rankSum)) {
                blackListedCount++;
            }
        }

        System.out.println("Number of Black-Listed Employees: " + blackListedCount);
    }
}
