package domain;

public class Standar implements  Trasportista {


    public Integer calcularPrecio(Envio envio) {

        if (envio.esLocal()) {
            return 2;
        }
        return 3;
    }
}

