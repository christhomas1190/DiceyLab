public class Simulation {
    private  Dice dice;
    private  Bins bins;
    private final int numberOfRolls;


    public Simulation(int numberOfDice, int numberOfRolls1) {
        this.bins=new Bins(2, numberOfDice*6);
        this.dice=new Dice(numberOfDice);
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


}



