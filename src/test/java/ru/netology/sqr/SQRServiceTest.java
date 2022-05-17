package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    void calcCountSqr(int lowlimit, int uplimit, int expected) {
        SQRService service = new SQRService();
        int actual = service.calcCountSqr(lowlimit, uplimit);
        assertEquals(expected, actual);
    }
}