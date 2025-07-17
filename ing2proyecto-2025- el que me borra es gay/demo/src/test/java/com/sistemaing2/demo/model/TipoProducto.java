package com.sistemaing2.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Table(name="tipoproducto")
@Entity
@Getter
@Setter
@AllArgsConstructor 

public class TipoProducto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private int id;
	
	@Column(name="nombre")	
    private String nombre;
	

}
