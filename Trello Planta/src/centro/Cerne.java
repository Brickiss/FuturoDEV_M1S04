package centro;

import botanica.Planta;
public class Cerne {
    public static void main(String[] args) {

     Planta arvore = new Planta();

        arvore.nome = "Goiabeira";
        arvore.tipo = "Frutífera";
        arvore.necessidadeDeAgua = 25.5;

        arvore.calcularNecessidadeDeAgua(1, 24.2);
        arvore.irrigar();


    }
}
