public class Main {
    public static void main(String[] args) {
        Licuadora licuadora = new LicuadoraBasica();
        System.out.println("--- Menú de la Licuadora ---");

        System.out.println("Encendiendo la licuadora...");
        licuadora.encenderLicuadora();

        System.out.println("Llenando la licuadora...");
        licuadora.llenarLicuadora();

        System.out.println("Incrementando la velocidad a 1...");
        licuadora.incrementarVelocidad(1);

        System.out.println("Velocidad actual: " + licuadora.obtenerVelocidadActual());

        System.out.println("Apagando la licuadora...");
        licuadora.apagarLicuadora();
    }
}