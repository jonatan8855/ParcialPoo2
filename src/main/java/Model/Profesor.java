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

    public double calcularSalarioMensual() {
        double pago = salarioHora * horasMes;
        double extra = pago * 0.20; 
        return pago + extra;
    }

    public double calcularPrestaciones() {
        return calcularSalarioMensual() * 0.17;
    }
 
    public String getCedula() {
        return cedula;
    }

    public String getArea() {
        return area;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public int getHorasMes() {
        return horasMes;
    }
}
