package botanica;

public class Arvore {

    public String nome;
    public String tipo;
    public double altura;


    public void exibirInformacoes(){
        System.out.println(nome);
        System.out.println(tipo);
        System.out.println(altura);
    }
    public  void  calcularOxigenio(double oxigenio){
        double oxi = altura * 10;
        System.out.println(oxi);
    }

}
