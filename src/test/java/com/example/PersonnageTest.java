package com.example;
import com.example.Personnage;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PersonnageTest {

    @Test
    public void testConstructeur() 
    {
        Personnage p1 = new Personnage(null, 0, 0, 0);

        Personnage p2 = new Personnage("Test", 0, 0, 1000);

        Personnage p3 = new Personnage("Test", -1, -5, 0);

        assertThrows(IllegalArgumentException.class, () -> new Personnage(null, 0, 0, -1));
    }

    @Test
    public void testDeplacement()
    {
        Personnage p = new Personnage("Test", 0, 0, 100);

        p.deplacer(10, 20);
        assertEquals(10, p.getX());
        assertEquals(20, p.getY());

        p.deplacer(-10, -20);
        assertEquals(0, p.getX());
        assertEquals(0, p.getY());
    }

    @Test
    public void testSubirDegats()
    {
        Personnage p = new Personnage("Test", 0, 0, 100);

        p.subirDegats(50);
        assertEquals(50, p.getPointsDeVie());
        assertFalse(p.estHorsJeu());

        p.subirDegats(1000);
        assertEquals(0, p.getPointsDeVie());
        assertTrue(p.estHorsJeu());
    }
}
