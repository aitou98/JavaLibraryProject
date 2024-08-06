package libraryProject;
import java.util.List;
import java.util.ArrayList;

public class Auteur {
	private String nom , prenom;
	private List<Livre> listeLivres ;

	public Auteur(String nom , String prenom ) {
		this.nom = nom ;
		this.prenom = prenom;
		this.listeLivres= new ArrayList<>();
		
	}
	
	public void ajouterLivre(Livre livre) {
        listeLivres.add(livre);
    }
	


    @Override
    public String toString() {
        return prenom + " " + nom;
    }
    
}
