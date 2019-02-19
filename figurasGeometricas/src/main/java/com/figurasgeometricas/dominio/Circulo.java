package com.figurasgeometricas.dominio;

import org.springframework.stereotype.Component;

import com.figurasgeometricas.dominio.FabricaForma.Tipo;

@Component
public class Circulo extends Forma implements FormaInterface{


	public int obtenerSuperficie() {
		return 0;
	}

	public int obtenerBase() {
		return 0;
	}

	public int obtenerAltura() {
		return 0;
	}

	public int obtenerDiametro() {
	return this.getDiámetro();
	}

	public Tipo obtenerTipoFigura() {
		return this.getTipoForma();
	}
}
