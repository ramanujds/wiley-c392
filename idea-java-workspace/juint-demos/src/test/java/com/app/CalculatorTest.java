package com.app;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CalculatorTest {

    private Logger log = LoggerFactory.getLogger(CalculatorTest.class);
    Calculator calc;

    @BeforeEach
    void setUp(){
        log.info("A test begins");
        calc = new Calculator();
    }

    @AfterEach
    void tearDown(){
        calc = null;
        log.info("A test ends");
    }

    @Test
    void addTest(){
        // Given

        // When

        // Then
        Assertions.assertEquals(0,calc.add(10,-10));
        Assertions.assertEquals(30,calc.add(10,20));
        Assertions.assertEquals(-20,calc.add(-10,-10));
    }



    @ParameterizedTest
    @CsvFileSource(resources = "/test-data.csv")
    void divideTest(int a, int b, int expected){

        Assertions.assertEquals(expected,calc.divide(a,b));


    }

    @Test
    void divideTestForException(){
        Assertions.assertThrows(ArithmeticException.class,()->calc.divide(10,0));
    }

}
