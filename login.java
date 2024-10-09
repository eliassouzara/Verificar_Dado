import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        
        Scanner leitura = new Scanner(System.in);

        System.out.println("Qual é o seu nome?");
        String nome = leitura.nextLine();

        System.out.println("Você tem quantos anos?");
        int idade = leitura.nextInt();

        if (idade >= 18) {
            System.out.println(nome +", você é maior de idade: " + idade);
        } else {
            System.out.println(nome +", você não pode criar uma conta. Você é de menor idade: " + idade );
        }

        leitura.close();
    }
}
