package com.dawes.modelo;
// Generated 25-ene-2018 10:02:38 by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * PruebaCultural generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "pruebaCultural", catalog = "gamitour")
public class PruebaCultural implements java.io.Serializable {

	private Integer idpruebacultural;
	private Parada parada;
	private String nombre;
	private String pregunta;
	private String respuesta;
	private Integer puntos;

	public PruebaCultural() {
	}

	public PruebaCultural(Parada parada) {
		this.parada = parada;
	}

	public PruebaCultural(Parada parada, String nombre, String pregunta, String respuesta, Integer puntos) {
		this.parada = parada;
		this.nombre = nombre;
		this.pregunta = pregunta;
		this.respuesta = respuesta;
		this.puntos = puntos;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idpruebacultural", unique = true, nullable = false)
	public Integer getIdpruebacultural() {
		return this.idpruebacultural;
	}

	public void setIdpruebacultural(Integer idpruebacultural) {
		this.idpruebacultural = idpruebacultural;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "parada_idparada", nullable = false)
	public Parada getParada() {
		return this.parada;
	}

	public void setParada(Parada parada) {
		this.parada = parada;
	}

	@Column(name = "nombre", length = 60)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "pregunta", length = 200)
	public String getPregunta() {
		return this.pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	@Column(name = "respuesta", length = 45)
	public String getRespuesta() {
		return this.respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	@Column(name = "puntos")
	public Integer getPuntos() {
		return this.puntos;
	}

	public void setPuntos(Integer puntos) {
		this.puntos = puntos;
	}

}
