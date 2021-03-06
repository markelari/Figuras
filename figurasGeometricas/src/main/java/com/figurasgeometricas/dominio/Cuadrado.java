package com.figurasgeometricas.dominio;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.figurasgeometricas.dominio.FabricaForma.Tipo;

@Component
@Scope("prototype")
public class Cuadrado extends Forma implements FormaInterface {

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
