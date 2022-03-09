package br.com.lojaCarro;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.UUID;

import Bo.CarroBo;
import Bo.ClienteBo;

public class Main {

	private static final String String = null;

	public static void main(String[] args) {

		CarroBo carroBo = new CarroBo();

		ClienteBo clienteBo = new ClienteBo();
		
		Carro carro = new Carro();
		
		
		Categoria categoria = null;

		String modelo;
		double valor;
		String anoFabricacao;
		String marca;
		String idCarro = null;
		int escolha= -1;
		Scanner sc = new Scanner(System.in);
		
		
		
		
		
		while (escolha!=0) {
			
			System.out.println("...................... ");

			System.out.println("Escolha a opção desejada\n1-Cadastrar Carro\n2-Apagar registro de carro\n3-Ediatr registro de carro\n4- Cadastrar Cliente\n5-Venda\n0-Sair");
			escolha = sc.nextInt();
			System.out.println("...................... ");

		
		
		sc.nextLine();
		
		
		if (escolha == 1) {// cadastra carro
			
			System.out.println("Mostrar o Id do carro:  ");
			carro.setId( UUID.randomUUID().toString());
			System.out.println(carro.getId());
			
			
			System.out.println("\nDigite o modelo do carro, Ex: Onix ");
			modelo = sc.nextLine();
			
			
			System.out.println ("Digite a marca do carro, Ex: Chevrolet ");
			  marca = sc.nextLine();
			
			System.out.println("Digite o ano de fabricação carro, Ex: 2020 ");
			 anoFabricacao = sc.nextLine();
			 
			 System.out.println(" Modelo: " + modelo  +  " Marca: " + marca  + " Ano de Fabricação: " + anoFabricacao );
			 	 		
		} 


		else if (escolha == 2) {// Apaga carro
			carroBo.apagaCarro(carro);
			System.out.println("Carro apagado com Sucesso!");
					}

		else if (escolha == 3) {// Edita carro
			 carroBo.update(carro);
			continue;

		} 
		
		else if (escolha == 4) {// cadastra cliente
			
		
			System.out.println("Digite seu cpf com 11 digitos, somente números: ");
			String cpf = sc.nextLine();			
			
			while (cpf.length() != 11) {
				System.out.println("Número inválido\n Digite novamente");
				cpf = sc.nextLine();}

				System.out.println("Digite seu nome do cliente para cadastro: ");
				Object nome = sc.nextLine();
				

				// converter data de String para data
				System.out.println("Digite sua data de nascimento: ");
				String dataNascimento = sc.nextLine();
				SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
				try {

				Date data = formato.parse(dataNascimento);
				} catch (ParseException e) {
				 e.printStackTrace();}

				System.out.println("seu o numero de telefone : ");
				String telefone = sc.nextLine();
				while ((telefone).length() != 9) {
				System.out.println("Número de telefone inválido\n Digite novamente");
				telefone = sc.nextLine();
				
				 
				}			
				System.out.println("Nome: " + nome  +  " CPF: " + cpf  + " Data de Nascimento: " + dataNascimento +  "Telefone: "+  telefone);
		}
			
		else if (escolha == 5) {// venda de carro
			
		}
		
		else {
			System.out.println("Obrigada por utilizar nosso sistema!!!!");
			break;
		}}
		
		
		
		
			
		}}
		
	
	


