package br.com.carnaval;

import org.w3c.dom.ls.LSOutput;

public class Normal extends Ingresso{
    public Normal(double valorIngresso) {
        super(valorIngresso);
    }

    public void imprimeIngresso(){
        System.out.println("Ingresso normal: R$ " + getValorIngresso());
    }
}
