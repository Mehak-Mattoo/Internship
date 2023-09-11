import java.util.*;

public class ShortestPathBetweenPrimes {
    // Function to check if a number is prime
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to find the shortest path between two prime numbers
    static int shortestPath(int num1, int num2) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        Map<Integer, Integer> distance = new HashMap<>();

        queue.offer(num1);
        visited.add(num1);
        distance.put(num1, 0);

        while (!queue.isEmpty()) {
            int current = queue.poll();

            // Check if we have reached num2
            if (current == num2) {
                return distance.get(current);
            }

            // Generate all possible four-digit numbers by changing one digit
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j <= 9; j++) {
                    if (i == 0 && j == 0) {
                        continue; // Skip numbers with leading zeros
                    }

                    int[] digits = Integer.toString(current).chars().map(c -> c - '0').toArray();
                    digits[i] = j;
                    int nextNum = digits[0] * 1000 + digits[1] * 100 + digits[2] * 10 + digits[3];

                    if (isPrime(nextNum) && !visited.contains(nextNum)) {
                        queue.offer(nextNum);
                        visited.add(nextNum);
                        distance.put(nextNum, distance.get(current) + 1);
                    }
                }
            }
        }

        return -1; // No path found
    }

    public static void main(String[] args) {
        int num1 = 1033; // Replace with your first four-digit prime number
        int num2 = 8171; // Replace with your second four-digit prime number

        int result = shortestPath(num1, num2);
        if (result != -1) {
            System.out.println("Shortest Path: " + result + " steps");
        } else {
            System.out.println("No path found.");
        }
    }
}
