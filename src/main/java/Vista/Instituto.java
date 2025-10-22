 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Vista;
import javax.swing.JOptionPane;
import Model.*;


/**
 *
 * @author Jonatan
 */
public class Instituto {
    
 public static void main(String[] args) {
         
        Colegio colegio = new Colegio(10, 10); // capacidad para 10 profes y 10 estudiantes
        int opcion;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                    === MENU PRINCIPAL ===
                    1. Registrar Profesor
                    2. Registrar Estudiante
                    3. Ver Profesores (ordenados por salario)
                    4. Ver Estudiantes
                    5. Salir
                    """));

            switch (opcion) {
                case 1 -> registrarProfesor(colegio);
                case 2 -> registrarEstudiante(colegio);
                case 3 -> colegio.mostrarProfesoresPorSalario();
                case 4 -> colegio.mostrarEstudiantes();
                case 5 -> JOptionPane.showMessageDialog(null, "saliendo del sistema...");
                default -> JOptionPane.showMessageDialog(null, "opcion no valida.");
            }

        } while (opcion != 5);
    }

    private static void registrarProfesor(Colegio colegio) {
        String nombre = JOptionPane.showInputDialog("nombre del profesor:");
        String direccion = JOptionPane.showInputDialog("direccion:");
        String telefono = JOptionPane.showInputDialog("telefono:");
        String fechaNac = JOptionPane.showInputDialog("fecha de nacimiento:");
        String cedula = JOptionPane.showInputDialog("cedula:");
        String area = JOptionPane.showInputDialog("area en la que trabaja:");

        double salarioHora = Double.parseDouble(JOptionPane.showInputDialog("salario por hora:"));
        int horasMes = Integer.parseInt(JOptionPane.showInputDialog("horas del mes:"));

        Profesor prof = new Profesor(nombre, direccion, telefono, fechaNac, cedula, area, salarioHora, horasMes);
        colegio.agregarProfesor(prof);

        JOptionPane.showMessageDialog(null, "pofesor registrado correctamente.");
    }

    private static void registrarEstudiante(Colegio colegio) {
        String nombre = JOptionPane.showInputDialog("nombre del estudiante:");
        String direccion = JOptionPane.showInputDialog("direccion:");
        String telefono = JOptionPane.showInputDialog("telefono:");
        String fechaNac = JOptionPane.showInputDialog("fecha de nacimiento:");
        String codigo = JOptionPane.showInputDialog("codigo del estudiante:");

        Estudiante est = new Estudiante(nombre, direccion, telefono, fechaNac, codigo);
        colegio.agregarEstudiante(est);

        JOptionPane.showMessageDialog(null, "estudiante registrado correctamente.");
    }
}
