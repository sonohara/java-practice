import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

public class HelloTest {
    @Test
    public void test1() {
        System.out.println("test1");

        Hello h = new Hello();
        assertEquals(h.hello(), "Hello world!");
    }

    @Test
    public void test2() {
        System.out.println("test2");
    }

    // ↓Before/After 系がなぜか実行されない...なぞ
    @BeforeAll
    static void beforeAll1() {
        System.out.println("BeforeAll1");
    }

    @BeforeAll
    static void beforeAll2() {
        System.out.println("BeforeAll2");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("BeforeEach");
    }

    @AfterEach
    void afterEach() {
        System.out.println("AfterEach");
    }

    @AfterAll
    static void afterAll1() {
        System.out.println("afterAll1");
    }

    @AfterAll
    static void afterAll2() {
        System.out.println("afterAll2");
    }
}
