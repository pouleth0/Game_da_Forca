package com.coddeveloper.JogoForca;

public enum nomeRandom {

	MELHOR, FOGO, SAPATO, MESA, VESTIDO, PALITO, AMIGOS, ESCOLA, TEXTO, ADIVINHA, HOMEM, MULHER, BRASIL, ALGORITIMOS;

	public static nomeRandom getRandom() {
		return values()[(int) (Math.random() * values().length)];
	}
}