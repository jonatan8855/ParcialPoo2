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
public class ColegioTest {
    
      @Test
    public void testAgregarProfesorYEstudiante() {
        Colegio colegio = new Colegio(5, 5);

        Profesor prof = new Profesor("Ana", "Calle 5", "300456", "02/02/1990",
                                     "456", "Física", 40000, 100);
        Estudiante est = new Estudiante("Laura", "Calle 10", "310567890", "10/10/2000", "20251");

        colegio.agregarProfesor(prof);
        colegio.agregarEstudiante(est);

        assertNotNull(prof);
        assertNotNull(est);
    } 
    
}
