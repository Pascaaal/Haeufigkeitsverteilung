import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Text eingeben...");

        String text = keyboard.nextLine().toLowerCase();
        char[] chartext = text.toCharArray();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int[] verteilung = new int[26];
        double[] prozent = new double[26];

        for (int i = 0; i < 26; i++) {
            for (int a = 0; a < chartext.length; a++) {
                if (alphabet[i] == chartext[a]) {
                    verteilung[i]++;
                }

            }
        }

        for (int d = 0; d < 26; d++) {
            if (verteilung[d] > 0) {
                double temp = verteilung[d];
                prozent[d] = (temp / chartext.length) * 100;
            }
        }

        for (int b = 0; b < 26; b++) {
            if (verteilung[b] > 0) {
                System.out.println(alphabet[b] + " = " + verteilung[b] + " (" + Math.round(100.0 * prozent[b]) / 100.0 + "%)");
            }

        }
    }
}

