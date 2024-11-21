package Sistema.Bancario;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String numeroCuenta;
    private double saldo;
    private List<Transaccion> movimientos;

    public Cliente(String nombre, String numeroCuenta, double saldoInicial) {
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
        this.movimientos = new ArrayList<>();
    }

    // Métodos de acceso
    public String getNombre() {return nombre;}
    public String getNumeroCuenta() {return numeroCuenta;}
    public double getSaldo() {return saldo;}
    public void setSaldo(double saldo) {this.saldo = saldo;}
    public void agregarTransaccion(Transaccion transaccion) {this.movimientos.add(transaccion);}

    // Mostrar movimientos
    public void mostrarMovimientos() {
        for (Transaccion trans : movimientos) {
            System.out.println(trans);
        }
    }
}

