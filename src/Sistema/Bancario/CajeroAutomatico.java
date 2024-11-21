package Sistema.Bancario;

public class CajeroAutomatico {
    private double cantidadDinero;

    public CajeroAutomatico(double cantidadInicial) {this.cantidadDinero = cantidadInicial;}
    public void reponerDinero(double monto) {cantidadDinero += monto;}

    // Realizar una transacción de retiro
    public boolean realizarRetiro(Cliente cliente, double monto) {
        if (monto <= cliente.getSaldo() && monto <= cantidadDinero) {
            cliente.setSaldo(cliente.getSaldo() - monto);
            cantidadDinero -= monto;
            cliente.agregarTransaccion(new Transaccion("Retiro", monto));
            System.out.println("Retiro realizado con éxito.");
            return true;
        } else {
            System.out.println("No hay suficiente saldo en la cuenta o en el cajero.");
            return false;
        }
    }

    public void realizarDeposito(Cliente cliente, double monto) {
        cliente.setSaldo(cliente.getSaldo() + monto);
        cliente.agregarTransaccion(new Transaccion("Depósito", monto));
        System.out.println("Depósito realizado con éxito.");
    }
}
