package CRUD;

import java.util.ArrayList;
import java.util.Scanner;

public class create {

	public void inserir(ArrayList<String> lista) {
		Scanner sc = new Scanner(System.in);
		String novoElemento = new String();
		
		if(lista.contains(novoElemento)) {
			System.out.println("O elemento em questão já está presente na lista");
		} else {
			System.out.println("Digite o elemento em que deseja inserir na lista: ");
			novoElemento = sc.nextLine();
			lista.add(novoElemento);
			
			System.out.println(novoElemento + " inserido na lista com sucesso!!!");
		}
		
	}
}
