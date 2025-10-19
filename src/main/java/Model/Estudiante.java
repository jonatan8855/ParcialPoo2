/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Jonatan
 */
public class Estudiante  extends Persona{
    
    public Estudiante(String nombre, String direccion, String telefono, String fechaNacimiento) {
        super(nombre, direccion, telefono, fechaNacimiento);
    }
    
    private String codigo;
    private String programa;

    public Estudiante(String nombre, String direccion, String telefono, String fechaNacimiento,
                      String codigo, String programa) {
        super(nombre, direccion, telefono, fechaNacimiento);
        this.codigo = codigo;
        this.programa = programa;
    }

 
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Código: " + codigo);
        System.out.println("Programa: " + programa);
        System.out.println("-----------------------------");
    }
}
