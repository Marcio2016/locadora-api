package com.mt.locadora.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "carro")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Carro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EqualsAndHashCode.Include
	private Long id;
	
	private String placa;
	
	private String cor;
	
	private String chassi;
	
	@Column(name = "valor_diaria")
	private BigDecimal valorDiaria;
	
	@ManyToOne
	@JoinColumn(name="codigo_modelo")
	private ModeloCarro modelo;
}
