package ru.netology.sqr;

public class SQRService {

    public int calcSqrt (int x) {
        for (int i = 10; i <= x; i++) {
            if (i * i >= x) {
                return i;
            }
        }
        return -1;
    }
}
