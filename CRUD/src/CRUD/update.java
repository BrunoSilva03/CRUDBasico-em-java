package CRUD;

import java.util.ArrayList;
import java.util.Scanner;

public class update {

	public void alterar(ArrayList<String> lista) {
		
		if(lista.isEmpty()) {
			System.out.println("A lista está vazia no momento");
		} else {
			Scanner sc = new Scanner(System.in);
			String ElementoAnterior = new String();
			String novoElemento = new String();
			
			System.out.println("Digite o elemento ao qual deseja substituir na lista: "); 
			ElementoAnterior = sc.nextLine();
			
			if(lista.contains(ElementoAnterior)) {
				
				System.out.println("Digite o elemento para substituir " + ElementoAnterior);
				novoElemento = sc.nextLine();
				
				if(lista.contains(novoElemento)) {
					while(lista.contains(novoElemento)) {
						System.out.println(novoElemento + " já está presente na lista, escolha outro: ");
						novoElemento = sc.nextLine();
					}
					
				}
				
				for(int i = 0; i < lista.size(); i++) {
					if(lista.get(i).equals(ElementoAnterior)) {
						lista.set(i, novoElemento);
					}
				}
				System.out.println("Elemento alterado com Sucesso!");
				
			} else {
				System.out.println("O elemento especificado '" + ElementoAnterior + "' não existe na lista!");
			}
		}
		
	}
}
