package main.module1.week2.task1.c;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день недели >>>");
        String weekDay = scanner.nextLine();

        if (weekDay.equals("Воскресенье") || weekDay.equals("воскресенье")) {
            System.out.println("Какая сегодня температура на улице? (жарко/тепло/холодно) >>>");
            String theWeatherOutside = scanner.nextLine();
            if (theWeatherOutside.equals("тепло")) {
                System.out.println("Присутствуют ли сегодня осадки? (ясно, облачно, дождь, снег, град) >>>");
                String rainfall = scanner.nextLine();
                if (rainfall.equals("ясно") || rainfall.equals("облачно")) {
                    System.out.println("Есть ли сегодня ветер? (есть/нет) >>>");
                    String wind = scanner.nextLine();
                    if (wind.equals("нет") || wind.equals("Нет")) {
                        System.out.println("Какая сегодня влажность воздуха? (высокая/низкая) >>>");
                        String airHumidity = scanner.nextLine();
                        if (airHumidity.equals("низкая")) {
                            System.out.println("Сегодня вы хотите поиграть в бадминтон :)");
                            System.exit(0);
                        }
                    }
                }
            }
        }
        System.out.println("Сегодня вы не хотите играть в бадминтон :(");
    }
}
