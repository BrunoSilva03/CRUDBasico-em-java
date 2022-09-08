package CRUD;

import java.util.ArrayList;
import java.util.Scanner;

public class CRUDBasico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> lista = new ArrayList<String>();
		int opcao = 1;
		
		create c = new create();
		read r = new read();
		update u = new update();
		delete d = new delete();
		
		System.out.println("BEM - VINDO(A)");
		
		while(opcao > 0 && opcao <= 5) {
			System.out.println("Escolha Uma opção: ");
			System.out.println("1 - Exibir Lista");
			System.out.println("2 - Inserir Elemento na lista");
			System.out.println("3 - Excluir elemento da lista");
			System.out.println("4 - Alterar elemento na lista");
			System.out.println("5 - Limpar lista");
			System.out.println("0 - Sair do Programa");
			opcao = sc.nextInt();
			
			
			switch(opcao) {
			
			case 0: {
				System.out.println("Finalizando o Programa");
				System.out.println(".");
				System.out.println(".");
				System.out.println(".");
				System.exit(opcao);
			}break;
			
			case 1: {
				r.exibir(lista);
			}break;
			
			case 2: {
				c.inserir(lista);
			}break;
			
			case 3: {
				d.excluir(lista);
			}break;
			
			case 4: {
				u.alterar(lista);
			}break;
			
			case 5: {
				lista.clear();
				System.out.println("Lista esvaziada com sucesso!");
			}break;
			
			default: {
				System.out.println("Opção Inválida, Tente Novamante.");
				
			}break;
			
			}
		}
		
		

	}

}
