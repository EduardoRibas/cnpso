package br.upe.dsc.pso;

import java.util.Random;

import br.upe.dsc.pso.problemas.IProblem;

public class Particle {
	private int dimensoes;
	private Double[] posicaoAtual;
	private Double[] pBest;
	private Double[] velocidade;

	/**
	 * Cria uma nova part�cula.
	 * 
	 * @param dimensoes
	 *            N�mero de dimens�es do espa�o de busca.
	 */
	public Particle(int dimensoes) {
		this.dimensoes = dimensoes;
		posicaoAtual = new Double[dimensoes];
		pBest = new Double[dimensoes];
		velocidade = new Double[dimensoes];
	}

	/**
	 * Retorna a posi��o atual da part�cula.
	 * 
	 * @return A posi��o atual da part�cula.
	 */
	public Double[] getPosicaoAtual() {
		return posicaoAtual;
	}

	/**
	 * Atribui a posi��o atual da part�cula.
	 * 
	 * @param currentPosition
	 *            a posi��o atual da part�cula.
	 */
	public void setPosicaoAtual(Double[] posicaoAtual) {
		this.posicaoAtual = posicaoAtual;
	}

	/**
	 * Retorna a melhor posi��o j� encontrada pela part�cula.
	 * 
	 * @return A melhor posi��o j� encontrada pela part�cula.
	 */
	public Double[] getPBest() {
		return pBest;
	}

	/**
	 * Atribui a melhor posi��o j� encontrada pela part�cula.
	 * 
	 * @param melhorPosicao
	 *            a melhor posi��o j� encontrada pela part�cula.
	 */
	public void setPBest(Double[] melhorPosicao) {
		this.pBest = melhorPosicao;
	}

	/**
	 * Retorna a velocidade atual da part�cula. Dimension
	 * 
	 * @return A velocidade atual da part�cula.
	 */
	public Double[] getVelocidade() {
		return velocidade;
	}

	/**
	 * Atribui a velocidade atual da part�cula.
	 * 
	 * @param velocidade
	 *            a velocidade atual da part�cula.
	 */
	public void setVelocidade(Double[] velocidade) {
		this.velocidade = velocidade;
	}

	/**
	 * Atualiza a velocidade atual da part�cula.
	 * 
	 * @param melhorParticulaVizinhanca
	 *            A part�cula da vizinhan�a desta part�cula que possui a melhor
	 *            posi��o.
	 */
	public void atualizarVelocidade(double inercialWeight,
			Double[] posicaoMelhorParticulaVizinhanca, Double C1, Double C2) {
		Random random = new Random();
		Double R1 = random.nextDouble();
		Double R2 = random.nextDouble();

		for (int i = 0; i < dimensoes; i++) {
			velocidade[i] = inercialWeight * velocidade[i] + C1 * R1
					* (pBest[i] - posicaoAtual[i]) + C2 * R2
					* (posicaoMelhorParticulaVizinhanca[i] - posicaoAtual[i]);
		}
	}

	/**
	 * Atualiza a posi��o atual da part�cula.
	 */
	public void atualizarPosicaoAtual(IProblem problema) {
		for (int i = 0; i < dimensoes; i++) {
			posicaoAtual[i] = posicaoAtual[i] + velocidade[i];

			posicaoAtual[i] = (posicaoAtual[i] <= problema.getLimiteSuperior(i)) ? posicaoAtual[i]
					: problema.getLimiteSuperior(i);
			posicaoAtual[i] = (posicaoAtual[i] >= problema.getLimiteInferior(i)) ? posicaoAtual[i]
					: problema.getLimiteInferior(i);
		}
	}
}