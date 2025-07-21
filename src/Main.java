//import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// Estruturas Sequenciais ------
		
		System.out.println("Entendendo prints!");
		System.out.print("Esse print não pula linha");
		System.out.print(". Então, essa parte da linha vai ta na mesma linha que o de cima\n");
		System.out.println("Esse, por outro lado, pula a linha!");
		System.out.println("Logo, posso só escrever normal que vai ta tudo certo\n\n");
		
		// Saída de dados em Java
		System.out.println("---- SAÍDA DE DADOS EM JAVA ----");
		int y = 32;
		System.out.println("A Saída de dados básica do Java consiste em `System.out.println` ou `System.out.print`");
		System.out.println(y);
		
		// Conteúdo com ponto flutuante
		System.out.println("\nDados com ponto flutuante ---");
		double x = 10.53468;
		System.out.print("Dados que são pontos flutuantes (double ou float) pode mser printados normalmente:");
		System.out.println(x);
		System.out.println("Porém, podemos usar o `System.out.printf` que define o número de decimais!");
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x); // Ele ta printando com virgula ao inves de ponto pois pega o padrão da língua do sistema
		
//		Locale.setDefault(Locale.US);
		System.out.printf("%.1f%n", x);
//		Locale.setDefault(Locale.forLanguageTag('pt'));
		System.out.printf("Testando outra locale: %.1f%n", x);

		// Concatena diversos elementos em um print
		// %f é pra float
		// %n é quebra de linha
		// %s é texto
		// %d é número inteiro
		double z = 1.96;
		System.out.printf("O poste tinha mais de %.0f metros de altura.%nEu só tenho %.2f de altura.%n", x, z);
		// Podemos concatenar diversos tipos de variaveis
		String pc = "X2025";
		int ano = 2024;
		double valor_pc = 5659.99;
		System.out.printf("Lançado em %d, %s está custando R$%.2f na Amazon.%nAchei extremamente caro!", ano, pc, valor_pc);
		
	}

}