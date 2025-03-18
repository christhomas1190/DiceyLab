import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Bins {
  private final Map<Integer, Integer> binCount;

    public Bins(int min, int max){
        binCount=new HashMap<>();
        for(int i = min;i<=max;i++){
            binCount.put(i,0);
        }
    }
    public void increment( int val){
        binCount.put(val,binCount.getOrDefault(val,0)+1);
    }
    public int getBin(int value) {
        return binCount.getOrDefault(value, 0);
    }

//does this count as a file change?
    public void Histogram() {
        for (int i = 2; i <= 12; i++) {
            int count =binCount.get(i);
            String stars= "*".repeat(count/1000);
            System.out.printf("%2d: %s (%d)\n", i, stars, count);

        }
    }
}
