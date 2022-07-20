package lang.print.gaps.task6;

public class FloatTypeCasting { //2
    public void roundNumber(float numberToBeRounded) {
        System.out.println(Math.round(numberToBeRounded));
    }

    public static void main(String[] args) {
        FloatTypeCasting floatTypeCasting = new FloatTypeCasting();
        floatTypeCasting.roundNumber(19.4f);

    }
}
