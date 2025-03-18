import org.junit.Assert;
import org.junit.Test;

public class DiceTest {
    @Test
       public void diceTest() {
        //Given
        Dice dice = new Dice();
        //When
        int toss = dice.rollAdd();
        //Then
        Assert.assertTrue("Toss should be between 2-12", toss >= 2 && toss <= 12);
    }@Test
       public void diceTest2() {
        //Given
        Dice dice = new Dice();
        //When
        int toss = dice.rollAdd();
        //Then
        Assert.assertTrue("Toss should be between 2-12", toss >= 2 && toss <= 12);
    }
}
