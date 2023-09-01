package utility;

import java.util.Random;

public class Utilities {
    public static int generateRandomInt(int lower, int upper) {
        // Create a random number generator
        Random random = new Random();

        // Generate a random integer between the specified lower and upper bounds
        int randomInt = random.nextInt(upper - lower + 1) + lower;

        return randomInt;
    }
}
