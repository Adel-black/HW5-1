package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SQRServiceTest {

    @Test
    public void shouldCalcExact() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.calcSqrt(200, 300);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcInexact() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calcSqrt(200, 200);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcExactLimitValues() {
        SQRService service = new SQRService();

        int expected = 90;
        int actual = service.calcSqrt(100, 9801);

        Assertions.assertEquals(expected, actual);
    }
}
