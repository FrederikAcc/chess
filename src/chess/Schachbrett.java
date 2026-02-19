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
				&& (zielZeile <= 7 && zielSpalte <= 7 && zeile <= 7 && spalte <= 7)) {
			if (figur.gibFigurenArt() == FigurenArt.BAUER) {
				bewegeBauer(zeile, spalte, zielZeile, zielSpalte);
			} else if (figur.gibFigurenArt() == FigurenArt.KOENIG) {
				bewegeKoenig(zeile, spalte, zielZeile, zielSpalte);
			} else if (figur.gibFigurenArt() == FigurenArt.TURM) {
				bewegeTurm(zeile, spalte, zielZeile, zielSpalte);
			}
			else if(figur.gibFigurenArt() == FigurenArt.SPRINGER)
			{
				bewegeSpringer(zeile,spalte,zielZeile,zielSpalte);	
			}
		}
	}

	private void bewegeKoenig(int zeile, int spalte, int zielZeile, int zielSpalte) {
		Figuren figur = _schachbrett[zeile][spalte];
		int diffZeile = zeile - zielZeile;
		int diffSpalte = spalte - zielSpalte;
		if (diffZeile < 0) {
			diffZeile = -diffZeile;
		}
		if (diffSpalte < 0) {
			diffSpalte = -diffSpalte;
		}
		if ((diffSpalte == 1 || diffZeile == 1) && (_schachbrett[zielZeile][zielSpalte] == null
				|| (figur.gibFigurenFarbe() != _schachbrett[zielZeile][zielSpalte].gibFigurenFarbe()))) {
			Figuren f = _schachbrett[zeile][spalte];
			_schachbrett[zeile][spalte] = null;
			_schachbrett[zielZeile][zielSpalte] = f;
		}
	}

	private void bewegeTurm(int zeile, int spalte, int zielZeile, int zielSpalte) {
		if (gueltigerZugTurm(zeile, spalte, zielZeile, zielSpalte)) {
			if (_schachbrett[zielZeile][zielSpalte] == null || (_schachbrett[zielZeile][zielSpalte].gibFigurenFarbe() != _schachbrett[zeile][spalte].gibFigurenFarbe())) {
				Figuren f = _schachbrett[zeile][spalte];
				_schachbrett[zeile][spalte] = null;
				_schachbrett[zielZeile][zielSpalte] = f;
			}

		}
	}

	private boolean gueltigerZugTurm(int zeile, int spalte, int zielZeile, int zielSpalte) {
		if (zeile == zielZeile) {
			for (int s = spalte+1; s < zielSpalte; ++s) {
				Figuren f = _schachbrett[zeile][s];
				if (f != null) {
					return false;
				}
			}
			return true;
		} else if (spalte == zielSpalte) {
			for (int z = zeile+1; z < zielZeile; ++z) {
				Figuren fig = _schachbrett[z][spalte];
				if (fig != null) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
	
	private void bewegeSpringer(int zeile, int spalte, int zielZeile, int zielSpalte)
	{
		int diffZeile = zeile - zielZeile;
		int diffSpalte = spalte - zielSpalte;
		if(diffZeile < 0)
		{
			diffZeile = -diffZeile;
		}
		if(diffSpalte < 0)
		{
			diffSpalte = - diffSpalte;
		}
		
		if(diffZeile == 2 && diffSpalte == 1 && ( _schachbrett[zielZeile][zielSpalte] == null || _schachbrett[zeile][spalte].gibFigurenFarbe() != _schachbrett[zielZeile][zielSpalte].gibFigurenFarbe()))
		{
			Figuren f = _schachbrett[zeile][spalte];
			_schachbrett[zeile][spalte] = null;
			_schachbrett[zielZeile][zielSpalte] = f;
		}
		else if( diffZeile == 1 && diffSpalte == 2 && ( _schachbrett[zielZeile][zielSpalte] == null || _schachbrett[zeile][spalte].gibFigurenFarbe() != _schachbrett[zielZeile][zielSpalte].gibFigurenFarbe()))
		{
			Figuren f = _schachbrett[zeile][spalte];
			_schachbrett[zeile][spalte] = null;
			_schachbrett[zielZeile][zielSpalte] = f;
		}
	}

	private void bewegeBauer(int zeile, int spalte, int zielZeile, int zielSpalte) {
		Figuren figur = _schachbrett[zeile][spalte];
		if ((zeile - 1 == zielZeile) && spalte == zielSpalte && figur.gibFigurenFarbe() == FigurenFarbe.WEISS
				&& _schachbrett[zielZeile][zielSpalte] == null) {
			Figuren f = _schachbrett[zeile][spalte];
			_schachbrett[zeile][spalte] = null;
			_schachbrett[zielZeile][zielSpalte] = f;

		} else if ((zeile + 1 == zielZeile) && spalte == zielSpalte && figur.gibFigurenFarbe() == FigurenFarbe.SCHWARZ
				&& _schachbrett[zielZeile][zielSpalte] == null) {
			Figuren f = _schachbrett[zeile][spalte];
			_schachbrett[zeile][spalte] = null;
			_schachbrett[zielZeile][zielSpalte] = f;

		} else if ((zeile + 2 == zielZeile) && spalte == zielSpalte && figur.gibFigurenFarbe() == FigurenFarbe.SCHWARZ
				&& _schachbrett[zielZeile][zielSpalte] == null && _schachbrett[zeile + 1][spalte] == null
				&& zeile == 1) {
			Figuren f = _schachbrett[zeile][spalte];
			_schachbrett[zeile][spalte] = null;
			_schachbrett[zielZeile][zielSpalte] = f;
		} else if ((zeile - 2 == zielZeile) && spalte == zielSpalte && figur.gibFigurenFarbe() == FigurenFarbe.WEISS
				&& _schachbrett[zielZeile][zielSpalte] == null && _schachbrett[zeile - 1][spalte] == null
				&& zeile == 6) {
			Figuren f = _schachbrett[zeile][spalte];
			_schachbrett[zeile][spalte] = null;
			_schachbrett[zielZeile][zielSpalte] = f;
		} else if (zielZeile == zeile + 1 && (zielSpalte == spalte + 1 || zielSpalte == spalte - 1)
				&& figur.gibFigurenFarbe() == FigurenFarbe.SCHWARZ && _schachbrett[zielZeile][zielSpalte] != null
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
