package saude;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class PerfilDeSaude {


    private String nome;
    private String sobrenome;
    private String sexo;
    private LocalDate dataNascimento;
    private double altura; // em metros
    private double peso;   // em quilogramas

    // Construtor
    public PerfilDeSaude(String nome, String sobrenome, String sexo,
                         String dataNascimento, double altura, double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.dataNascimento = LocalDate.parse(dataNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.altura = altura;
        this.peso = peso;
    }

    // Métodos get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataNascimento() {
        return dataNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = LocalDate.parse(dataNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // Calcula a idade em anos
    public int calcularIdade() {
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }

    // Calcula o IMC
    public double calcularIMC() {
        return peso / (altura * altura);
    }

    // Retorna a categoria do IMC
    public String getCategoriaIMC() {
        double imc = calcularIMC();

        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25) {
            return "Peso normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else if (imc < 35) {
            return "Obesidade grau I";
        } else if (imc < 40) {
            return "Obesidade grau II";
        } else {
            return "Obesidade grau III";
        }
    }

    // Calcula a frequência cardíaca máxima
    public int calcularFrequenciaCardiacaMaxima() {
        return 220 - calcularIdade();
    }

    // Calcula a frequência cardíaca alvo (50-85% da máxima)
    public String calcularFrequenciaCardiacaAlvo() {
        int max = calcularFrequenciaCardiacaMaxima();
        int minimo = (int) (max * 0.5);
        int maximo = (int) (max * 0.85);
        return minimo + " - " + maximo + " bpm";
    }
}
