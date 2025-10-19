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
    
    private String codigo;

    public Estudiante(String nombre, String direccion, String telefono, String fechaNacimiento, String codigo) {
        super(nombre, direccion, telefono, fechaNacimiento);
        this.codigo = codigo;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Código: " + codigo);
        System.out.println("-----------------------------");
    }
}
