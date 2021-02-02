package ifsp.designpatterns;

import java.util.List;

public class Exportador {
	private enum Formato {TEXTO_PURO, CSV, HTML};
	
	private void exportar(List<Imovel> imoveis, Formato formato) {
		
		switch (formato) {
		case TEXTO_PURO:
			for (Imovel im : imoveis) {
				System.out.printf("%s %d %d %.1f\n", 
						im.getCategoria().toString(),
						im.getDormitorios(),
						im.getVagas(),
						im.getArea());
			}
			break;
			
		case CSV:
			for (Imovel im : imoveis) {
				System.out.printf("%s,%d,%d,%.1f\n", 
						im.getCategoria().toString(),
						im.getDormitorios(),
						im.getVagas(),
						im.getArea());
			}			
			break;
			
		case HTML:
			for (Imovel im : imoveis) {
				System.out.printf("<tr>\n\t<td>%s</td>\n\t<td>%d</td>\n\t<td>%d</td>\n\t<td>%.1f</td>\n</tr>\n", 
						im.getCategoria().toString(),
						im.getDormitorios(),
						im.getVagas(),
						im.getArea());
			}			
			break;
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
		exportador.exportar(imoveis, Formato.HTML);		
	}
}
