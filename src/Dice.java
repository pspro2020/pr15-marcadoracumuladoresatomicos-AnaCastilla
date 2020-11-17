import java.util.Random;
import java.util.concurrent.atomic.LongAdder;

public class Dice {

    private final LongAdder[] numbers = {new LongAdder(), new LongAdder(), new LongAdder()
            , new LongAdder(), new LongAdder(), new LongAdder()};

    public int throwDice() {
        Random rnd = new Random();

        return rnd.nextInt(6)+1;
    }

    public void increase(int num) {
        numbers[num-1].increment();
    }

    public void showNumbers() {
        int totalTimes = 0;
        for (int i = 0; i < 6; i++) {
            System.out.printf("\nNumber %d: %d times\n", i+1, numbers[i].intValue());
            totalTimes += numbers[i].intValue();
        }

        System.out.printf("\nTotal: %d + %d + %d + %d + %d + %d = %d\n", numbers[0].intValue(), numbers[1].intValue(),
                numbers[2].intValue(), numbers[3].intValue(), numbers[4].intValue(), numbers[5].intValue(), totalTimes);
    }


}
