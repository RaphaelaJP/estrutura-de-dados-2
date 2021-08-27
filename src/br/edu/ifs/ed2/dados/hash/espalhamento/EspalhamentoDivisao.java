/**
 * 
 */
package br.edu.ifs.ed2.dados.hash.espalhamento;

/**
 * Classe que implementa a t�cnica de espalhamento via divis�o.
 * 
 * 
 *
 */
public class EspalhamentoDivisao<G> implements EstrategiaEspalhamento<G> {

	/**
	 * 
	 */
	@Override
	public int calcularIndice(int chave, int tamanho) {

		/*
		 * Inicializa��o do �ndice
		 */
		int indice = 0;

		/*
		 * C�lculo do �ndice com base na t�cnica de divis�o
		 */
		indice = chave % tamanho;

		/**
		 * � o m�todo mais comum da fun��o hash
		 * h(k) = k (mod m) => onde m, � o tamanho
		 */
		/*
		 * Retorno do �ndice
		 */
		return indice;
	}
}
