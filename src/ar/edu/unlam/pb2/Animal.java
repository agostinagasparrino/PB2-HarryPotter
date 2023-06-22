package ar.edu.unlam.pb2;

public class Animal implements Hechizable {

	private String estado;

	@Override
	public void desarme() {
		// TODO Auto-generated method stub
		this.estado = "Me desarmaron";

	}

	@Override
	public void crecer() {
		// TODO Auto-generated method stub
		this.estado = "Ahora soy más grande";

	}

	@Override
	public String getEstado() {
		// TODO Auto-generated method stub
		return this.estado;
	}

	@Override
	public void setEstado(String estado) {
		// TODO Auto-generated method stub
		this.estado = estado;
		
	}

}
