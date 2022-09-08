package CRUD;

import java.util.ArrayList;
import java.util.Scanner;

public class delete {

	public void excluir(ArrayList<String> lista) {
		Scanner sc = new Scanner(System.in);
		String element = new String();
		
		System.out.println("Digite o elemento a ser excluído da lista: ");
		element = sc.nextLine();
		
		if(lista.contains(element)) {
			lista.remove(element);
			System.out.println(element + " removido com sucesso da lista!");
		} else {
			System.out.println("O elemento citado não existe na lista.");
		}
	}
}
