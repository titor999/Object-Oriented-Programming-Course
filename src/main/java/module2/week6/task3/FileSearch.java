package module2.week6.task3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileSearch {
    public static void main(String[] args) throws IOException {
        Scanner inputScanner = new Scanner(System.in);
        Scanner searchScanner = new Scanner(System.in);

        System.out.println("1 -> По названию, 2 -> По содержимому.");
        int typeOfSearch = searchScanner.nextInt();
        System.out.println("Введите директорию: ");
        String rootDir = inputScanner.nextLine();

        switch (typeOfSearch) {
            case 1 -> {
                System.out.println("Введите название файла -> ");
                String fName = inputScanner.nextLine();
                System.out.println(findFilesByName(rootDir, fName));

            }
            case 2 -> {
                System.out.println("Введите содержимое файла -> ");
                String text = inputScanner.nextLine();
                List<String> filesByContent = findFilesByContent(rootDir, text);
                for (String s : filesByContent) {
                    System.out.println(s);
                }
            }
            default -> System.out.print("Вы ввели неверные данные");
        }

    }

    public static File findFilesByName(String rootFolder, String fileName) {
        File target = null;
        Path root = Paths.get(rootFolder);
        try (Stream<Path> stream = Files.find(root, Integer.MAX_VALUE, (path, attr) -> path.getFileName().toString().equals(fileName))) {
            Optional<Path> path = stream.findFirst();
            if (path.isPresent()) {
                target = path.get().toFile();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return target;
    }

    public static List<String> findFilesByContent(String rootFolder, String text) {
        try (Stream<Path> stream = Files.find(Paths.get(rootFolder), 5, (path, attr) -> String.valueOf(path).endsWith(".txt"))) {
            List<String> paths = stream.map(Path::toString).toList();
            List<String> result = new ArrayList<>();

            for (String path : paths) {
                Stream<String> streamText = Files.lines(Path.of(path)).filter(s -> s.contains(text));
                String word = streamText.map(String::valueOf).collect(Collectors.joining(""));

                if (!word.equals("")) {
                    result.add(path);
                }
            }
            return result;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
