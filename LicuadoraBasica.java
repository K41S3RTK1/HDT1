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
            System.out.println("Licuadora encendida.");
            return true;
        }
        System.out.println("La licuadora ya está encendida.");
        return false;
    }

    @Override
    public boolean apagarLicuadora() {
        if (encendida) {
            encendida = false;
            velocidadActual = 0;
            System.out.println("Licuadora apagada.");
            return true;
        }
        System.out.println("La licuadora ya está apagada.");
        return false;
    }

    @Override
    public boolean llenarLicuadora() {
        if (!llena) {
            llena = true;
            System.out.println("Licuadora llena.");
            return true;
        }
        System.out.println("La licuadora ya está llena.");
        return false;
    }

    @Override
    public boolean vaciarLicuadora() {
        if (llena) {
            llena = false;
            System.out.println("Licuadora vaciada.");
            return true;
        }
        System.out.println("La licuadora ya está vacía.");
        return false;
    }

    @Override
    public boolean incrementarVelocidad(int velocidad) {
        if (encendida && llena && velocidad == velocidadActual + 1 && velocidad <= 10) {
            velocidadActual = velocidad;
            System.out.println("Velocidad incrementada a " + velocidadActual);
            return true;
        }
        System.out.println("No se puede incrementar la velocidad. Asegúrese de que la licuadora esté encendida, llena y que la velocidad sea válida.");
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

    public void encender() {
        encenderLicuadora();
    }

    public void apagar() {
        apagarLicuadora();
    }

    public void llenar() {
        llenarLicuadora();
    }

    public void vaciar() {
        vaciarLicuadora();
    }

    public void incrementarVelocidad() {
        incrementarVelocidad(velocidadActual + 1);
    }

    public void mostrarVelocidad() {
        System.out.println("Velocidad actual: " + obtenerVelocidadActual());
    }
}
