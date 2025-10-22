/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Arrays;

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
        } else {
            System.out.println("no se pueden registrar mas profesores.");
        }
    }

    public void agregarEstudiante(Estudiante e) {
        if (numEstudiantes < estudiantes.length) {
            estudiantes[numEstudiantes++] = e;
        } else {
            System.out.println("no se pueden registrar mas estudiantes.");
        }
    }

    

    public void mostrarProfesoresPorSalario() {
    
        if (numProfesores == 0) {
            System.out.println("no hay profesores registrados.");
            return;
        } else {
        }

        
        Arrays.sort(profesores, 0, numProfesores, 
            (p1, p2) -> Double.compare(p1.calcularSalarioMensual(), p2.calcularSalarioMensual())
        );

        System.out.println("=== Profesores ordenados por salario (menor a mayor) ===");
        double totalPrestaciones = 0;
        for (int i = 0; i < numProfesores; i++) {
            profesores[i].mostrarInfo();
            totalPrestaciones += profesores[i].calcularPrestaciones();
        }
        System.out.println("total de las prestaciones sociales : " + totalPrestaciones);
    }

    public void mostrarEstudiantes() {
        if (numEstudiantes == 0) {
            System.out.println("no hay estudiantes registrados.");
            return;
        }

        System.out.println("=== lista de estudiantes ===");
        for (int i = 0; i < numEstudiantes; i++) {
            estudiantes[i].mostrarInfo();
        }
        
    }
    
}
