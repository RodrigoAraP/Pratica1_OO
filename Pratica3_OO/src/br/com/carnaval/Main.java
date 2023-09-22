package br.com.carnaval;

import br.com.carnaval.Camarote;
import br.com.carnaval.Ingresso;
import br.com.carnaval.Normal;
import br.com.carnaval.Vip;

public class Main {
    public static void main(String[] args) {
        Normal n1 = new Normal(100);
        n1.imprimeIngresso();

        Vip v1 = new Vip(100,50);
        v1.imprimeIngresso();

        Camarote c1 = new Camarote(100,500,"Camarote 1");
        c1.imprimeIngresso();
    }
}