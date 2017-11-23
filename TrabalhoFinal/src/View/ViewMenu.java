package View;

import javax.swing.JOptionPane;

public class ViewMenu {
	private String menu;
	
	
	public String getMenu() {
		this.menu = JOptionPane.showInputDialog(
				"Escolha uma upção" + "\n" + 
		"1 - Cadastrar Artista"+ "\n"+
						"2 - Cadastrar Musica"+ "\n"+
		"3- Buscar Musica" + "\n" +
		"4- Buscar Artista" + "\n" +
		"5- Buscar Musica por Nomes" + "\n" +
						"6- Sair");
	return this.menu;
	}
}
