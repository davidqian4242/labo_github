package labo_Github;

public class FizzBuzz {
    public static void main(String [] args) {
        String word;
        for (int i = 1; i <= 100; i++) {
            word = CheckNumber(i);
            System.out.println(word);
        }
    }

    private static String CheckNumber(int nb) {
        String word;
        if (nb % 3 == 0 && nb % 5 == 0)
            word = "FizzBuzz";
        else if (nb % 3 == 0)
            word = "Fizz";
        else if (nb % 5 == 0)
            word = "Buzz";
        else
            word = (Integer.toString(nb));

        return word;
    }
}
