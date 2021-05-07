package domain;

public class Envio {
    private Trasportista trasportista;
    private Paquete paquete;
    private Direccion direccionDestino;
    private Direccion direccionSalida;

    public Integer calcularDistancia(){
        return direccionDestino.distanciaA(direccionSalida);
    }


    public Integer calcular(){
        return trasportista.calcularPrecio(this);
    }

    public boolean esLocal(){
        return (this.calcularDistancia() < 100);
    }

    public Trasportista getTrasportista() {
         return trasportista;
    }
}
