package botanica;

public class Planta {

    public String nome;
    public String tipo;
    public double necessidadeDeAgua;


    public void calcularNecessidadeDeAgua(int qtdSemanas, double areaPlantada) {

        double totalAgua = necessidadeDeAgua * qtdSemanas * areaPlantada;
        System.out.printf("Água necessária para %s : %.2f litros em %d semanas %n", nome, totalAgua, qtdSemanas);
    }
    public void irrigar(){
            System.out.printf("%s (%s) foi irrigada com sucesso %n", nome, tipo);
        }
    }





