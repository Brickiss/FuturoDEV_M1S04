package centro;

import saude.FrequenciaCardiaca;
import java.time.LocalDate;
import java.util.Scanner;

public class cerne {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite seu nome:");
            String nome = scanner.nextLine();

            System.out.println("Digite seu sobrenome:");
            String sobrenome = scanner.nextLine();

            System.out.println("Digite sua data de nascimento (AAAA-MM-DD):");
            LocalDate dataNascimento = LocalDate.parse(scanner.nextLine());

            FrequenciaCardiaca pessoa = new FrequenciaCardiaca(nome, sobrenome, dataNascimento);

            System.out.println("\nInformações:");
            System.out.println("Nome: " + pessoa.getNome() + " " + pessoa.getSobrenome());
            System.out.println("Data de Nascimento: " + pessoa.getDataNascimento());
            System.out.println("Idade: " + pessoa.calcularIdade() + " anos");
            System.out.println("Frequência Cardíaca Máxima: " + pessoa.calcularFrequenciaMaxima() + " bpm");
            System.out.println("Frequência Cardíaca Alvo: " + pessoa.calcularFrequenciaAlvo());

            scanner.close();
        }
    }

