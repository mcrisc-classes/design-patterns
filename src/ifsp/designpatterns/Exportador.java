package ifsp.designpatterns;

import java.util.List;

public class Exportador {
	private void exportar(List<Imovel> imoveis) {
		for (Imovel im : imoveis) {
			System.out.printf("%s %d %d %.1f\n", 
					im.getCategoria().toString(),
					im.getDormitorios(),
					im.getVagas(),
					im.getArea());
		}
	}
	
	public static void main(String[] args) {
		List<Imovel> imoveis = List.of(
				new Imovel(Imovel.Categoria.ECONOMICA, 2, 1, 35),
				new Imovel(Imovel.Categoria.ECONOMICA, 1, 2, 42),
				new Imovel(Imovel.Categoria.MEDIA, 3, 3, 90),
				new Imovel(Imovel.Categoria.ALTA, 4, 6, 320),
				new Imovel(Imovel.Categoria.ECONOMICA, 2, 0, 20),
				new Imovel(Imovel.Categoria.ALTA, 5, 10, 400),
				new Imovel(Imovel.Categoria.MEDIA, 3, 2, 140)
				);

		Exportador exportador = new Exportador();
		exportador.exportar(imoveis);		
	}
}
