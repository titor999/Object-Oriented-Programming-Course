package module2.week5.task1.a;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static module2.week5.task1.a.Permutations.perms;
import static org.junit.jupiter.api.Assertions.*;

class PermutationsTest {

    @BeforeAll
    static void setUp() {
        System.out.println("Test started");
    }

    @AfterAll
    static void tearDown() {
        System.out.println("Test finish");
    }

    @Test
    void permsTest() {
        Integer[][] name = {{1, 2, 3}, {1, 3, 2}, {2, 1, 3}, {2, 3, 1}, {3, 1, 2}, {3, 2, 1}};
        List<Integer> name1 = new ArrayList<>();
        name1.add(1);
        name1.add(2);
        name1.add(3);

        assertEquals(Arrays.stream(name).map(Arrays::asList).toList(), perms(name1));
    }
}