package Sistema.Bancario;

import java.util.Date;

public class Transaccion {
    private Date fecha;
    private String tipo;  // Ejemplo: "Depósito", "Retiro", "Transferencia"
    private double monto;
    private String cuentaDestino;  // Solo si es transferencia

    public Transaccion(String tipo, double monto) {
        this.fecha = new Date();  // Fecha actual
        this.tipo = tipo;
        this.monto = monto;
    }

    public Transaccion(String tipo, double monto, String cuentaDestino) {
        this(tipo, monto);
        this.cuentaDestino = cuentaDestino;
    }

    @Override
    public String toString() {
        String transaccion = "Fecha: " + fecha + ", Tipo: " + tipo + ", Monto: " + monto;
        if (cuentaDestino != null) {
            transaccion += ", Cuenta Destino: " + cuentaDestino;
        }
        return transaccion;
    }
}
