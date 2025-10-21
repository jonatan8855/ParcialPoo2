/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import Model.Estudiante;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Jonatan
 */
public class EstudianteTest {
    
    
    @Test
    public void testDatosEstudiante() {
        
        Estudiante est = new Estudiante("Laura", "Calle 10", "310567890", "10/10/2000", "20251");
        
        assertEquals("Laura", est.getNombre());
        assertEquals("Calle 10", est.getDireccion());
        assertEquals("310567890", est.getTelefono());
        assertEquals("10/10/2000", est.getFechaNacimiento());
        assertEquals("20251", est.getCodigo());
    }
    
}
