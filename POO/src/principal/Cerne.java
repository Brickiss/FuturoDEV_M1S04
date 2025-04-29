package principal;

import automoveis.Carro;

import static automoveis.Carro.*;
public class Cerne {
    public static void main(String[] args) {

        Carro uno = new Carro();
        uno.qtdPortas = 2;
        System.out.println(uno.qtdPortas);


        Carro Sandero = new Carro();
        Sandero.qtdPortas = 4;
        System.out.println(Sandero.qtdPortas);
    }
}
