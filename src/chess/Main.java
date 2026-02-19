package chess;

public class Main {
	public static void main(String[] args)
	{
		Schachbrett schachbrett = new Schachbrett();
		schachbrett.bewegeFigur(6, 2, Figuren.WEISSERBAUER, 4, 2);
		schachbrett.bewegeFigur(1, 3, Figuren.SCHWARZERBAUER, 3, 3);
		schachbrett.bewegeFigur(4, 2, Figuren.WEISSERBAUER, 3, 3);
		schachbrett.bewegeFigur(6, 4, Figuren.WEISSERBAUER, 4, 4);
		schachbrett.bewegeFigur(7, 4, Figuren.WEISSERKOENIG, 6, 4);
		schachbrett.bewegeFigur(6, 4, Figuren.WEISSERKOENIG, 5, 3);
		schachbrett.bewegeFigur(1, 0, Figuren.SCHWARZERBAUER, 3, 0);
		schachbrett.bewegeFigur(0, 0, Figuren.SCHWARZERTURM, 2, 0);
		schachbrett.bewegeFigur(2, 0, Figuren.SCHWARZERTURM, 2, 5);

		System.out.println("Hallo");
	}

}
