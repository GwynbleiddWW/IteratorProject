package ru.netology;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        for (int r : new Randoms(90, 100)) {
            Thread.sleep(1500);
            System.out.println("Случайное число: " + r);
            if (r == 100) {
                System.out.println("Выпало число 100, давайте на этом закончим");
                break;
            }
        }
    }
}


