package Sistema.Bancario;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Juan Perez", "12345", 5000.00);
        CajeroAutomatico cajero = new CajeroAutomatico(10000);

        // Menu para el cliente
        Menu.menuCliente(cliente1, cajero);

        //Menu para Empleado
        //Menu.menuEmpleado();

    }
}
