package animalia;

public class Animal {

    public String nome;
    public String habitat;
    public String som;
    public String tipoDeAlimentacao;
    public String tipoDeMovimento;



    public void mover(){
        System.out.printf("Animal %s se move %s %n", nome, tipoDeMovimento);

    }

    public void emitirSom(){
        System.out.printf("Barulho emitido por %s: %s %n" , nome, som);
    }

    public void alimentar(){
        if(tipoDeAlimentacao.equalsIgnoreCase("Carnívora")){
            System.out.printf("%s se alimenta de outros animais para sobreviver %n", nome);
        } else if (tipoDeAlimentacao.equalsIgnoreCase("Herbívora")) {
            System.out.printf("%s se alimenta de plantas para sobreviver %n", nome);
        }else{
            System.out.printf("%s possui dieta Onívora(Carnívora + Herbívora) %n", nome);
        }

    }

}
