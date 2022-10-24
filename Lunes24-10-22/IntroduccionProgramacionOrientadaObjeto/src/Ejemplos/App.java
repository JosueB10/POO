package Ejemplos;

public class App {

	public static void main(String[] args) {
      Computadora pc1= new Computadora();
      //pc1.CantidadRAM = 8;
      //pc1.espacioDisco = 1024;
      //pc1.frecuenciaTrabajo = 3.5;
      //pc1.marca = "DELL";
      //pc1.Precio = 500.00;
      //pc1.VidaUtil = 5;
      
      pc1.PonerMarca("DELL");
      pc1.PonerCantidadRAM(8);
      pc1.PonerespacioDisco(1024);
      pc1.PonerPrecio(500.00);
      pc1.PonerVidaUtil(5);
      pc1.frecuenciaTrabajo(3.5);
      
      Computadora pc2= new Computadora();
      //pc2.CantidadRAM = 12;
      //pc2.espacioDisco = 2048;
      //pc2.frecuenciaTrabajo = 3.9;
      //pc2.marca = "Asus";
      //pc2.Precio = 980.00;
      //pc2.VidaUtil = 4;
      
      pc2.PonerCantidadRAM(12);
      pc2.PonerespacioDisco(2048);
      pc2.frecuenciaTrabajo(3.9);
      pc2.PonerMarca("Asus");
      pc2.PonerPrecio(980.00);
      pc2.PonerVidaUtil(4);
      
      
      
      Computadora pc3 = new Computadora();
      pc3.PonerCantidadRAM(512);
      pc3.PonerMarca("Lenovo");
      
      
      
      System.out.println("Marca de la pc1 : "+pc1.mostrarMarca());
      System.out.println("Precio de la pc1: "+pc1.mostrarPrecio());
      System.out.println("Marca de la pc2 : "+pc2.mostrarMarca());
      System.out.println("Precio de la pc2: "+pc2.mostrarPrecio());
      System.out.println("Marca de la pc3 : "+pc3.mostrarMarca());
      System.out.println("Precio de la pc3: "+pc3.mostrarPrecio());
	}

}
