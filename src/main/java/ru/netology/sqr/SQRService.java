package ru.netology.sqr;

public class SQRService {
    public int countSqr(int begin, int end) {

        int counter = 0;
        for (int i = 10; i >= 10 && i <= 99; i++) {
            if (i * i >= begin && i * i <= end) {
                counter++;
            }
        }
        return (counter);
    }
}
