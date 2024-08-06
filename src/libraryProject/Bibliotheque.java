package libraryProject;
import java.util.ArrayList;
import java.util.List;

public class Bibliotheque  {
	private List<Livre> livres;
    private List<Auteur> auteurs;
    private List<Utilisateur> utilisateurs;

    public Bibliotheque() {
        this.livres = new ArrayList<>();
        this.auteurs = new ArrayList<>();
        this.utilisateurs = new ArrayList<>();
    }

    public void ajouterLivre(Livre livre) {
        livres.add(livre);
    }

    public void ajouterAuteur(Auteur auteur) {
        auteurs.add(auteur);
    }

    public void ajouterUtilisateur(Utilisateur utilisateur) {
        utilisateurs.add(utilisateur);
    }

    public void afficherLivresDisponibles() {
        System.out.println("Livres disponibles :");
        for (Livre livre : livres) {
            if (livre.estDisponible()) {
                System.out.println(livre);
            }
        }
    }

    public Livre rechercherLivreParTitre(String titre) {
        for (Livre livre : livres) {
            if (livre.toString().contains(titre)) {
                return livre;
            }
        }
        return null;
    }

    public Livre rechercherLivreParISBN(String ISBN) {
        for (Livre livre : livres) {
            if (livre.toString().contains(ISBN)) {
                return livre;
            }
        }
        return null;
    }

}
