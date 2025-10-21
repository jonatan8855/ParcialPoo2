/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import Model.Profesor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author Jonatan
 */


public class ProfesorTest {

     @Test
    public void testCalcularSalarioMensual() {
        Profesor p = new Profesor("Juan", "Calle 123", "3214567890", "01/01/1990",
                "1001", "Matemáticas", 50, 100);
        
        double esperado = 50 * 100 * 1.20; // 20% extra
        assertEquals(esperado, p.calcularSalarioMensual(), 0.001);
    }

    @Test
    public void testCalcularPrestaciones() {
        Profesor p = new Profesor("Juan", "Calle 123", "3214567890", "01/01/1990",
                "1001", "Matemáticas", 50, 100);
        
        double esperado = (50 * 100 * 1.20) * 0.17;
        assertEquals(esperado, p.calcularPrestaciones(), 0.001);
    }
}
