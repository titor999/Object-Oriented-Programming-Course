package module2.week5.task1.c;

import org.junit.jupiter.api.*;

import java.util.List;

import static module2.week5.task1.c.WaterContainer.maxArea;
import static org.junit.jupiter.api.Assertions.*;

class WaterContainerTest {

    @BeforeAll
    static void setUp() {
        System.out.println("Test started");
    }

    @AfterAll
    static void tearDown() {
        System.out.println("Test finish");
    }

    @Test
    @DisplayName("Test fo Water Container")
    void maxAreaTest() {
        assertEquals(49, maxArea(List.of(1,8,6,2,5,4,8,3,7)));
        assertEquals(1, maxArea(List.of(1, 1)));
        assertEquals(16, maxArea(List.of(4,3,2,1,4)));
        assertEquals(2, maxArea(List.of(1,2,1)));
    }
}