package Sistema.Bancario;

import java.util.Scanner;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);

    public static void menuEmpleado() {
        // Simulamos un empleado accediendo al sistema.
        CajeroAutomatico cajero = new CajeroAutomatico(10000);  // Cajero con dinero inicial
        while (true) {
            System.out.println("Menú Empleado:");
            System.out.println("1. Ver transacciones");
            System.out.println("2. Reponer dinero en cajero");
            System.out.println("3. Salir");

            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    // Mostrar todas las transacciones
                    break;
                case 2:
                    // Reponer dinero en el cajero
                    System.out.println("Ingrese el monto a reponer: ");
                    double monto = scanner.nextDouble();
                    cajero.reponerDinero(monto);
                    break;
                case 3:
                    return;  // Salir
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    public static void menuCliente(Cliente cliente, CajeroAutomatico cajero) {
        // Simulamos que un cliente inicia sesión
        while (true) {
            System.out.println("Menú Cliente:");
            System.out.println("1. Ver saldo");
            System.out.println("2. Realizar depósito");
            System.out.println("3. Realizar retiro");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    // Mostrar saldo
                    System.out.println("Saldo: " + cliente.getSaldo());
                    break;
                case 2:
                    // Realizar depósito
                    System.out.println("Ingrese monto a depositar: ");
                    double deposito = scanner.nextDouble();
                    cajero.realizarDeposito(cliente, deposito);
                    break;
                case 3:
                    // Realizar retiro
                    System.out.println("Ingrese monto a retirar: ");
                    double retiro = scanner.nextDouble();
                    cajero.realizarRetiro(cliente, retiro);
                    break;
                case 4:
                    return;  // Salir
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
