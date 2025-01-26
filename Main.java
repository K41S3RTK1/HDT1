import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LicuadoraBasica licuadora = new LicuadoraBasica();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("¿Qué desea hacer?");
            System.out.println("1) Llenar licuadora");
            System.out.println("2) Encender licuadora");
            System.out.println("3) Aumentar la velocidad");
            System.out.println("4) Disminuir la velocidad");
            System.out.println("5) Ver velocidad");
            System.out.println("6) Apagar licuadora");
            System.out.println("7) Vaciar licuadora");
            System.out.println("8) Salir");
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    if (licuadora.llenarLicuadora()) {
                        System.out.println("Licuadora llena.");
                    } else {
                        System.out.println("La licuadora ya está llena.");
                    }
                    break;
                case "2":
                    if (licuadora.encenderLicuadora()) {
                        System.out.println("Licuadora encendida.");
                    } else {
                        System.out.println("No se puede encender. Asegúrese de que esté llena.");
                    }
                    break;
                case "3":
                    if (licuadora.incrementarVelocidad(1)) {
                        System.out.println("Velocidad incrementada.");
                    } else {
                        System.out.println("No se puede incrementar la velocidad.");
                    }
                    break;
                case "4":
                    if (licuadora.incrementarVelocidad(-1)) {
                        System.out.println("Velocidad disminuida.");
                    } else {
                        System.out.println("No se puede disminuir la velocidad.");
                    }
                    break;
                case "5":
                    System.out.println("Velocidad actual: " + licuadora.obtenerVelocidadActual());
                    break;
                case "6":
                    if (licuadora.apagarLicuadora()) {
                        System.out.println("Licuadora apagada.");
                    } else {
                        System.out.println("La licuadora ya está apagada.");
                    }
                    break;
                case "7":
                    if (licuadora.vaciarLicuadora()) {
                        System.out.println("Licuadora vaciada.");
                    } else {
                        System.out.println("La licuadora ya está vacía.");
                    }
                    break;
                case "8":
                    continuar = false;
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }
}
