public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("task 1");
        double sum = 0;
        int month = 1;
        while (sum < 2_459_000) {
            sum += 15000;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
            month++;
        }

        //task 2
        System.out.println("task 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");
        }
        System.out.println();

        //task 3
        System.out.println("task 3");
        double population = 12000000;
        int birthRate = 17;
        int deathRate = 8;
        for (int year = 1; year <= 10; year++) {
            double birth = population / 1000 * birthRate;
            double death = population / 1000 * deathRate;
            population = population + birth - death;
            System.out.println("Год " + year + ", численность населения составляет " + (long) population);
        }
        //task 4
        System.out.println("task 4");
        double amount = 15000;
        month = 1;
        while (amount < 12000000) {
            amount = amount + amount * 7 / 100;
            month++;
            System.out.println("Месяц = " + month + " сумма = " + (int) amount);
        }
        //task 5
        System.out.println("task 5");
        double value = 15000;
        month = 1;
        while (value < 12000000) {
            value = value + value * 7 / 100;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц = " + month + " сумма = " + (int) value);
            }
        }
        //task 6
        System.out.println("task 6");
        double many = 15000;
        month = 1;
        while (month < 9 * 12) {
            many = many + many * 7 / 100;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц = " + month + " сумма = " + (int) many);
            }
        }
        //task 7
        System.out.println("task 7");
        int friday = 1;
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет ");
            friday += 7;
        }
        //task 8
        System.out.println("task 8");
        int currentYear = 2024;
        for (int year = 2024 - 200; year < currentYear + 100; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }

        }

    }
}