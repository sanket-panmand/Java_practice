package duplicates;

public class SimpleSquareRoot {

    public static void main(String[] args) {
        
        double n = 80;  // The number for which we want to find the square root
        double guess = n / 2;  // Initial guess
        double epsilon = 0.0001;  // Precision level

        // Loop to find the square root using Newton's method
        for (int i = 0; i < 1000; i++) {  // Limit iterations to prevent infinite loops
            guess = (guess + n / guess) / 2;  // Update the guess
            
            // Check if the guess is close enough
            if (Math.abs(guess * guess - n) < epsilon) {
                break;  // Exit loop if guess is accurate enough
            }
        }

        // Print the result
        System.out.println("The square root  of " + n + " is approximately: " + guess);
    }
}

