package us.cyrien.interpolator;

import java.util.UUID;

public class Test implements Interpolator {

    private int testInt;
    private final int numbers = 123456;
    private String testString;
    private final String letters = "qwertyuiop";

    public Test() {
        testInt = Integer.MAX_VALUE;
        testString = UUID.randomUUID().toString();
        printf("variable Interpolation Test: \n\n" +
                "testInt = $testInt \n" +
                "numbers = $numbers \n" +
                "testString = $testString \n" +
                "letters = $letters \n");
        printf("Integer's Max Value is $testInt");
    }

    public static void main(String[] args) {
        new Test();
    }

}
