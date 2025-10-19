/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Jonatan
 */
public class Colegio {
    
     private Profesor[] profesores;
    private Estudiante[] estudiantes;
    private int numProfesores;
    private int numEstudiantes;

    public Colegio(int maxProfesores, int maxEstudiantes) {
        profesores = new Profesor[maxProfesores];
        estudiantes = new Estudiante[maxEstudiantes];
        numProfesores = 0;
        numEstudiantes = 0;
    }

    public void agregarProfesor(Profesor p) {
        if (numProfesores < profesores.length) {
            profesores[numProfesores++] = p;
        }
    }

    public void agregarEstudiante(Estudiante e) {
        if (numEstudiantes < estudiantes.length) {
            estudiantes[numEstudiantes++] = e;
        }
    }

    public void mostrarProfesores() {
        System.out.println("=== lista de profesores ===");
        for (int i = 0; i < numProfesores; i++) {
            profesores[i].mostrarInfo();
        }
    }

    public void mostrarEstudiantes() {
        System.out.println("=== lista de estudiantes ===");
        for (int i = 0; i < numEstudiantes; i++) {
            estudiantes[i].mostrarInfo();
        }
    }
    
}
