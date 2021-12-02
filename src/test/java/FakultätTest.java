import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FakultätTest {

    @Test
    void Test0() {
        assertEquals(1,  Fakultät.Calculation(0));
    }

    @Test
    void Test1() {
        assertEquals(1,  Fakultät.Calculation(1));
    }

    @Test
    void Test3() {
        assertEquals(2,  Fakultät.Calculation(2));
    }

    @Test
    void Test4() {
        assertEquals(6,  Fakultät.Calculation(3));
    }
}