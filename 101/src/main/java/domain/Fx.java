package domain;

public class Fx implements  Trasportista{
    private Integer politica = 50;

    public Integer calcularPrecio(Envio envio){
        return politica;
    }
}
