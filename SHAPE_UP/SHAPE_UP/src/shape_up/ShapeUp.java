package shape_up;

import java.util.Scanner;

public class ShapeUp {
	public ShapeUp() {}
	
	public String afficherTitre() {
		String titre =" --------   |         |  --------    --------   --------                 |         |  --------\n" + 
					  "|           |         | |         | |        | |                         |         | |        |\n" + 
					  "|           |         | |         | |        | |                         |         | |        |\n" + 
					  "|           |         | |         | |        | |                         |         | |        |\n" +
					  "|           |         | |         | |        | |                         |         | |        |\n" + 
					  " --------    ---------   --------    --------   --------  -----------    |         |  --------\n" +
					  "         |  |         | |         | |          |                         |         | |\n" + 
					  "         |  |         | |         | |          |                         |         | |\n" + 
					  "         |  |         | |         | |          |                         |         | |\n" + 
					  "         |  |         | |         | |          |                         |         | |\n" + 
					  " --------   |         | |         | |           --------                  --------   |";
		return titre;
	}
	
	public String afficherDescription() {
		String desc = "Shape Up est un jeu de cartes num�rique. Il peut se jouer de 2 � 3 joueurs.\n" +
					  "Vous devez d'abord choisir le nombre de joueurs jouant au jeu, la forme du plateau de jeu qui peut �tre carr� ou triangle.\n" + 
					  "Les cartes seront affich�es � l'�cran avec un num�ro de carte repr�sentant la carte. Les cartes sont affich�es al�atoirement.\n" +
					  "Les deux premi�res cartes sont les Victory carte et Hidden carte.\n" +
					  "La Hidden ne sera pas utilis�e dans le jeu, et la Victory permettra de calculer le score � la fin du jeu.\n" + 
					  "Vous piocher une carte � la fois, la carte pioch�e devra �tre placer ou utilis�e pour d�placer une autre sur le plateau.\n" + 
					  "Une fois que votre plateau sera rempli alors vous avez gagn� !\n" +
					  "Le score de chaque joueur sera affich� � la fin de la partie.";
		return desc;
	}
	
	/*public String affichageCarte() {
		Carte c2 = new Carte(Couleur.Bleu,FormeCarte.Cercle,true,1);
		String s = "";
		
		//carte gagnante et cach�e
		VictoryCard victory = null;
		HiddenCard hidden = null;
		
		this.tas = new TasDeCarte();
		this.cartes = new Carte[17];
	
		this.plateau.ajout();
		
		victory = (VictoryCard) this.tas.getCarte();
		hidden = (HiddenCard) this.tas.getCarte();
		
		c2 = this.plateau.piocherCarte();
		s = "Carte Gagnante : " + victory.getNum() + "\nCarte Cach�e : " + hidden.getNum() + 
			"Piocher une carte : " + "bouton piocher\n" + 
			"Carte pioch�e : \n" + c2.getNum() + c2.getCouleur() + c2.getForme() + c2.getForme() + c2.isRemplissage();
		return s;
	}*/
	
	/*public void afficherPlateau() {
		String s = "Plateau " + this.plateau.choisirForme();
	}*/
	
	/*public String afficherScore() {
		String s = "Score : " + this.nom1 + "score";
		return s;
	}*/
	
	public static void main(String[] args) {
		//d�but
		ShapeUp titre = new ShapeUp();
		System.out.println(titre.afficherTitre());
		System.out.println(titre.afficherDescription());
		
		
		
		System.out.println("Entrez nombre de joueurs.");
		Scanner scan1 = new Scanner(System.in);
		int nbJoueur = scan1.nextInt();
		
		System.out.println("Vous �tes " + nbJoueur + " joueurs");
		System.out.println("Saisir vos pr�noms");
		Scanner saisirPrenom = new Scanner(System.in);
		String prenom1 = saisirPrenom.nextLine();
		String prenom2 = saisirPrenom.nextLine();
		
		System.out.println("Entrez nombre de lignes pour le plateau. Respectez taille 3x5.");
		Scanner scan2 = new Scanner(System.in);
		int nbLigne = scan2.nextInt();
		
		System.out.println("Entrez nombre de colonnes pour le plateau. Respectez taille 3x5");
		Scanner scan3 = new Scanner(System.in);
		int nbCol = scan3.nextInt();
		
		System.out.println("Choisir une forme de plateau (carr� ou cercle).");
		Scanner scan4 = new Scanner(System.in);
		String choixForme = scan4.nextLine();
		
		scan1.close();
		scan2.close();
		scan3.close();
		scan4.close();
		
		Forme forme = new Forme();
		choixForme = forme.choisirForme();
		
		Plateau plat = new Plateau(nbJoueur, nbLigne, nbCol);
		
		//System.out.println(plat.toString()); //�a fonctionne sau pour la forme
		
		//Piocher une carte fonctionne
		System.out.println("Piocher une carte\n");
		TasDeCarte tas = plat.getTas();
		
		Carte gagnante = tas.piocherCarte();
		System.out.println("Vous venez de piocher une carte gagnante : " + gagnante.getNum() + ".\nVous pourrez la consulter uniquement � la fin du jeu.\n");

		System.out.println("Piocher une carte\n");
		Carte perdante = tas.piocherCarte();
		System.out.println("Vous venez de piocher une carte perdante : " + perdante.getNum() + ".\nElle ne sera pas utilis�e dans le jeu.\n");
		
		System.out.println("Piocher une carte\n");
		Carte carte = tas.piocherCarte();
		System.out.println(carte.toString());
		
		System.out.println("Sur quelle ligne voulez-vous poser votre carte");
		Scanner scan5 = new Scanner(System.in);
		int li = scan5.nextInt();
		
		System.out.println("Sur quelle colonne voulez-vous poser votre carte");
		Scanner scan6 = new Scanner(System.in);
		int col = scan6.nextInt();
		
		//Poser sur le plateau ne marche pas
		plat.poserCarte(carte, li, col);
		System.out.println(plat.toString2() + "\n");
		
		scan5.close();
		scan6.close();
		
		Joueur j = new Joueur(prenom1,1);
		Joueur j2 = new Joueur(prenom2,2);
		System.out.println(j.toString() + "\n");
		System.out.println(j2.toString() + "\n");
		//A FAIRE : placer carte sur plateau + touche ENTREE apr�s piocher carte + score = 0 ??? + affichage gagnant + affichage plateau
	}
}
