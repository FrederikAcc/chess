package chess;

public class Main {
	public static void main(String[] args)
	{
		Schachbrett schachbrett = new Schachbrett();
		schachbrett.bewegeFigur(6, 2, Figuren.WEISSERBAUER, 4, 2);
		schachbrett.bewegeFigur(1, 3, Figuren.SCHWARZERBAUER, 3, 3);
		schachbrett.bewegeFigur(4, 2, Figuren.WEISSERBAUER, 3, 3);
		System.out.println("Hallo");
	}

}
