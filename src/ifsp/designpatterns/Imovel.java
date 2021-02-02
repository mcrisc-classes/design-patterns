package ifsp.designpatterns;

public class Imovel {
	public enum Categoria {
		ECONOMICA, MEDIA, ALTA
	};

	private Categoria categoria;
	private int dormitorios;
	private int vagas;
	private double area;

	public Imovel() {
	}

	public Imovel(Categoria categoria, int dormitorios, int vagas, double area) {
		this.categoria = categoria;
		this.dormitorios = dormitorios;
		this.vagas = vagas;
		this.area = area;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public int getDormitorios() {
		return dormitorios;
	}

	public void setDormitorios(int dormitorios) {
		this.dormitorios = dormitorios;
	}

	public int getVagas() {
		return vagas;
	}

	public void setVagas(int vagas) {
		this.vagas = vagas;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

}
