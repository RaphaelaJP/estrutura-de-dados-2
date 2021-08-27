/**
 * 
 */
package br.edu.ifs.ed2.dados.hash.chave;

/**
 * Classe que implementa uma opera��o de constru��o de chaves num�ricas a partir
 * do exemplo a seguir:
 * 
 * Conte�do: 34 -> Chave; 34
 * 
 * Conte�do: -98 -> Chave: 98
 * 
 * 
 *
 */
public class ChaveNumerica implements EstrategiaChave<Integer> {

	/**
	 * 
	 */
	@Override
	public int gerarChave(Integer conteudo) {

		/*
		 * Inicializa��o da chave.
		 */
		int chave = 0;

		/*
		 * C�lculo da chave.
		 */
		chave = Math.abs(conteudo);  //O Abs => faz o calculo do m�dulo.
		/**
		 *obs: |x| =  x, quando o x >= 0
					 = -x, quando o x <  0 ; Por�m, em m�dulo retorna um valor positivo.
		 	Ex: |-3| = -(-3) = 3.
		 */

		/*
		 * Retorno da chave.
		 */
		return chave;
	}
}