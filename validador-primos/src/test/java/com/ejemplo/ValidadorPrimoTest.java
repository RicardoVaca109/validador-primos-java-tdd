package com.ejemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorPrimoTest {

    @Test
    public void testUnoNoEsPrimo() {
        // 🚨 Falla porque ValidadorPrimo aún no existe
        assertFalse(ValidadorPrimo.esPrimo(1));
    }
    @Test
    public void testDosEsPrimo() {
        assertTrue(ValidadorPrimo.esPrimo(2));
    }

    @Test
    public void testTresEsPrimo() {
        assertTrue(ValidadorPrimo.esPrimo(3));
    }
    @Test
    public void testCincoEsPrimo() {
        assertTrue(ValidadorPrimo.esPrimo(5));
    }

    @Test
    public void testVeintitresEsPrimo() {
        assertTrue(ValidadorPrimo.esPrimo(23));
    }

    @Test
    public void testTreintaEsPrimo() {
        assertFalse(ValidadorPrimo.esPrimo(30));
    }

    @Test
    public void testCuarentaidosEsPrimo() {
        assertFalse(ValidadorPrimo.esPrimo(42));
    }

    @Test
    public void testCincuentaitresEsPrimo() {
        assertTrue(ValidadorPrimo.esPrimo(53));
    }

    @Test
    public void testSensentaisieteEsPrimo() {
        assertTrue(ValidadorPrimo.esPrimo(67));
    }
}