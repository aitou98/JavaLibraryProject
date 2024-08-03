package libraryProject;
import java.util.List;
import java.util.ArrayList;

public class Auteur {
	private String nom , prenom;
	private List<Livre> listeLivres ;

	public void Auteur(String nom , String prenom , List<Livre> listeLivres ) {
		this.nom = nom ;
		this.prenom = prenom;
		this.listeLivres= new ArrayList<>();
		
	}
	
	public void ajouterLivre(Livre livre) {
        listeLivres.add(livre);
    }
}
