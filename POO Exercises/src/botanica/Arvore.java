package botanica;

public class Arvore {

    public String nome;
    public String tipo;
    public double altura;


    public void exibirInformacoes(){
        System.out.println("Nome da árvore: " + nome);
        System.out.println("Tipo de árvore: " + tipo);
        System.out.println("Altura da árvore em metros: " + altura);
    }
    public  void  calcularOxigenio(){
        double oxi = altura * 10;
        System.out.printf("Quantidade de oxigênio (em gramas) produzidos pela árvore %s por dia: %.2f",nome ,oxi);

    }

}
