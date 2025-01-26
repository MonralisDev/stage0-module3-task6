package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        int roundedNumber;
        if (numberToBeRounded >= 0) {
            roundedNumber = (int) (numberToBeRounded + 0.5f);
        } else {
            roundedNumber = (int) (numberToBeRounded - 0.5f);
        }
        System.out.println(roundedNumber);
    }
}
