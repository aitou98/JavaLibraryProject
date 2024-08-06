package libraryProject;

public class Main {

	public static void main(String[] args) {
		
        Bibliotheque bibliotheque = new Bibliotheque();

        Auteur auteur1 = new Auteur("Victor", "Hugo");
        Auteur auteur2 = new Auteur("Jules", "Verne");

        Livre livre1 = new Livre("Les Misérables", auteur1, "12345");
        Livre livre2 = new Livre("Vingt mille lieues sous les mers", auteur2, "67890");

        bibliotheque.ajouterAuteur(auteur1);
        bibliotheque.ajouterAuteur(auteur2);
        bibliotheque.ajouterLivre(livre1);
        bibliotheque.ajouterLivre(livre2);

        Utilisateur utilisateur1 = new Utilisateur("Dupont", "Jean", 1);
        Utilisateur utilisateur2 = new Utilisateur("Martin", "Marie", 2);

        bibliotheque.ajouterUtilisateur(utilisateur1);
        bibliotheque.ajouterUtilisateur(utilisateur2);

        utilisateur1.emprunterLivre(livre1);
        utilisateur2.emprunterLivre(livre2);

        
        bibliotheque.afficherLivresDisponibles();

        utilisateur1.rendreLivre(livre1);
        utilisateur2.rendreLivre(livre2);

        bibliotheque.afficherLivresDisponibles();
    }
		

}

