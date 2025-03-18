public class Christian {
    public static void main(String[] args) {
        Simulation sim = new Simulation(2, 100_000);
        sim.runSimulation();
        sim.printResults();
    }
}
