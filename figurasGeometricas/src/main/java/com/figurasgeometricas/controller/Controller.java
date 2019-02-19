package com.figurasgeometricas.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.figurasgeometricas.dominio.Circulo;
import com.figurasgeometricas.dominio.Cuadrado;
import com.figurasgeometricas.dominio.FabricaForma;
import com.figurasgeometricas.dominio.FabricaForma.Tipo;
import com.figurasgeometricas.dominio.Forma;
import com.figurasgeometricas.dominio.Triangulo;

@RestController
public class Controller {

	@Autowired
	private Circulo circulo;

	@Autowired
	private Cuadrado cuadrado;

	@Autowired
	private Triangulo triangulo;

	@RequestMapping("/")
	public String healthCheck() {
		return "OK";
	}


	@RequestMapping("/circulo/getAll")
	public Circulo getCirculos() {

		Forma circulo = FabricaForma.crearForma(Tipo.CIRCULO);
		circulo.setAltura(1);
		circulo.setDiámetro(2);
		circulo.setBase(3);
		circulo.setSuperficie(4);
		circulo.setTipoForma(Tipo.CIRCULO);


		return (Circulo) circulo;
	}

	@RequestMapping("/triangulo/getAll")
	public Triangulo getTriangulos() {

		Forma triangulo = FabricaForma.crearForma(Tipo.TRIANGULO);
		triangulo.setAltura(1);
		triangulo.setDiámetro(2);
		triangulo.setBase(3);
		triangulo.setSuperficie(4);
		triangulo.setTipoForma(Tipo.TRIANGULO);


		return (Triangulo) triangulo;
	}



	@RequestMapping("/cuadrado/getAll")
	public List<Cuadrado> getCuadrados() {

		Forma cuadrado = FabricaForma.crearForma(Tipo.CUADRADO);
		cuadrado.setAltura(1);
		cuadrado.setDiámetro(2);
		cuadrado.setBase(3);
		cuadrado.setSuperficie(4);
		cuadrado.setTipoForma(Tipo.CIRCULO);
		
		
		Forma cuadrado2 = FabricaForma.crearForma(Tipo.CUADRADO);
		cuadrado2.setAltura(5);
		cuadrado2.setDiámetro(6);
		cuadrado2.setBase(7);
		cuadrado2.setSuperficie(8);
		cuadrado2.setTipoForma(Tipo.CIRCULO);

		List<Cuadrado> listaCuadrados = new ArrayList<Cuadrado>();
		listaCuadrados.add((Cuadrado) cuadrado);
		listaCuadrados.add((Cuadrado) cuadrado2);

		return listaCuadrados;
	}


	@PostMapping(path="/cuadrado/post",produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE} )
	public Forma postCuadrado() {

		Forma cuadrado = FabricaForma.crearForma(Tipo.CUADRADO);
		cuadrado.setAltura(1);
		cuadrado.setDiámetro(2);
		cuadrado.setBase(3);
		cuadrado.setSuperficie(4);
		cuadrado.setTipoForma(Tipo.CIRCULO);


		return (Cuadrado) cuadrado;
	}


	@PostMapping(path="/triangulo/post",produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE} )
	public Forma postTriangulo() {

		Forma triangulo = FabricaForma.crearForma(Tipo.TRIANGULO);
		triangulo.setAltura(1);
		triangulo.setDiámetro(2);
		triangulo.setBase(3);
		triangulo.setSuperficie(4);
		triangulo.setTipoForma(Tipo.CIRCULO);


		return (Triangulo) triangulo;
	}
	
	
	@PostMapping(path="/circulo/post",produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE} )
	public Forma postCirculo() {

		Forma circulo = FabricaForma.crearForma(Tipo.CIRCULO);
		circulo.setAltura(1);
		circulo.setDiámetro(2);
		circulo.setBase(3);
		circulo.setSuperficie(4);
		circulo.setTipoForma(Tipo.CIRCULO);


		return (Circulo) circulo;
	}








}
