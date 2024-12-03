package com.example;

import com.example.Plateau;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class PlateauTest {
    
    @Test
    public void testConstructeur()
    {
        assertThrows(IllegalArgumentException.class, () -> new Plateau(-10, 0));
        assertThrows(IllegalArgumentException.class, () -> new Plateau(30, -5));
        assertThrows(IllegalArgumentException.class, () -> new Plateau(-10, -36));
    }
}
