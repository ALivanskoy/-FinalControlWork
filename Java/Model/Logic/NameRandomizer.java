package Model.Logic;

import java.util.Random;

public class NameRandomizer {

    private static Random random = new Random();
    private static int numberOfWords;
    private static String word;

    public static String getRandomName() {

        String name;

        numberOfWords = random.nextInt(2, 4);

        if (numberOfWords == 2) return getsecondWord() + " " + getThirdWord();
        else if (numberOfWords == 3) return getfirstWord() + " " + getsecondWord() + " " + getThirdWord();

        return "Алексей";
    }

    private static String getfirstWord() {
        int r = random.nextInt(9);

        switch (r) {
            case 0:
                return "Капитан";
            case 1:
                return "Геолог";
            case 2:
                return "Буян";
            case 3:
                return "Алкоголь";
            case 4:
                return "Профессор";
            case 5:
                return "Счастливчик";
            case 6:
                return "Шовинист";
            case 7:
                return "Щукарь";
            case 8:
                return "Швед";

        }
        return "Бля";
    }

    private static String getsecondWord() {
        int r = random.nextInt(9);

        switch (r) {
            case 0:
                return "Весёлый";
            case 1:
                return "Пушистый";
            case 2:
                return "Продажный";
            case 3:
                return "Похотливый";
            case 4:
                return "Австрийский";
            case 5:
                return "Гуманный";
            case 6:
                return "Кусачий";
            case 7:
                return "Возобновляемый";
            case 8:
                return "Порочный";
        }
        return "Уф";
    }

    private static String getThirdWord() {
        int r = random.nextInt(9);

        switch (r) {
            case 0:
                return "Укупник";
            case 1:
                return "Шарик";
            case 2:
                return "Карлик";
            case 3:
                return "Половец";
            case 4:
                return "Пёс";
            case 5:
                return "Хвостик";
            case 6:
                return "Неврастеник";
            case 7:
                return "Художник";
            case 8:
                return "Алкоголь";
        }
        return "Мде";
    }


}
