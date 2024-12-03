package allclasses.antonov;

import java.util.Random;

public class Bear {
    public String name;
    public int hours;
    public int pts; // Уровень кофеина в крови (0-100)
    public int numberOfGames;
    public String rank;
    public Random random = new Random(); // Поле для случайных чисел

    public Bear(String name, int hours) {
        this.name = name;
        this.hours = hours;
        this.pts = 1; // Начальный уровень кофеина
        this.numberOfGames = 0;
        this.rank = "Herald";
    }

    public void whoAreYou() {
        System.out.println(name + " сыграл " + hours + " часов. Он - " + rank);
    }

    public void yourRank() {
        if (pts <= 616) {
            rank = "Herald";
        } else if (pts <= 1396) {
            rank = "Guardian";
        } else if (pts <= 2156) {
            rank = "Crusader";
        } else if (pts <= 2926) {
            rank = "Archon";
        } else if (pts <= 3696) {
            rank = "Legend";
        } else if (pts <= 4446) {
            rank = "Ancient";
        } else if (pts <= 5600) {
            rank = "Ancient";
        } else {
            rank = "Titan";
        }
    }

    public void losePts() {
        int lostPts = random.nextInt(50) + 1; // Случайное число от 1 до 50
        pts = Math.max(0, pts - lostPts); // Уменьшаем PTS, но не ниже 0
        System.out.println(name + " потерял " + lostPts + " PTS.");
        yourRank(); // Обновляем ранг
    }

    public void winPts() {
        int gainedPts = random.nextInt(51) + 50; // Случайное число от 50 до 100
        pts += gainedPts;
        numberOfGames++; // Каждая победа — это одна игра
        System.out.println(name + " выиграл " + gainedPts + " PTS.");
        yourRank(); // Обновляем ранг
    }

    public void calculateHours() {
        hours = (numberOfGames * 40) / 60; // Перевод игр в часы
        System.out.println(name + " сыграл " + numberOfGames + " игр, что составляет " + hours + " часов.");
    }
}