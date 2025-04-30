package saude;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class FrequenciaCardiaca {


        private String nome;
        private String sobrenome;
        private LocalDate dataNascimento;

        // Construtor
        public FrequenciaCardiaca(String nome, String sobrenome, LocalDate dataNascimento) {
            this.nome = nome;
            this.sobrenome = sobrenome;
            this.dataNascimento = dataNascimento;
        }

        // Getters e Setters
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

        public LocalDate getDataNascimento() {
            return dataNascimento;
        }

        public void setDataNascimento(LocalDate dataNascimento) {
            this.dataNascimento = dataNascimento;
        }

        // Método para calcular idade
        public int calcularIdade() {
            return Period.between(dataNascimento, LocalDate.now()).getYears();
        }

        // Método para calcular frequência cardíaca máxima
        public int calcularFrequenciaMaxima() {
            return 220 - calcularIdade();
        }

        // Método para calcular frequência cardíaca alvo (intervalo)
        public String calcularFrequenciaAlvo() {
            int max = calcularFrequenciaMaxima();
            int min = (int) (max * 0.5);
            int maxAlvo = (int) (max * 0.85);
            return min + " - " + maxAlvo + " bpm";
        }
    }



