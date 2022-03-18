package br.com.lojaCarro.Bean;

import java.util.Calendar;

import br.com.lojaCarro.Bo.CarroBo;
import br.com.lojaCarro.Bo.ClienteBo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

	
	
	static Categoria categoria;
	private static String modelo;
	private static double valor;
	private static String anoFabricacao;
	private static String marca;
	private static String idCarro = null;
	private static int escolha= -1;	
	private static String estadoCarro;
	
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		CarroBo carroBo = new CarroBo();

		ClienteBo clienteBo = new ClienteBo();
		
		
		
		
		
			
		
	Calendar dataAtual = Calendar.getInstance();
	System.out.println("Hoje é dia: " +dataAtual.getTime());
	
	
	SimpleDateFormat dataHoje = new SimpleDateFormat("dd/MM/yyyy  HH:mm:ss");
	System.out.println(dataHoje.format(dataAtual.getTime()));
	
	
	
		while (escolha!=0) {
			
			
			
			System.out.println("...................... ");

			System.out.println("Escolha a opção desejada\n1-Cadastrar Carro\n2-Apagar registro de carro\n3-Ediatr registro de carro\n4- Cadastrar Cliente\n5-Venda\n0-Sair");
			escolha = sc.nextInt();
			System.out.println("...................... ");

		
		
		sc.nextLine();
		
		
		if (escolha == 1) {// cadastra carro
			
			System.out.println("Mostrar o Id do carro:  ");
			idCarro =  UUID.randomUUID().toString();
			System.out.println (idCarro);
			
			
			 System.out.println("\nDigite 1 Para veiculo  novo (>=2022) ou 2 para Seminovo (<=2021) ");
			 estadoCarro = sc.nextLine();
			 if (estadoCarro.equals("1"))  {
				  categoria = Categoria.NOVO;
				  System.out.println("Veiculo "+ Categoria.NOVO.getTexto()); 
			  }
			  else if (estadoCarro.equals("2")) {
				  categoria = Categoria.SEMINOVO;
				  System.out.println("Veiculo "+ Categoria.SEMINOVO.getTexto()); 
			  }
			 				
					
			System.out.println("\nDigite o modelo do carro, Ex: Onix ");
			modelo = sc.nextLine();
			
			
			System.out.println ("Digite a marca do carro, Ex: Chevrolet ");
			  marca = sc.nextLine();
			
			System.out.println("Digite o ano de fabricação carro, Ex: 2020 ");
			 anoFabricacao = sc.nextLine();
			 
			 System.out.println("Digite o valor do carro, Ex: 15000 ");
			 valor= sc.nextDouble();
			 
			 			 
			 String resposta = carroBo.cadastraCarro(valor, anoFabricacao, modelo, marca, idCarro, categoria);	
			 System.out.println(resposta);
		} 

/*
		else if (escolha == 2) {// Apaga carro
			carroBo.apagaCarro(carro);
			System.out.println("Carro apagado com Sucesso!");
					}

		else if (escolha == 3) {// Edita carro
			
			 carroBo.update(carro);
			continue;

		} 
		*/
		
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

				System.out.println(" Digite seu o numero de telefone : ");
				String telefone = sc.nextLine();
				while ((telefone).length() != 9) {
				System.out.println(" Número de telefone inválido\n Digite novamente");
				telefone = sc.nextLine();
				
				 
				}			
				System.out.println("Nome: " + nome  +  " CPF: " + cpf  + " Data de Nascimento: " + dataNascimento +  " Telefone: " +  telefone);
		}
			
		else if (escolha == 5) {// venda de carro
			
		}
		
		else {
			System.out.println("Obrigada por utilizar nosso sistema!!!!");
			break;
		}}
		
		
		
		
			
		}}
		
	
	


