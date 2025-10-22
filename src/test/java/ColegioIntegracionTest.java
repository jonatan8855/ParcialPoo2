/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import Model.Colegio;
import Model.Estudiante;
import Model.Profesor;
 
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Jonatan
 */
public class ColegioIntegracionTest {
    
    @Test
    public void testMostrarProfesoresPorSalario() {
        Colegio colegio = new Colegio(3, 3);

        Profesor p1 = new Profesor("Ana", "Calle 2", "300456", "02/02/1990",
                                   "456", "Física", 40000, 100);
        Profesor p2 = new Profesor("Luis", "Calle 3", "301234", "03/03/1985",
                                   "789", "Matemáticas", 30000, 90);

        colegio.agregarProfesor(p1);
        colegio.agregarProfesor(p2);

        double s1 = p1.calcularSalarioMensual();
        double s2 = p2.calcularSalarioMensual();
        assertTrue(s1 > s2);  // Ana gana más que Luis
    }

    @Test
    public void testMostrarEstudiantes() {
        Colegio colegio = new Colegio(2, 2);

        Estudiante e1 = new Estudiante("Laura", "Calle 10", "310567890", "10/10/2000", "20251");
        Estudiante e2 = new Estudiante("Pedro", "Calle 12", "310987654", "05/05/2001", "20252");

        colegio.agregarEstudiante(e1);
        colegio.agregarEstudiante(e2);
        assertNotNull(e1);
        assertNotNull(e2);
        assertEquals("20252", e2.getCodigo());
    }
     
}
