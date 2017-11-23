package Control;

import java.util.ArrayList;

import Model.BD;
import Model.Musica;
import View.ViewExibirMusica;
import View.ViewSolicitaMusica;

public class ControleBuscarMusicaArtista {
	private BD bds;
	public ControleBuscarMusicaArtista(BD bds){
		this.bds = bds;
		
	}
	public void exeibirNomeArtista(){
		ArrayList<Musica> musicas = this.bds.getMusicas();
		
		ViewSolicitaMusica vsm = new ViewSolicitaMusica();
		
		
		String nomeMusica = vsm.getNomeMusica();
		
		String nm = "---" + nomeMusica + "---\n";
		for (int i = 0; i < musicas.size(); i++) {
			if(musicas.get(i).getArtista().equals(nomeMusica)){
				nm  += "-------------------\n" + 
						musicas.get(i).getNomeMusica() + "\n" + 
						musicas.get(i).getGenero() + "\n" +
						musicas.get(i).getArtista() + "\n";
			}
		}
		ViewExibirMusica vem = new ViewExibirMusica(nm);
	}
}
