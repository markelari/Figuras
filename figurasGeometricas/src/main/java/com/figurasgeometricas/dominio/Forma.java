package com.figurasgeometricas.dominio;

import com.figurasgeometricas.dominio.FabricaForma.Tipo;

public abstract class Forma {
	
	
	private int superficie;
	private int base;
	private int altura;
	private int diámetro; 
	private Tipo tipoForma;
	
	public int getSuperficie() {
		return superficie;
	}
	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getDiámetro() {
		return diámetro;
	}
	public void setDiámetro(int diámetro) {
		this.diámetro = diámetro;
	}
	public Tipo getTipoForma() {
		return tipoForma;
	}
	public void setTipoForma(Tipo tipoForma) {
		this.tipoForma = tipoForma;
	}
	
	
	
}