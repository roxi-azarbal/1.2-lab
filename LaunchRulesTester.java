public class LaunchRulesTester {
    public static void main(String[] args) {
        LaunchRules rules = new LaunchRules();

        // Part A
        // Each line prints your rewrite and the first draft for the same values.
        // Add a line like this one for every isScrubbed row in CHECK 01.
        int wind = 19;
        boolean clear = true;
        System.out.println("isScrubbed(" + wind + ", " + clear + "): "
                + rules.isScrubbed(wind, clear) + " | first draft: " + !(wind < 20 && clear));
        wind = 20;
        System.out.println("isScrubbed(" + wind + ", " + clear + "): "
                + rules.isScrubbed(wind, clear) + " | first draft: " + !(wind < 20 && clear));
        wind = 19;
        clear = false;
        System.out.println("isScrubbed(" + wind + ", " + clear + "): "
                + rules.isScrubbed(wind, clear) + " | first draft: " + !(wind < 20 && clear));
        wind = 30;
        System.out.println("isScrubbed(" + wind + ", " + clear + "): "
                + rules.isScrubbed(wind, clear) + " | first draft: " + !(wind < 20 && clear));


        System.out.println("isGo(false, true): " + rules.isGo(false, true));
        System.out.println("isGo(false, false): " + rules.isGo(false, false));
        System.out.println("isGo(true, true): " + rules.isGo(true, true));
        System.out.println("isGo(true, false): " + rules.isGo(true, false));

        System.out.println(
                "canLaunch(19, false, true, false): " + rules.canLaunch(19, false, true, false));
        System.out.println(
                "canLaunch(19, false, false, true): " + rules.canLaunch(19, false, false, true));
        System.out.println(
                "canLaunch(19, false, false, false): " + rules.canLaunch(19, false, false, false));
        System.out.println(
                "canLaunch(20, false, true, true): " + rules.canLaunch(20, false, true, true));
        System.out.println(
                "canLaunch(10, true, true, true): " + rules.canLaunch(10, true, true, true));
        System.out.println(
                "canLaunch(10, true, false, true): " + rules.canLaunch(10, true, false, true));

        // Part B
        System.out.println("notBothPositive(3, 4): " + rules.notBothPositive(3, 4));
        System.out.println("notBothPositive(3, -4): " + rules.notBothPositive(3, -4));
        System.out.println("notBothPositive(-3, 4): " + rules.notBothPositive(-3, 4));
        System.out.println("notBothPositive(0, 4): " + rules.notBothPositive(0, 4));


        // Print the first draft beside canFuel too, for every canFuel row in CHECK 03.
        int temp = 95;
        boolean spark = false;
        System.out.println("canFuel(" + temp + ", " + spark + "): " + rules.canFuel(temp, spark)
                + " | first draft: " + (temp <= 95 && !spark));
        temp = 96;
        System.out.println("canFuel(" + temp + ", " + spark + "): " + rules.canFuel(temp, spark)
                + " | first draft: " + (temp <= 95 && !spark));
        temp = 70;
        spark = true;
        System.out.println("canFuel(" + temp + ", " + spark + "): " + rules.canFuel(temp, spark)
                + " | first draft: " + (temp <= 95 && !spark));
        temp = 60;
        spark = false;
        System.out.println("canFuel(" + temp + ", " + spark + "): " + rules.canFuel(temp, spark)
                + " | first draft: " + (temp <= 95 && !spark));

        System.out.println("isHold(19, true, false, true): " + rules.isHold(19, true, false, true));
        System.out.println("isHold(20, true, false, true): " + rules.isHold(20, true, false, true));
        System.out
                .println("isHold(19, false, false, true): " + rules.isHold(19, false, false, true));
        System.out.println("isHold(19, true, true, true): " + rules.isHold(19, true, true, true));
        System.out
                .println("isHold(19, true, false, false): " + rules.isHold(19, true, false, false));
        System.out.println("isHold(30, true, false, true): " + rules.isHold(30, true, false, true));

    }
}
