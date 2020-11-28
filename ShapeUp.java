package shape_up;

public class ShapeUp {

	public ShapeUp() {}
	
	public String afficherTitre() {
		String titre = "--------   |         |  --------    --------   --------                 |         |  --------\n" + 
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
}
