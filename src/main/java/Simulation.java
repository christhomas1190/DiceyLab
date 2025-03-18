public class Simulation {
    private  Dice dice;
    private  Bins bins;
    private final int numberOfRolls;


    public Simulation(int numberOfDice, Dice dice, int numberOfRolls1) {
        this.dice = dice;

        this.numberOfRolls = numberOfRolls1;
    }
    public void runSimulation() {
        for (int i = 0; i < numberOfRolls; i++) {
            int rollResult = dice.rollAdd();
            bins.increment(rollResult);
        }
    }

    // Prints a histogram of results
    public void printResults() {
        System.out.println("Simulation of " + numberOfRolls + " dice rolls:");
        bins.Histogram();
    }

    public static void main(String[] args) {
        Simulation sim = new Simulation(2, 100); // Rolling 1,000,000 times
        sim.runSimulation();
        sim.printResults();
    }
}



