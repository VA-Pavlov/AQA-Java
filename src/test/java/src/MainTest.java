package src;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    @DisplayName("Проверка корректности расчетов")
    void factorial() {
        assertEquals(Main.factorial(5),120);
        assertEquals(Main.factorial(10),3628800);
        assertEquals(Main.factorial(0),1);
    }
}