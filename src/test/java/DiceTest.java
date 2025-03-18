import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiceTest {
    Dice dice;
    Bins bins;
    Simulation simulation;

    @BeforeEach
    public void setUp(){
        dice = new Dice(2);
        bins = new Bins(2,12);
        simulation = new Simulation(2,1000 );
    }
    @Test
    public void testDiceRollWithinRange(){
        //Given
        Dice dice = new Dice(2);
        //When
        int result=dice.rollAdd();
        //Then
        Assert.assertTrue(result>=2&&result<=12);
    }
    @Test
    public void binsTest() {
        //Given
        Bins bins = new Bins(2, 12);
        //when
        for (int i = 2; i <= 12; i++) {
            //Then
                assertEquals(0, bins.getBin(i), "Bin " + i + " should start at 0.");
        }
    }
}
