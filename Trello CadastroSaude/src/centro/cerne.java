package centro;


import saude.PerfilDeSaude;

import java.util.Scanner;
public class cerne {

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("=== Sistema de Perfil de Saúde ===");
            System.out.println("Por favor, informe seus dados:");

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Sobrenome: ");
            String sobrenome = scanner.nextLine();

            System.out.print("Sexo (M/F): ");
            String sexo = scanner.nextLine();

            System.out.print("Data de Nascimento (DD/MM/AAAA): ");
            String dataNascimento = scanner.nextLine();

            System.out.print("Altura (em metros): ");
            double altura = scanner.nextDouble();

            System.out.print("Peso (em kg): ");
            double peso = scanner.nextDouble();

            // Criar o perfil de saúde
            PerfilDeSaude perfil = new PerfilDeSaude(nome, sobrenome, sexo, dataNascimento, altura, peso);

            // Exibir resultados
            System.out.println("\n=== Relatório de Saúde ===");
            System.out.println("Nome completo: " + perfil.getNome() + " " + perfil.getSobrenome());
            System.out.println("Sexo: " + perfil.getSexo());
            System.out.println("Data de Nascimento: " + perfil.getDataNascimento());
            System.out.println("Altura: " + perfil.getAltura() + " m");
            System.out.println("Peso: " + perfil.getPeso() + " kg");
            System.out.println("Idade: " + perfil.calcularIdade() + " anos");

            double imc = perfil.calcularIMC();
            System.out.printf("IMC: %.2f (%s)\n", imc, perfil.getCategoriaIMC());

            System.out.println("Frequência Cardíaca Máxima: " +
                    perfil.calcularFrequenciaCardiacaMaxima() + " bpm");
            System.out.println("Frequência Cardíaca Alvo: " +
                    perfil.calcularFrequenciaCardiacaAlvo());

            scanner.close();
        }
    }
}
