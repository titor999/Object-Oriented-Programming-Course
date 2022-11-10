package module2.week5.task1.b;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static module2.week5.task1.b.Stonks.maxProfit;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StonksTest {

    @BeforeAll
    static void setUp() {
        System.out.println("Test started");
    }

    @AfterAll
    static void tearDown() {
        System.out.println("Test finish");
    }

    @Test
    @DisplayName("Test for max profit")
    void maxProfitTest() {
        assertEquals(5, maxProfit(List.of(7,1,5,3,6,4)));
        assertEquals(0, maxProfit(List.of(7,6,4,3,1)));
    }
}