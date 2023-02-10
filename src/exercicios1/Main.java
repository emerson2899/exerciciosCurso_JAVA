package exercicios1;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		 double metroQuadrado = sc.nextDouble();
		 double formula;		 
		 double area = largura * comprimento;
		 double preco = area * metroQuadrado;	
		 
		// TODO Auto-generated method stub	
		
		System.out.println("novo arquivo de exercícios");
		System.out.println("Exercicio exemplo");		
		System.out.printf("Area =  %.2f%n ",  area);
		System.out.printf("preco = %.2f%n  ", preco);
		
		/* Exercise 2*/
		
		System.out.println("Exercicio 2 forneca um valor para ser calculado o valor do raio: ");
		double circulo = sc.nextDouble();
		formula = circulo * 3.14159;
		System.out.println("o resultado e " + formula);
		
		// Exercise 3 
		 
		System.out.println("Exercicio 3 soma de numeros, forneca dois numeros: ");
		double numA = sc.nextDouble();
		double numB = sc.nextDouble();
		formula = numA + numB;
		System.out.println("A soma dos numeros totalizam " + formula);
		
		// exercise 4
		
		
		System.out.println("Exercicio 4 soma de salário de colaborador, forneca o numero de registro: ");
		double numbColab = sc.nextDouble();
		System.out.println("Forneca o valor recebido por hora: ");
		double vlHora = sc.nextDouble();
		System.out.println("Forneca as horas trabalhadas: ");
		double horas = sc.nextDouble();		
		formula = vlHora * horas;	
		System.out.println("O funcionario "+ numbColab+ " recebera " + formula);

		// exercise 5
		// Exercises de testes de condicionais

		System.out.println("exercicios para tesde de condicionais ");
				System.out.println("Digite um numero para verificacao: ");
				int number = sc.nextInt();
				if (number % 2 ==0){
					System.out.println("o numero digitado é par!");
				} 
				else{
					System.out.println("O numero digitado nao é par");
				};
		System.out.println("Digite novo numero para verificacao");
		int number2 = sc.nextInt();
				if(number2 >= 0) {
					System.out.println("O numero digitado é positivo");
				}
				else {
					System.out.println("O numero digitado é enegativo");
				}
				
		
				

		
		
		sc.close();

	}

}
