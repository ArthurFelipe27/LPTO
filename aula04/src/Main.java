import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite aqui seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Digite aqui sua idade: ");
        int idade = entrada.nextInt();

        if(idade < 18){
            System.out.println("Você é menor de idade, infelizmente você"+
                    " não pode acessar.");
            return;
        }else {
            System.out.println("Você é de maior, você pode"+
                    " acessar!");
        }

        System.out.println("Olá " + nome + ", seja bem-vindo" +
                " você tem " + idade + " anos.");

        System.out.println("------------------"+
                "-----------------------------");

        System.out.println("Digite aqui sua nota: ");
        int notaDigitada = entrada.nextInt();

        Verificar verificar = new Verificar(notaDigitada);

        String resultadoFinal = verificar.verificarNota(notaDigitada);
        System.out.println("Resultado: " + resultadoFinal);


        entrada.close();
    }
}
