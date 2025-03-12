import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Dice {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    //Roll and add 2 dice
    public int rollAdd() {
        return random.nextInt(6)+1+random.nextInt(6)+1;
    }

    public void numberOfRolls(){
        //Store number of rolls are made here?
    }
    //need to create an array?
    //Store values in an array use bins
    //Create a normal distribution chart to show values?
    //Create a simulation for the 1,000,000 rolls
    //  Simulation sim = new Simulation(2, 10000);
    //  sim.runSimulation();
    //  sim.printResults();


    //Not fully necessary, but I wanted to see it in the console. for who ever may see this.
    public static void main(String[] args){
        Dice dice = new Dice();
        System.out.println("Rolling dice...");
        int result = dice.rollAdd();
        System.out.println("You rolled a total of "+result);
    }
}


