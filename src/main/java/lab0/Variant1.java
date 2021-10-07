package lab0;

public class Variant1 {

    public enum DAY_OF_WEEK{
        MONDAY, TUESDAY, WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
    }

    /**
     *
     * @param k is square side
     * @return perimeter
     */
    public int inputOutputTask(int k) {
        assert k>0: "Parametr k > 0";
        return k*k;
    }

    /**
     *
     * @param k is distance in cm
     * @return distance in m
     */

    public int integerNumbersTask(int k) {
        assert k>0;
        return k/100;
    }

    /**
     *
     * @param number
     * @return true, if number is possitive
     */
    public boolean booleanTask(int number) {
        return number>0;
    }


    /**
     *
     * @param parameter is integer number
     * @return transformed number
     */
    public int ifTask(int parameter) {
        if (parameter>0)
            parameter++;
        return parameter;
    }


    /**
     *
     * @param number
     * @return day of week day represented number1
     */
    public DAY_OF_WEEK switchTask(int number) {
        switch (number){
            case 1:return DAY_OF_WEEK.MONDAY;
            case 2:return DAY_OF_WEEK.TUESDAY;
            case 3:return DAY_OF_WEEK.WEDNESDAY;
            case 4:return DAY_OF_WEEK.THURSDAY;
            case 5:return DAY_OF_WEEK.FRIDAY;
            case 6:return DAY_OF_WEEK.SATURDAY;
            case 7:return DAY_OF_WEEK.SUNDAY;
        }
        return DAY_OF_WEEK.MONDAY;
    }



    public static double factorial(int number)
    {
        double factorial = 1;
        while (number>1)
        {
            factorial*=number;
            number--;
        }
        return factorial;
    }
    /**
     *
     * @param n is integer number
     * @return approximated value of exp(1)
     */
    public double forTask(int n) {
        assert n >0: "Argument should be more than zero";
        double e = 1;

        for (int i = 1; i <= n; i++) {
            e = e + 1.0/(factorial(i));
        }

        return e;
    }


    public int whileTask(int a, int b) {
        assert (a >0 && b > 0): "Argument should be more than zero";
        int c =a;
        while (c>=0){
            c-=b;
        }
        return c+b;
    }

    public double arrayTask(double[] array) {
        return 0;
    }

    /**
     *
     * @param array
     * @param k1
     * @param k2
     * @return transformed array where row with indexes k1 and k2 was changed
     */
    public int[][]  twoDimensionArrayTask(int[][] array, int k1, int k2) {
        for (int i = 0; i < array[0].length; i++) {
            int temp = array[k1 - 1][i];
            array[k1 - 1][i] = array[k2 - 1][i];
            array[k2 - 1][i] = temp;
        }
        return array;
    }

    public static void main(String... strings) {
        System.out.println("Start of zero lab");
        System.out.println("Done!!!");
    }

}