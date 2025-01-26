public interface Licuadora {
    boolean encenderLicuadora();
    boolean apagarLicuadora();
    boolean llenarLicuadora();
    boolean vaciarLicuadora();
    boolean incrementarVelocidad(int velocidad);
    int obtenerVelocidadActual();
    boolean estaLlena();
}
