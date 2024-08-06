package libraryProject;

public class Livre {
	private String titre;
	private Auteur auteur;
	private String ISBN;
	private boolean disponible;
	
	
	public Livre(String titre, Auteur auteur, String ISBN) {
        this.titre = titre;
        this.auteur = auteur;
        this.ISBN = ISBN;
        this.disponible = true;
        auteur.ajouterLivre(this);
    }
	
	 public boolean estDisponible() {
	        return disponible;
	    }
	

	    public void emprunter() {
	        if (disponible) {
	            disponible = false;
	        } else {
	            System.out.println("Le livre " + titre + " n'est pas disponible.");
	        }
	    }

	    public void rendre() {
	        disponible = true;
	    }

	    @Override
	    public String toString() {
	        return titre + " par " + auteur;
	    }
	
	
	
	

}
