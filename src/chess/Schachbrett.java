package chess;

public class Schachbrett {
	private Figuren[][] _schachbrett;

	public Schachbrett() {
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

		_schachbrett[6][0] = Figuren.WEISSERBAUER;
		_schachbrett[6][1] = Figuren.WEISSERBAUER;
		_schachbrett[6][2] = Figuren.WEISSERBAUER;
		_schachbrett[6][3] = Figuren.WEISSERBAUER;
		_schachbrett[6][4] = Figuren.WEISSERBAUER;
		_schachbrett[6][5] = Figuren.WEISSERBAUER;
		_schachbrett[6][6] = Figuren.WEISSERBAUER;
		_schachbrett[6][7] = Figuren.WEISSERBAUER;

		_schachbrett[7][0] = Figuren.WEISSERTURM;
		_schachbrett[7][1] = Figuren.WEISSERSPRINGER;
		_schachbrett[7][2] = Figuren.WEISSERLAEUFER;
		_schachbrett[7][3] = Figuren.WEISSEDAME;
		_schachbrett[7][4] = Figuren.WEISSERKOENIG;
		_schachbrett[7][5] = Figuren.WEISSERLAEUFER;
		_schachbrett[7][6] = Figuren.WEISSERSPRINGER;
		_schachbrett[7][7] = Figuren.WEISSERTURM;
	}

	public void bewegeFigur(int zeile, int spalte, Figuren figur, int zielZeile, int zielSpalte) {
		if ((zielZeile >= 0 && zielSpalte >= 0 && zeile >= 0 && spalte >= 0)
				&& (zielZeile <= 7 && zielSpalte <= 7 && zeile <= 7 && spalte <= 7)) 
		{
			if (figur.gibFigurenArt() == FigurenArt.BAUER) 
			{
				bewegeBauer(zeile,spalte,zielZeile, zielSpalte);
			}
			else if(figur.gibFigurenArt() == FigurenArt.KOENIG)
			{
				bewegeKoenig(zeile,spalte,zielZeile,zielSpalte)
				{
					
				}
			}
		}
	}
	private void bewegeKoenig(int zeile, int spalte, int zielZeile, int zielSpalte)
	{
		int diffZeile = zeile - zielZeile;
		int diffSpalte = spalte - zielSpalte;
		
		
	}

	private void bewegeBauer(int zeile, int spalte, int zielZeile, int zielSpalte) 
	{
		Figuren figur = _schachbrett[zeile][spalte];
			if ((zeile - 1 == zielZeile) && spalte == zielSpalte && figur.gibFigurenFarbe() == FigurenFarbe.WEISS
					&& _schachbrett[zielZeile][zielSpalte] == null) {
				Figuren f = _schachbrett[zeile][spalte];
				_schachbrett[zeile][spalte] = null;
				_schachbrett[zielZeile][zielSpalte] = f;

			} else if ((zeile + 1 == zielZeile) && spalte == zielSpalte
					&& figur.gibFigurenFarbe() == FigurenFarbe.SCHWARZ
					&& _schachbrett[zielZeile][zielSpalte] == null) {
				Figuren f = _schachbrett[zeile][spalte];
				_schachbrett[zeile][spalte] = null;
				_schachbrett[zielZeile][zielSpalte] = f;

			} else if ((zeile + 2 == zielZeile) && spalte == zielSpalte
					&& figur.gibFigurenFarbe() == FigurenFarbe.SCHWARZ
					&& _schachbrett[zielZeile][zielSpalte] == null && _schachbrett[zeile + 1][spalte] == null
					&& zeile == 1) {
				Figuren f = _schachbrett[zeile][spalte];
				_schachbrett[zeile][spalte] = null;
				_schachbrett[zielZeile][zielSpalte] = f;
			} else if ((zeile - 2 == zielZeile) && spalte == zielSpalte
					&& figur.gibFigurenFarbe() == FigurenFarbe.WEISS && _schachbrett[zielZeile][zielSpalte] == null
					&& _schachbrett[zeile - 1][spalte] == null && zeile == 6) {
				Figuren f = _schachbrett[zeile][spalte];
				_schachbrett[zeile][spalte] = null;
				_schachbrett[zielZeile][zielSpalte] = f;
			} else if (zielZeile == zeile + 1 && (zielSpalte == spalte + 1 || zielSpalte == spalte - 1)
					&& figur.gibFigurenFarbe() == FigurenFarbe.SCHWARZ
					&& _schachbrett[zielZeile][zielSpalte] != null
					&& _schachbrett[zielZeile][zielSpalte].gibFigurenFarbe() == FigurenFarbe.WEISS) {
				Figuren f = _schachbrett[zeile][spalte];
				_schachbrett[zeile][spalte] = null;
				_schachbrett[zielZeile][zielSpalte] = f;
			} else if (zielZeile == zeile - 1 && (zielSpalte == spalte + 1 || zielSpalte == spalte - 1)
					&& figur.gibFigurenFarbe() == FigurenFarbe.WEISS && _schachbrett[zielZeile][zielSpalte] != null
					&& _schachbrett[zielZeile][zielSpalte].gibFigurenFarbe() == FigurenFarbe.SCHWARZ) {
				Figuren f = _schachbrett[zeile][spalte];
				_schachbrett[zeile][spalte] = null;
				_schachbrett[zielZeile][zielSpalte] = f;
			}

		
	}

}
