package libraryProject;
import java.util.List;
import java.util.ArrayList;

public class Utilisateur {
	private String nom , prenom;
	private int id;
	private List<Livre> livresEmpruntes;
	
	public Utilisateur(String nom , String prenom , int id ) {
		
		this.nom = nom;
		this.prenom = prenom ;
		this.id = id;
		this.livresEmpruntes = new ArrayList<Livre>();
		
	}
	
    public void emprunterLivre(Livre livre) {
        if (livre.estDisponible()) {
            livre.emprunter();
            livresEmpruntes.add(livre);
            System.out.println(prenom + " " + nom + " a emprunté " + livre);
        } else {
            System.out.println("Le livre " + livre + " n'est pas disponible.");
        }
    }

    public void rendreLivre(Livre livre) {
        if (livresEmpruntes.contains(livre)) {
            livre.rendre();
            livresEmpruntes.remove(livre);
            System.out.println(prenom + " " + nom + " a rendu " + livre);
        } else {
            System.out.println(prenom + " " + nom + " n'a pas emprunté " + livre);
        }
    }

}
