package EstruturasDeControle;

import java.util.Scanner;

public class SwitchComBreak {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		String conceito = "";
		System.out.printf("Escolhe uma nota ai: ");
		int nota = entrada.nextInt();
		
		switch (nota) {
		case 10: case 9:
			conceito = "A";
			break;
		case 8: case 7:
			conceito = "B";
			break;
		case 6: case 5:
			conceito = "C";
			break;
		case 4: case 3:
			conceito = "D";
			break;
		case 2: case 1: case 0:
			conceito = "E";
			break;
		default:
			conceito = "N�o informado!";
			break;
		}
		
		System.out.println("Conceito do aluno neste caso foi: " + conceito);
		
		entrada.close();
	}
}
