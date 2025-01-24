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
        @Override
    public boolean encenderLicuadora() {
        if (!encendida) {
            encendida = true;
            return true;
        }
        return false;
    }

     @Override
    public boolean apagarLicuadora() {
        if (encendida) {
            encendida = false;
            velocidadActual = 0; // Restablece la velocidad al apagar
            return true;
        }
        return false;
    }

      @Override
    public boolean llenarLicuadora() {
        if (!llena) {
            llena = true;
            return true;
        }
        return false;
    }

    @Override
    public boolean vaciarLicuadora() {
        if (llena) {
            llena = false;
            return true;
        }
        return false;
    }

    @Override
    public boolean incrementarVelocidad(int velocidad) {
        if (encendida && llena && velocidad == velocidadActual + 1 && velocidad <= 10) {
            velocidadActual = velocidad;
            return true;
        }
        return false;
    }

    @Override
    public int obtenerVelocidadActual() {
        return velocidadActual;
    }

    @Override
    public boolean estaLlena() {
        return llena;
    }
}


}
