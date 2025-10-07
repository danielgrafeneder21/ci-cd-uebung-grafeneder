package com.example.cicd;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class NumberUtilsTest {

    @Test
    void isSpecialTrue() {
        assertTrue(NumberUtils.isSpecial(9));
    }
}
