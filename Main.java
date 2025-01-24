import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LicuadoraBasica licuadora = new LicuadoraBasica();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        
        while (continuar) {
            System.out.println("--- Menú de la Licuadora ---");
            System.out.println("1. Encender licuadora");
            System.out.println("2. Apagar licuadora");
            System.out.println("3. Llenar licuadora");
            System.out.println("4. Vaciar licuadora");
            System.out.println("5. Incrementar velocidad");
            System.out.println("6. Mostrar velocidad actual");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            
            int opcion = leerEntero(scanner);
            
            switch (opcion) {
                case 1:
                    licuadora.encender();
                    break;
                case 2:
                    licuadora.apagar();
                    break;
                case 3:
                    licuadora.llenar();
                    break;
                case 4:
                    licuadora.vaciar();
                    break;
                case 5:
                    licuadora.incrementarVelocidad();
                    break;
                case 6:
                    licuadora.mostrarVelocidad();
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
            System.out.println();
        }
        scanner.close();
    }
    
    public static int leerEntero(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida. Ingrese un número válido: ");
            }
        }
    }
}
