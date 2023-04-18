package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class RestScheduleServiceTest {
    @Test
    public void test1 (){
        RestScheduleService service = new RestScheduleService();
        int income = 10_000;
        int expense = 3_000;
        int threshold = 20_000;

        int actual = service.calculate(income,expense,threshold);
        int expected = 3;
        Assertions.assertEquals(actual,expected);

    }
    @Test
    public void test2 (){
        RestScheduleService service = new RestScheduleService();
        int income = 100_000;
        int expense = 60_000;
        int threshold = 150_000;

        int actual = service.calculate(income,expense,threshold);
        int expected = 2;
        Assertions.assertEquals(actual,expected);

    }


}
