public class LoopRepair {

    // Read REQ 03
    // Bug Found: StringIndexOutOfBoundsException
    // Variables Watched: i, count, current
    // Method Call That Caught It: countVowels("banana") should return 3
    public int countVowels(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char current = Character.toLowerCase(text.charAt(i));
            if (current == 'a' || current == 'e' || current == 'i'
                    || current == 'o' || current == 'u') {
                count++;
            }
        }
        return count;
    }

    // Read REQ 04
    // Bug Found: infinite loop
    // Variables Watched: halvings, remaining
    // Method Call That Caught It: halveSteps(8) should return 3
    public int halveSteps(int value) {
        int halvings = 0;
        int remaining = value;

        while (remaining > 1) {
            remaining /= 2;
            halvings++;
        }
        return halvings;
    }

    // Read REQ 05
    // Bug Found: Logic error
    // Variables Watched: i, count
    // Method Call That Caught It: repair.countZeros("1234") should return 0
    public int countZeros(String digits) {
        int count = 0;
        for (int i = 0; i < digits.length(); i++) {
            if (digits.substring(i, i + 1).equals("0")) {
                count++;
            }
        }
        return count;
    }

    // Read REQ 06
    // Bug Found: two logic errors. the loop starts index at 1. it also excludes A.
    // Variables Watched: index, letters, capitals
    // Method Call That Caught It: countCapitals("one Big Dog") should return 2
    public int countCapitals(String text) {
        int capitals = 0;
        for (int index = 0; index < text.length(); index++) {
            char letter = text.charAt(index);
            if (letter >= 'A' && letter <= 'Z') {
                capitals++;
            }
        }
        return capitals;
    }

    // Read REQ 07
    // Bug Found: logic error. sum = number is replacing the previous total and not
    // adding to it.
    // Variables Watched: sum, number
    // Method Call That Caught It: sumTo(5) should return 15 but returns 5
    public int sumTo(int n) {
        int sum = 0;
        for (int number = 1; number <= n; number++) {
            sum += number;
        }
        return sum;
    }

    // Read REQ 08
    // Bug Found: logic error. stars is being returned too early.
    // Variables Watched: i, stars
    // Method Call That Caught It: buildStars(4) should return "****"
    public String buildStars(int count) {
        String stars = "";
        for (int i = 0; i < count; i++) {
            stars += "*";
        }
        return stars;
    }

    // Read REQ 09
    // Bug Found: counter resets to 0 inside the loop. also >= limit counts values
    // equal to limit.
    // Variables Watched: count, value, limit
    // Method Call That Caught It:countAbove(new int[] { 3, 7, 15 }, 10) should
    // return 1
    public int countAbove(int[] nums, int limit) {
        int count = 0;
        for (int value : nums) {
            if (value > limit) {
                count++;
            }
        }
        return count;
    }

    // Read REQ 10
    // Bug Found: StringIndexOutOfBoundsException. text.length() should be
    // text.length() - 1.
    // Variables Watched: i, result
    // Method Call That Caught It: reversed("loops") should return spool
    public String reversed(String text) {
        String result = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            result += text.charAt(i);
        }
        return result;
    }

    // STRETCH:

    public char lastChar(String text) {
        return text.charAt(text.length() - 1);
    }

    public String traceHalveSteps(int value) {
        int remaining = value;
        String result = "" + value;

        while (remaining > 1) {
            remaining /= 2;
            result += " " + remaining;
        }

        return result;
    }
}