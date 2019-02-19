package com.figurasgeometricas.dominio;

import org.springframework.stereotype.Component;

import com.figurasgeometricas.dominio.FabricaForma.Tipo;

@Component
public class Triangulo extends Forma implements FormaInterface
{

	@Override
	public int obtenerSuperficie() {
		return this.getSuperficie();
	}

	@Override
	public int obtenerBase() {
		return this.getBase();
	}

	@Override
	public int obtenerAltura() {
		return this.getAltura();
	}

	@Override
	public int obtenerDiametro() {
		return 0;
	}

	@Override
	public Tipo obtenerTipoFigura() {
		return this.getTipoForma();
	}


}
