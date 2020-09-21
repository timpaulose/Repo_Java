package Class3;

public class Homework2 {

    public static void main(String[] args) {

        //used rapidtables.com for all conversion equations

        //F -> C   [T(°C) = (T(°F- 32) × 5/9]
        double fTempToC = 72.5;
        double cTemp1 = (fTempToC - 32) * 5/9;
        System.out.println(fTempToC + "°F = " + cTemp1 + "°C");

        //F -> K    [T(K) = (T(°F) + 459.67)× 5/9]
        float fTempToK = 72.5f; //used float for appropriate temperature display
        float kTemp1 = (float) ((fTempToK + 459.67) * 5/9);
        System.out.println(fTempToK + "°F = " + kTemp1 + "K");

        //K -> C    [T(°C) = T(K) - 273.15]
        double kTempToC = 294.15;
        double cTemp2 = 294.15 - 273.15;
        System.out.println(kTempToC + "K = " + cTemp2 + "°C");

        //K -> F    [T(°F) = T(K) × 9/5 - 459.67]
        float kTempToF = 294.15f;
        float fTemp1 = (float) ((294.15 * 9/5) - 459.67);
        System.out.println(kTempToF + "K = " + fTemp1 + "°F");

        //C -> F    [T(°F) = T(°C) × 9/5 + 32]
        double cTempToF = 22.5;
        double fTemp2 = (22.5 * 9/5) + 32;
        System.out.println(cTempToF + "°C = " + fTemp2 + "°F");

        //C -> K    [T(K) = T(°C) + 273.15]
        double cTempToK = 22.5;
        double kTemp2 = (22.5 + 273.15);
        System.out.println(cTempToK + "°C = " + kTemp2 + "K");

    }
}
