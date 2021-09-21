import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        Dice dice1 = new Dice(1);
        Dice dice2 = new Dice(1);
        Dice dice3 = new Dice(1);
        Dice dice4 = new Dice(1);
        Dice dice5 = new Dice(1);
        //test rolls
        dice1.roll();
        System.out.println(dice1.getFaceValue());
        dice1.roll();
        System.out.println(dice1.getFaceValue());
        dice1.roll();
        System.out.println(dice1.getFaceValue());
        dice1.roll();
        System.out.println(dice1.getFaceValue());
        System.out.println(dice1.getFaceValue());

        int sum = 0;
        int[] manyDice = new int[5];
        for (int i = 0 ; i < manyDice.length; i ++){
            dice1.roll();
            sum = dice1.getFaceValue()+sum;

        }
        System.out.println(sum);

    }
}
