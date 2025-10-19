/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Jonatan
 */
public class Profesor extends Persona {
    
    public Profesor(String nombre, String direccion, String telefono, String fechaNacimiento) {
        super(nombre, direccion, telefono, fechaNacimiento);
    }
    
       private String cedula;
    private String area;
    private double salarioHora;
    private int horasMes;

    public Profesor(String nombre, String direccion, String telefono, String fechaNacimiento,
                    String cedula, String area, double salarioHora, int horasMes) {
        super(nombre, direccion, telefono, fechaNacimiento);
        this.cedula = cedula;
        this.area = area;
        this.salarioHora = salarioHora;
        this.horasMes = horasMes;
    }

    // Método para calcular el pago mensual (con el 20%)
    public double calcularPagoMensual() {
        double pago = salarioHora * horasMes;
        double extra = pago * 0.20; // preparación de clase
        return pago + extra;
    }

    // Método para calcular las prestaciones
    public double calcularPrestaciones() {
        return calcularPagoMensual() * 0.17;
    }

    // Polimorfismo: sobreescritura
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Cédula: " + cedula);
        System.out.println("Área: " + area);
        System.out.println("Pago mensual: " + calcularPagoMensual());
        System.out.println("Prestaciones: " + calcularPrestaciones());
        System.out.println("-----------------------------");
    }
    
}
