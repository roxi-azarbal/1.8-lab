public class LoopRepairTester {
        public static void main(String[] args) {
                // Uncomment one call at a time, run it, and compare against the table
                // for that method in the assignment. Then add calls of your own.
                LoopRepair repair = new LoopRepair();

                System.out.println("countVowels(\"banana\") -> " + repair.countVowels("banana"));

                // Until you repair halveSteps, this call never returns. See REQ 04.
                System.out.println("halveSteps(8) -> " + repair.halveSteps(8));

                System.out.println("countZeros(\"1234\") -> " + repair.countZeros("1234"));

                System.out.println("countCapitals(\"one Big Dog\") -> "
                                + repair.countCapitals("one Big Dog"));

                System.out.println("sumTo(5) -> " + repair.sumTo(5));

                System.out.println("buildStars(4) -> [" + repair.buildStars(4) + "]");

                System.out.println("countAbove({3, 7, 15}, 10) -> "
                                + repair.countAbove(new int[] { 3, 7, 15 }, 10));

                System.out.println("reversed(\"loops\") -> [" + repair.reversed("loops") +
                                "]");

                System.out.println("lastChar(\"roxi\") -> [" + repair.lastChar("roxi") + "]");

                System.out.println("traceHalveSteps:" + repair.traceHalveSteps(8));
        }
}