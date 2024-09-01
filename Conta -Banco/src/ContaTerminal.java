/*
 * @author David Anderson
 * @version 1.0
 * @since 01/09/2024
 */

import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Criando o objeto Scanner
        @SuppressWarnings("resource")
		Scanner meusDados = new Scanner(System.in);
        

        //Pegando os dados para ser exibido no terminal
        System.out.println("Digite o numero da conta:");
		int numero = meusDados.nextInt();

        System.out.println("Digite a sua agencia:");
        String agencia = meusDados.next();

        System.out.println("Digite nome e sobrenome:");
        String nome = meusDados.next();

        System.out.println("Coloque aqui seu saldo:");
        double saldo = meusDados.nextDouble();

        //Exibindo os dados do cliente
        System.out.println("Ola" +nome+ ",obrigado por criar uma conta em nosso banco");
        System.out.println("Sua agencia é:" +agencia+ "obrigado");
        System.out.println("Sua conta:" +numero+ "obrigado");
        System.out.println("Saldo bancario:" +saldo+ ".");
        
        //Um estudo criado por David Anderson de Brito
        //Versão 1.0 
    }
}
