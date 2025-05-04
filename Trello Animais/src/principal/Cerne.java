package principal;

import animalia.Animal;
public class Cerne {
    public static void main(String[] args) {

      Animal domestico = new Animal();
      domestico.nome = "Cachorro";
      domestico.som = "Latido(au au)";
      domestico.habitat = "Urbano/em casa/nas ruas das cidades";
      domestico.tipoDeAlimentacao= "Onívora";
      domestico.tipoDeMovimento = "Rápido";

      Animal selvagem = new Animal();
        selvagem.nome = "Bicho-preguiça";
        selvagem.som = "Berro (aaaah)";
        selvagem.habitat = "Florestas";
        selvagem.tipoDeAlimentacao= "Herbívora";
        selvagem.tipoDeMovimento = "Lento";


        Animal selvagem2 = new Animal();
        selvagem2.nome = "Leão";
        selvagem2.som = "Rugido(roooarr)";
        selvagem2.habitat = "Selva";
        selvagem2.tipoDeAlimentacao= "Carnívora";

        selvagem2.tipoDeMovimento = "Muito rápido";


        domestico.mover();
        domestico.emitirSom();
        domestico.alimentar();

       selvagem.mover();
       selvagem.emitirSom();
       selvagem.alimentar();

       selvagem2.mover();
       selvagem2.emitirSom();
       selvagem2.alimentar();
    }
}
