package br.upe.poli.base;

/**
 * TODO Descri��o do tipo
 * 
 * @author Danilo Ara�jo
 * @since 12/05/2010
 */
public class SwarmObserver {
	protected double[] dataX;
	protected double[] dataY;
	protected double[] dataZ;
	
	public void setDataX(double x, int index){
		if (index < dataX.length){
			dataX[index] = x;	
		}
	}
	
	public void setDataY(double y, int index){
		if (index < dataY.length){
			dataY[index] = y;
		}
	}
	
	public void setDataZ(double z, int index){
		if (index < dataZ.length){
			dataZ[index] = z;
		}
	}

	/**
	 * M�todo acessor para obter o valor do atributo dataX.
	 * 
	 * @return Retorna o atributo dataX.
	 */
	public double[] getDataX() {
		return dataX;
	}

	/**
	 * M�todo acessor para modificar o valor do atributo dataX.
	 * 
	 * @param dataX
	 *            O valor de dataX para setar.
	 */
	public void setDataX(double[] dataX) {
		this.dataX = dataX;
	}

	/**
	 * M�todo acessor para obter o valor do atributo dataY.
	 * 
	 * @return Retorna o atributo dataY.
	 */
	public double[] getDataY() {
		return dataY;
	}

	/**
	 * M�todo acessor para modificar o valor do atributo dataY.
	 * 
	 * @param dataY
	 *            O valor de dataY para setar.
	 */
	public void setDataY(double[] dataY) {
		this.dataY = dataY;
	}

	/**
	 * M�todo acessor para obter o valor do atributo dataZ.
	 * 
	 * @return Retorna o atributo dataZ.
	 */
	public double[] getDataZ() {
		return dataZ;
	}

	/**
	 * M�todo acessor para modificar o valor do atributo dataZ.
	 * 
	 * @param dataZ
	 *            O valor de dataZ para setar.
	 */
	public void setDataZ(double[] dataZ) {
		this.dataZ = dataZ;
	}

}
