package chess;

public class Schachbrett {
	private Figuren[][] _schachbrett; 
	public Schachbrett()
	{
		_schachbrett = new Figuren[8][8];
		_schachbrett[0][0] = Figuren.SCHWARZERTURM;
		_schachbrett[0][1] = Figuren.SCHWARZERSPRINGER;
		_schachbrett[0][2] = Figuren.SCHWARZERLAEUFER;
		_schachbrett[0][3] = Figuren.SCHWARZEDAME;
		_schachbrett[0][4] = Figuren.SCHWARZERKOENIG;
		_schachbrett[0][5] = Figuren.SCHWARZERLAEUFER;
		_schachbrett[0][6] = Figuren.SCHWARZERSPRINGER;
		_schachbrett[0][7] = Figuren.SCHWARZERTURM;
		
		_schachbrett[1][0] = Figuren.SCHWARZERBAUER;
		_schachbrett[1][1] = Figuren.SCHWARZERBAUER;
		_schachbrett[1][2] = Figuren.SCHWARZERBAUER;
		_schachbrett[1][3] = Figuren.SCHWARZERBAUER;
		_schachbrett[1][4] = Figuren.SCHWARZERBAUER;
		_schachbrett[1][5] = Figuren.SCHWARZERBAUER;
		_schachbrett[1][6] = Figuren.SCHWARZERBAUER;
		_schachbrett[1][7] = Figuren.SCHWARZERBAUER;
		
		_schachbrett[6][0] = Figuren.WEISSERTURM;
		_schachbrett[6][1] = Figuren.WEISSERSPRINGER;
		_schachbrett[6][2] = Figuren.WEISSERLAEUFER;
		_schachbrett[6][3] = Figuren.WEISSEDAME;
		_schachbrett[6][4] = Figuren.WEISSERKOENIG;
		_schachbrett[6][5] = Figuren.WEISSERLAEUFER;
		_schachbrett[6][6] = Figuren.WEISSERSPRINGER;
		_schachbrett[6][7] = Figuren.WEISSERTURM;
		
		_schachbrett[7][0] = Figuren.WEISSERBAUER;
		_schachbrett[7][1] = Figuren.WEISSERBAUER;
		_schachbrett[7][2] = Figuren.WEISSERBAUER;
		_schachbrett[7][3] = Figuren.WEISSERBAUER;
		_schachbrett[7][4] = Figuren.WEISSERBAUER;
		_schachbrett[7][5] = Figuren.WEISSERBAUER;
		_schachbrett[7][6] = Figuren.WEISSERBAUER;
		_schachbrett[7][7] = Figuren.WEISSERBAUER;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void bewegeFigur(int zeile, int spalte, Figuren figur)
	{
		
	}

}
