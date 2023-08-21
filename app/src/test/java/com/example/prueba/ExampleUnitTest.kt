package com.example.prueba

import org.junit.Test

import org.junit.Assert.*

class MainActivityTest {

    @Test
    fun testCompararCadenasIguales() {
        val result = compararCadenas("hola", "hola")
        assertEquals("Las cadenas son iguales", result)
    }

    @Test
    fun testCompararCadenasDiferentes() {
        val result = compararCadenas("hola", "mundo")
        assertEquals("Las cadenas son diferentes", result)
    }

    private fun compararCadenas(cadena1: String, cadena2: String): String {
        return if (cadena1 == cadena2) {
            "Las cadenas son iguales"
        } else {
            "Las cadenas son diferentes"
        }
    }
}