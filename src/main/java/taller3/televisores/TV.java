package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal=1;
	private int precio=500; 
	private boolean estado;
	private int volumen=1;
	private Control control;
	private static int numTV;
	
	
	public TV(Marca marca, boolean estado) {
	     this.marca=marca;
	     this.estado=estado;
	     TV.numTV++;
	}
	public static int getNumTV() {
		return numTV;
	}


	public static void setNumTV(int numTV) {
		TV.numTV = numTV;
	}
/////////////////////////////////////////////////////////
	public void turnOn(){
		this.estado=true;
	}
	public void turnOff() {
		this.estado=false;
	}
	public boolean getEstado() {
		return this.estado;
	}
/////////////////////////////////////////////////////////
	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}
	
	public void canalUp() {
		if (getEstado()) {
			if (this.canal <121 && this.canal >0) {
				this.canal++;
			}
			
		}
	}
	public void canalDown() {
		if (getEstado()) {
			if (this.canal <121 && this.canal >0) {
				this.canal--;
			}
			
		}
	}
/////////////////////////////////////////////////////////
public int getVolumen() {
return volumen;
}

public void setVolumen(int volumen) {
this.volumen = volumen;
}	
public void volumenUp() {
	if (getEstado()==true) {
		if (this.canal <8 && this.canal >0) {
			this.canal++;
		}
		
	}
}
public void volumenDown() {
	if (getEstado()==true) {
		if (this.canal <8 && this.canal >=0) {
			this.canal--;
		}
		
	}
}
/////////////////////////////////////////////////////////////
	public Control getControl() {
		return control;
	}


	public void setControl(Control control) {
		this.control = control;
	}
//////////////////////////////////////////////////////////
	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}
//////////////////////////////////////////////////////////
	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
}
