/**
 * 
 */
package br.edu.ifs.ed2.dados.hash.chave;

/**
 * Classe que implementa uma operação de construção de chaves numéricas a partir
 * do exemplo a seguir:
 * 
 * Conteúdo: 34 -> Chave; 34
 * 
 * Conteúdo: -98 -> Chave: 98
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
		 * Inicialização da chave.
		 */
		int chave = 0;

		/*
		 * Cálculo da chave.
		 */
		chave = Math.abs(conteudo);  //O Abs => faz o calculo do módulo.
		/**
		 *obs: |x| =  x, quando o x >= 0
					 = -x, quando o x <  0 ; Porém, em módulo retorna um valor positivo.
		 	Ex: |-3| = -(-3) = 3.
		 */

		/*
		 * Retorno da chave.
		 */
		return chave;
	}
}