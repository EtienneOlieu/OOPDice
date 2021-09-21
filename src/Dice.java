import java.util.Random;

public class Dice {

    private int faceValue;

    public Dice (int faceValue){
        this.faceValue = faceValue;
    }

    public int getFaceValue(){
        return faceValue;
    }

    public void roll(){
        Random random = new Random();
        faceValue = random.nextInt(6)+1;
    }

}
