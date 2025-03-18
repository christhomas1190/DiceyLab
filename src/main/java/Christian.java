public class Christian {
    public static void main(String[] args) {
        Dice dice= new Dice(2);
        Bins bins = new Bins(2,12);

        for(int i = 0; i<100; i++){
            int result = dice.rollAdd();
            bins.increment(result);
        }
    }
}
