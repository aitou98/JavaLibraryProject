package libraryProject;

public class Livre {
	private String titre;
	private Auteur auteur;
	private String ISBN;
	private boolean disponible;
	
	
	public void Book(String titre , Auteur auteur , String ISBN  ) {
		
		this.titre = titre ; 
		this.auteur = auteur;
		this.ISBN = ISBN; 
		this.disponible = true;		
	}
	
	public void emprunter() {
		
		this.disponible = false;
		
	}
	
	
	public void rendre() {
		
		this.disponible = true;
	}
	
	
	
	

}
