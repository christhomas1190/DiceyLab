import java.util.Random;

public class Dice {
    private final int numberOfDice;
    private final Random random;

    public Dice(int numberOfDice) {
        this.numberOfDice = numberOfDice;
        this.random = new Random();
    }

    public int rollAdd() {
        int sum = 0;
        for (int i = 0; i < numberOfDice; i++) {
            sum += random.nextInt(6) + 1; // Roll a die (1-6)
        }
        return sum;
    }
}

