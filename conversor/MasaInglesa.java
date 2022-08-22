package com.mycompany.conversor;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marum
 */
public class MasaInglesa {
    private double valorOnza;
	private double valorLibra;

	
	public double getValorOnza() {
		return valorOnza;
	}

	public void setValorOnza(double valorOnza) {
		this.valorOnza = valorOnza;
	}

	public double getValorLibra() {
		return valorLibra;
	}

	public void setValorLibra(double valorLibra) {
		this.valorLibra = valorLibra;
	}

	public double ConvertirAOnzas (double valor) {
		double total = Math.round((valor * this.getValorOnza())*100.0)/100.0;
		return total;
	}

	public double ConvertirALibras (double valor) {
		double total = Math.round((valor * this.getValorLibra())*100.0)/100.0;
		
		return total;
	}
	
	public double ConvertirDeOnzas (double valor) {
		double total = Math.round((valor / this.getValorOnza())*100.0)/100.0;
		
		return total;
	}

	public double ConvertirDeLibras (double valor) {
		double total = Math.round((valor / this.getValorLibra())*100.0)/100.0;
		
		return total;
	}
	
    
}
