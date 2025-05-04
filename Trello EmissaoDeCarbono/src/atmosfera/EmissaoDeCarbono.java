package atmosfera;

public class EmissaoDeCarbono {

    public String atividade;
    public double qtdEmissao;



    public void calcularEmissaoCO2(double minutos){
        System.out.printf("Quantidade de kg de CO2 emitido na atmosfera em 1 hora de atividade de %s: %.2f kg/h %n", atividade, qtdEmissao);
        double hora = (minutos / 60);
        double emissao = qtdEmissao * hora ;
        System.out.printf("Quantidade de Emissão De Carbono para atmosfera produzida por %s em %.2f horas: %.2f kg/%.2fh %n ",atividade, hora, emissao, hora);

    }

}
