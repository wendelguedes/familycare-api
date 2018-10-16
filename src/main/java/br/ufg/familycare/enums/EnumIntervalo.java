package br.ufg.familycare.enums;

public enum EnumIntervalo {

	A(1),
	B(2),
	C(3),
	D(4),
	E(5),
	F(6),
	G(8),
	H(12),
	I(24);

	private int intervalo;

	EnumIntervalo(int intervalo) {
		this.intervalo = intervalo;
	}

	public int getIntervalo() {
		return intervalo;
	}

}
