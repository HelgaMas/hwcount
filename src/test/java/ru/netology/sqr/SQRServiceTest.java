package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldToCountSeveralSquares() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.countSqr(200, 300);
        assertEquals(expected, actual);
    }

    @Test
    void shouldToCountOneSquares() {
        SQRService service = new SQRService();
        int expected = 1;
        int actual = service.countSqr(90, 101);
        assertEquals(expected, actual);
    }

    @Test
    void shouldToCountAllSquares() {
        SQRService service = new SQRService();
        int expected = 90;
        int actual = service.countSqr(99, 9802);
        assertEquals(expected, actual);
    }

    @Test
    void shouldToCountZeroSquares() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.countSqr(10, 90);
        assertEquals(expected, actual);
    }
}