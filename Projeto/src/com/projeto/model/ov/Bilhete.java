/**
 * 
 */
package com.projeto.model.ov;

import java.time.LocalDateTime;

/**
 * @author joaomcode
 *
 */
public class Bilhete {

	private long id;
	private String numero;
	private LocalDateTime dataEmbarque;
	private String localPartida;
	private String destino;
	private int tipoBilhete;
	private int situacaoBilhete;

	/**
	 * @param id
	 * @param numero
	 * @param dataEmbarque
	 * @param localPartida
	 * @param destino
	 * @param tipoBilhete
	 * @param situacaoBilhete
	 */
	public Bilhete(long id, String numero, LocalDateTime dataEmbarque, String localPartida, String destino,
			int tipoBilhete, int situacaoBilhete) {
		this.id = id;
		this.numero = numero;
		this.dataEmbarque = dataEmbarque;
		this.localPartida = localPartida;
		this.destino = destino;
		this.tipoBilhete = tipoBilhete;
		this.situacaoBilhete = situacaoBilhete;
	}

	/**
	 * @param numero
	 * @param dataEmbarque
	 * @param localPartida
	 * @param destino
	 * @param tipoBilhete
	 * @param situacaoBilhete
	 */
	public Bilhete(String numero, LocalDateTime dataEmbarque, String localPartida, String destino, int tipoBilhete,
			int situacaoBilhete) {
		this.numero = numero;
		this.dataEmbarque = dataEmbarque;
		this.localPartida = localPartida;
		this.destino = destino;
		this.tipoBilhete = tipoBilhete;
		this.situacaoBilhete = situacaoBilhete;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * @return the dataEmbarque
	 */
	public LocalDateTime getDataEmbarque() {
		return dataEmbarque;
	}

	/**
	 * @param dataEmbarque the dataEmbarque to set
	 */
	public void setDataEmbarque(LocalDateTime dataEmbarque) {
		this.dataEmbarque = dataEmbarque;
	}

	/**
	 * @return the localPartida
	 */
	public String getLocalPartida() {
		return localPartida;
	}

	/**
	 * @param localPartida the localPartida to set
	 */
	public void setLocalPartida(String localPartida) {
		this.localPartida = localPartida;
	}

	/**
	 * @return the destino
	 */
	public String getDestino() {
		return destino;
	}

	/**
	 * @param destino the destino to set
	 */
	public void setDestino(String destino) {
		this.destino = destino;
	}

	/**
	 * @return the tipoBilhete
	 */
	public int getTipoBilhete() {
		return tipoBilhete;
	}

	/**
	 * @param tipoBilhete the tipoBilhete to set
	 */
	public void setTipoBilhete(int tipoBilhete) {
		this.tipoBilhete = tipoBilhete;
	}

	/**
	 * @return the situacaoBilhete
	 */
	public int getSituacaoBilhete() {
		return situacaoBilhete;
	}

	/**
	 * @param situacaoBilhete the situacaoBilhete to set
	 */
	public void setSituacaoBilhete(int situacaoBilhete) {
		this.situacaoBilhete = situacaoBilhete;
	}

}
