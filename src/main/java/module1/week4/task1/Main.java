package module1.week4.task1;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a path for file >>>");
        String filePath = scanner.nextLine();
        System.out.println(getLines(filePath));
    }

    public static String getLines(String pathName) {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(pathName));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            throw new RuntimeException(e);
        }
        StringBuilder stringBuilder = new StringBuilder();
        String readLine;
        while (true) {
            try {
                if ((readLine = bufferedReader.readLine()) == null) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            stringBuilder.append(readLine).append("\n");
        }
        return stringBuilder.toString();
    }
}
