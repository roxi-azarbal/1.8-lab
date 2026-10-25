public class LoopRepair {

    // Read REQ 03
    // Bug Found:
    // Variables Watched:
    // Method Call That Caught It:
    public int countVowels(String text) {
        int count = 0;
        for (int i = 0; i <= text.length() - 1; i++) {
            char current = text.charAt(i);
            if (current == 'a' || current == 'e' || current == 'i'
                    || current == 'o' || current == 'u') {
                count++;
            }
        }
        return count;
    }

    // Read REQ 04
    // Bug Found:
    // Variables Watched:
    // Method Call That Caught It:
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
    // Bug Found:
    // Variables Watched:
    // Method Call That Caught It:
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
    // Bug Found:
    // Variables Watched:
    // Method Call That Caught It:
    public int countCapitals(String text) {
        int capitals = 0;
        for (int index = 1; index < text.length(); index++) {
            char letter = text.charAt(index);
            if (letter > 'A' && letter <= 'Z') {
                capitals++;
            }
        }
        return capitals;
    }

    // Read REQ 07
    // Bug Found:
    // Variables Watched:
    // Method Call That Caught It:
    public int sumTo(int n) {
        int sum = 0;
        for (int number = 1; number <= n; number++) {
            sum += number;
        }
        return sum;
    }

    // Read REQ 08
    // Bug Found:
    // Variables Watched:
    // Method Call That Caught It:
    public String buildStars(int count) {
        String stars = "";
        for (int i = 0; i < count; i++) {
            stars += "*";
        }
        return stars;
    }

    // Read REQ 09
    // Bug Found:
    // Variables Watched:
    // Method Call That Caught It:
    public int countAbove(int[] nums, int limit) {
        int count = 0;
        for (int value : nums) {
            if (value >= limit) {
                count++;
            }
        }
        return count;
    }

    // Read REQ 10
    // Bug Found:
    // Variables Watched:
    // Method Call That Caught It:
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