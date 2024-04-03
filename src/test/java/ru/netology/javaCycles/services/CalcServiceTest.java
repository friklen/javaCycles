package ru.netology.javaCycles.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.javaCycles.services.CalcService;

public class CalcServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/data.csv")
    public void testCalcService(int expected, int income, int expenses, int threshold) {
        CalcService service = new CalcService();
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }

    //   @Test
    //   public void testCalcServiceUnderLimit1(){
    //       CalcService service = new CalcService();
    //       int expected = 3;
    //       int actual = service.calculate(10_000,3_000,20_000);
    //    }
    //   @Test
    //   public void testCalcServiceUnderLimit2(){
    //       CalcService service = new CalcService();
    //       int expected = 2;
    //       int actual = service.calculate(100_000,60_000,150_000);
    //       Assertions.assertEquals(expected, actual);
    //   }

}
