package principal;

import atmosfera.EmissaoDeCarbono;
public class Cerne {
    public static void main(String[] args) {

        EmissaoDeCarbono atividade1 = new EmissaoDeCarbono();
            atividade1.atividade = "Dirigir";
            atividade1.qtdEmissao = 20.5;

            atividade1.calcularEmissaoCO2(90);
            atividade1.calcularEmissaoCO2(1440);

            EmissaoDeCarbono atividade2 = new EmissaoDeCarbono();
            atividade2.atividade = "Termo-elétricas";
            atividade2.qtdEmissao = 1200.0;

            atividade2.calcularEmissaoCO2(90);
            atividade2.calcularEmissaoCO2(1440);


            EmissaoDeCarbono atividade3 = new EmissaoDeCarbono();
            atividade3.atividade = "Pecuária";
            atividade3.qtdEmissao = 171000.0;

            atividade3.calcularEmissaoCO2(90);
            atividade3.calcularEmissaoCO2(1440);


    }
}
