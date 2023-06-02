
import java.util.Random;
import java.util.Scanner;

public class gameClass {

	public static void main(String[] args) {

		/*
		 * String nome, idade, aglomerado, galaxia, planeta, continente;
		 * 
		 * System.out.
		 * print("Primeiro é preciso que você informe o seu endereço cósmico \n");
		 * 
		 * System.out.println("-------------");
		 * 
		 * System.out.println("Bem vinde. Digite seu código de identificação (nome):");
		 * nome = in.nextLine();
		 * 
		 * System.out.
		 * println("Há quantos anos/ anos-luz/ qualquer medida de tempo você nasceu?");
		 * idade = in.nextLine();
		 * 
		 * System.out.println("Qual aglomerado em que você reside?"); aglomerado =
		 * in.nextLine();
		 * 
		 * System.out.println("Qual a galáxia em que você reside?"); galaxia =
		 * in.nextLine();
		 * 
		 * System.out.println("Qual planeta em que você reside?"); planeta =
		 * in.nextLine(); if(planeta.equals("Terra")) { System.out.
		 * println("\nÓtimo! É aqui que se passa essa odisséia de desventuras \n");
		 * }else {
		 * System.out.println("\nQue pena. Infelizmente isso acaba aqui pra você \n"); }
		 * 
		 * System.out.println("Qual continente em que você reside?"); continente =
		 * in.nextLine();
		 * 
		 * //Gerar relatório final: System.out.println("-------------");
		 * System.out.println("Aqui estão as suas informações pessoais:");
		 * System.out.println("Nome: " + nome); System.out.println("Idade: " + idade);
		 * System.out.println("Aglomerado: " + aglomerado);
		 * System.out.println("Galáxia: " + galaxia); System.out.println("Planeta: " +
		 * planeta); System.out.println("Continente: " + continente);
		 */
		Scanner in = new Scanner(System.in);

		String nome, idade, aglomerado, galaxia, planeta;

		Random rand = new Random();

		System.out.println("Bem vinde ao RPG da vida. \n\nDigite seu código de identificação (nome):");
		nome = in.nextLine();

		System.out.println("\nOlá, " + nome
				+ "! \nPrimeiro é preciso que você informe o seu endereço cósmico e algumas informações pessoais.\n");

		System.out.println("\n--------------------------------------------------------------\n");

		System.out.println("\nHá quantos anos você nasceu?");
		idade = in.nextLine();

		System.out.println("\nQual aglomerado em que você reside?");
		aglomerado = in.nextLine();

		System.out.println("\nQual a galáxia em que você reside?");
		galaxia = in.nextLine();

		System.out.println("\nQual planeta em que você reside?");
		planeta = in.nextLine();

		if (planeta.equals("Terra")) {

			System.out.println("\nÓtimo! É aqui que se passa essa odisséia de desventuras. \n\n\n\n");

			System.out.println("Suas informações foram salvas, " + nome + ".\n");

			System.out.print("\nPronto para dar início?\n");
			
			/*
			 * String escolha = in.nextLine(); if(escolha.equals ("Sim")) {
			 * System.out.println("Início da história"); escolha = in.nextLine(); }else {
			 * System.out.println("Que pena! Volte quando estiver preparado."); }
			 */

			/*
			 * inserir aqui sim ou não e introdução da história
			 */

			System.out.println("Deseja avançar para qual direção (w = Frente, a = Esquerda)?");
			String comando = in.nextLine();
			if (comando.equals("w")) {
				System.out.println("Você está indo para frente!\n");
				System.out.println("" + nome
						+ ", você ingressou na universidade. O que deseja fazer? \na = agredir um professor e sair correndo \nb = entrar em sala de aula");
				comando = in.nextLine();
				if (comando.equals("b")) {
					if (rand.nextInt(21) > 8) {
						System.out.println("" + nome
								+ ", você evitou um conflito perigoso que poderia te levar ao inferno. Parabéns.");
					} else {
						System.out.println("" + nome
								+ ", você entrou na sala de uma criatura lendária indesejável e impossível de vencer. A criatura-professor disse: \n-"
								+ nome
								+ ", Tem 299.792.458 atividades para serem feitas. \nIsso infelizmente terminou com seus dias.");
					}

				} else {
					System.out.println("" + nome
							+ ", você agrediu um professor e imediatamente virou-se para correr o máximo que podia. Infelizmente, a polícia universitária estava de passagem e te levou. Você terminou seus dias na cadeia.");
				}
			} else if (comando.equals("a")) {
				System.out.println("Você está indo para a esquerda!\n");
				System.out.println("" + nome
						+ ", você decidiu viver como artista. O que deseja fazer? \na = Gravar seu álbum \nb = Seguir outro caminho");
				comando = in.nextLine();
				if (comando.equals("a")) {
					if (rand.nextInt(21) > 12) {
						System.out.println("" + nome + ", você é classe alta! Parabéns pela gravação do seu álbum!");
					} else {
						System.out.println("" + nome
								+ ", você é classe baixa. Sinto muito, mas seu talento na música nunca será reconhecido. Seus dias terminaram no desconhecimento");
					}

				} else {
					System.out.println("" + nome + ", você seguiu uma carreira que não queria. Viveu e morreu triste.");
				}
			}

		} else if (planeta.equals("Marte")) {
			System.out.println(
					"\nQue pena. Talvez seja melhor acompanhar o David Bowie nessa🚀 Infelizmente isso acaba aqui pra você. \n");
		} else {
			System.out.println("\nQue pena. Infelizmente isso acaba aqui pra você. \n");
		}
		/*
		 * inserir aqui fim de jogo
		 */

	}

}
