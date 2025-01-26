public class LicuadoraBasica implements Licuadora {
    private boolean encendido;
    private boolean llena;
    private int velocidad;

    public LicuadoraBasica() {
        this.encendido = false;
        this.llena = false;
        this.velocidad = 0;
    }

    @Override
    public boolean encenderLicuadora() {
        if (!this.encendido && this.llena) {
            this.encendido = true;
            this.velocidad = 1;
            return true;
        }
        return false;
    }

    @Override
    public boolean apagarLicuadora() {
        if (this.encendido) {
            this.encendido = false;
            this.velocidad = 0;
            return true;
        }
        return false;
    }

    @Override
    public boolean llenarLicuadora() {
        if (this.llena) {
            return false;
        } else {
            this.llena = true;
        }
        return true;
    }

    @Override
    public boolean vaciarLicuadora() {
        if (!this.llena) {
            return false;
        } else {
            this.llena = false;
        }
        return true;
    }

    @Override
    public boolean incrementarVelocidad(int velocidad) {
        if (this.encendido && this.velocidad + velocidad <= 12 && this.velocidad + velocidad >= 1) {
            this.velocidad = this.velocidad + velocidad;
            return true;
        }
        return false;
    }

    @Override
    public int obtenerVelocidadActual() {
        return this.velocidad;
    }

    @Override
    public boolean estaLlena() {
        return llena;
    }
}
