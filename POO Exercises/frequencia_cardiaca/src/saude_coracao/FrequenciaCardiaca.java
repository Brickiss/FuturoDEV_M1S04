package saude_coracao;

import java.time.LocalDate;
import java.time.Period;

public class FrequenciaCardiaca {

        public String nome;
        public String sobrenome;
        public LocalDate dataNascimento;

        public FrequenciaCardiaca(String nome, String sobrenome, LocalDate dataNascimento) {
            this.nome = nome;
            this.sobrenome = sobrenome;
            this.dataNascimento = dataNascimento;
        }

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


        public int calcularIdade() {
            return Period.between(dataNascimento, LocalDate.now()).getYears();
        }


        public int calcularFrequenciaMaxima() {
            return 220 - calcularIdade();
        }
        public String calcularFrequenciaAlvo() {
            int max = calcularFrequenciaMaxima();
            int min = (int) (max * 0.5);
            int maxAlvo = (int) (max * 0.85);
            return min + " - " + maxAlvo + " bpm";
        }
    }




