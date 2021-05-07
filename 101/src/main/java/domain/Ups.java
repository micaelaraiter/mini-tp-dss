package domain;

public class Ups implements  Trasportista{

    private Integer politica = 50;

    public Integer calcularPrecio(Envio envio){
        return politica;
    }
}
