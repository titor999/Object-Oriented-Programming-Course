package module1.week3.task1.b;
import java.lang.Math;
import java.util.Scanner;

public class ShannonEntropy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string >>>");
        String text =  scanner.nextLine();

        System.out.printf("%.2f",shannonEntropy(text));

    }

    public static double shannonEntropy(String str) {
        int len = str.length();
        char[] frequency = new char[256];
        for (char c : str.toCharArray()) {
            frequency[c]++;
        }
        double entropy = 0;
        for (int i = 0; i < 256; i++) {
            int f = frequency[i];
            if (f == 0) {
                continue;
            }
            double k = (double)f / len;
            entropy += k * Math.log(k) / Math.log(2);
        }
        return entropy * (-1);
    }
}
