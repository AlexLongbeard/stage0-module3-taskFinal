package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int first = number/1000;
        int second = (number-first*1000)/100;
        int third = (number - (first * 1000) - (second * 100)) / 10;
     System.out.println(third+""+second+""+first);

    }
}
