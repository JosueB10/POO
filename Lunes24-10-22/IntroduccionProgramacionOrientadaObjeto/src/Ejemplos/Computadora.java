package Ejemplos;

public class Computadora {

	//Campos o atributos
	private String marca;
	private int VidaUtil;
	private double Precio;
	private int CantidadRAM;
	private int espacioDisco;
	private double frecuenciaTrabajo;
	
	
	
	
	
	//Metodos o comportamiento
	   //setters modificar el valor de una variable
	
	public void PonerMarca(String marca) {
	this.marca=marca;
	}
	
	public void PonerVidaUtil(int VidaUtil) {
		this.VidaUtil=VidaUtil;
		}
	
	public void PonerPrecio(double Precio) {
		this.Precio=Precio;
		}
	
	public void PonerCantidadRAM(int CantidadRAM) {
		this.CantidadRAM=CantidadRAM;
		}
	
	
	public void PonerespacioDisco(int espacioDisco) {
		this.espacioDisco=espacioDisco;
		}
	
	public void frecuenciaTrabajo(double frecuenciaTrabajo) {
		this.frecuenciaTrabajo=frecuenciaTrabajo;
		}
	
	//Getters mostrar el valor de una variable
	
	
	public String mostrarMarca() {
		return this.marca;
	}
	
	public int mostrarVidaUtil() {
		return this.VidaUtil;
	}
	
	public double mostrarPrecio() {
		return this.Precio;
	}
	
	public int mostrarCantidadRAM() {
		return this.CantidadRAM;
	}
	
	public int mostrarespacioDisco() {
		return this.espacioDisco;
	}
	
	public double mostrarfrecuenciaTrabajo() {
		return this.frecuenciaTrabajo;
	}
	
}
