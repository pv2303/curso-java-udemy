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
		
		// Processamento de dados em Java
		System.out.println("O Processamento de dados ocorre antes de você atribuir a uma variável.");
		System.out.println("Então, se você tem `x = 5 * 2`, 5*2 é processamento e então passado para a variável x.");
		int valor_d;
		double valor_f;
		valor_d = 2*6;
		valor_f = 2*1.365;
		System.out.println("Criei as variáveis `valor_d`, inteira, e `valor_f`, float, e multipliquei ambas por 1.365.\nVamos verificar seus valores:");
		System.out.printf("valor_d: %d\n", valor_d);
		System.out.printf("valor_f: %f\n", valor_f);

		System.out.println("Exemplo mais completo: declarar uma série de variáveis simultaneamente");
		System.out.println("-> Avaliando a área do trapézio...\n Vamos declarar as variáveis b, B e h e calcular a variável área:");
		double b, B, h, area;
		b = 6.0;
		B = 8.0;
		h = 5.0;

		area = (b + B) / 2.0 * h;

		System.out.printf("A área do trapézio é %.2f\n", area);

		System.out.println("4° Exemplo: processa duas inteiras e o resultado é double. Como funcionaria?");
		int ex4_a, ex4_b;
		double ex4_result;
		ex4_a = 10;
		ex4_b = 3;

		// ex4_result = ex4_a / ex4_b;

		System.out.println("O compilador entende que vc está dividindo dois números inteiros. Então, o resultado trunca as casas decimais");
		System.out.println("Como resolvemos isso? Nós declaramos o resultado no processamento com CASTING");

		ex4_result = (double) ex4_a / ex4_b;

		System.out.println(ex4_result);


	}

}