      // Implementación de la interfaz Licuadora
public class LicuadoraBasica implements Licuadora {
    private boolean encendida;
    private boolean llena;
    private int velocidadActual;

    public LicuadoraBasica() {
        this.encendida = false;
        this.llena = false;
        this.velocidadActual = 0;
    }
}
