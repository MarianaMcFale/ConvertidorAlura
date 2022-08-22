package com.mycompany.conversor;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marum
 */
public class Moneda {
    	private double valorDolarUsa;
	private double valorLibraEsterlina;
	private double valorYenJapones;
	private double valorEuro;
	private double valorWonSurCoreano;
	
	public double getValorDolarUsa() {
		return valorDolarUsa;
	}
	public void setValorDolarUsa(double valorDolarUsa) {
		this.valorDolarUsa = valorDolarUsa;
	}
	public double getValorLibraEsterlina() {
		return valorLibraEsterlina;
	}
	public void setValorLibraEsterlina(double valorLibraEsterlina) {
		this.valorLibraEsterlina = valorLibraEsterlina;
	}
	public double getValorYenJapones() {
		return valorYenJapones;
	}
	public void setValorYenJapones(double valorYenJapones) {
		this.valorYenJapones = valorYenJapones;
	}
	public double getValorEuro() {
		return valorEuro;
	}
	public void setValorEuro(double valorEuro) {
		this.valorEuro = valorEuro;
	}
	public double getValorWonSurCoreano() {
		return valorWonSurCoreano;
	}
	public void setValorWonSurCoreano(double valorWonSurCoreano) {
		this.valorWonSurCoreano = valorWonSurCoreano;
	}
	
	public double ConvertirADolarUSA (double valor) {
		double total = Math.round((valor * this.getValorDolarUsa())*100.0)/100.0;
		return total;
	}

	public double ConvertirAEuro (double valor) {
		double total = Math.round((valor * this.getValorEuro())*100.0)/100.0;
		return total;
	}
	public double ConvertirALibra (double valor) {
		double total = Math.round((valor * this.getValorLibraEsterlina())*100.0)/100.0;
		return total;
	}
	public double ConvertirAYen (double valor) {
		double total = Math.round((valor * this.getValorYenJapones())*100.0)/100.0;
		return total;
	}
	public double ConvertirAWon (double valor) {
		double total = Math.round((valor * this.getValorWonSurCoreano())*100.0)/100.0;
		return total;
	}
	
	public double ConvertirDeDolarUSA (double valor) {
		double total = Math.round((valor / this.getValorDolarUsa())*100.0)/100.0;
		return total;
	}

	public double ConvertirDeEuro (double valor) {
		double total = Math.round((valor / this.getValorEuro())*100.0)/100.0;
		return total;
	}
	public double ConvertirDeLibra (double valor) {
		double total = Math.round((valor / this.getValorLibraEsterlina())*100.0)/100.0;
		return total;
	}
	public double ConvertirDeYen (double valor) {
		double total = Math.round((valor / this.getValorYenJapones())*100.0)/100.0;
		return total;
	}
	public double ConvertirDeWon (double valor) {
		double total = Math.round((valor / this.getValorWonSurCoreano())*100.0)/100.0;
		return total;
	}
}
