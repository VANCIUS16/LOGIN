package com.example.demo.modelo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cat_usr")
public class IMC 
{	
	@Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name = "Id_Usr")
	private Long idUser;
	
	@Column(name = "Sexo")
    private String sexo;
	
	@Column(name = "Edad")
    private Integer edad;
	
	@Column(name = "Estatura")
    private Float estatura;
	
	@Column(name = "Peso")
	private Float peso;
	
	@Column(name = "IMC")
	private Float imc;
	
	@Column(name = "Fecha")
	private String fecha;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Float getEstatura() {
		return estatura;
	}

	public void setEstatura(Float estatura) {
		this.estatura = estatura;
	}

	public Float getPeso() {
		return peso;
	}

	public void setPeso(Float peso) {
		this.peso = peso;
	}

	public Float getImc() {
		return imc;
	}

	public void setImc(Float imc) {
		this.imc = imc;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	
}
