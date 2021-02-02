package ifsp.designpatterns;

public class FormatadorHTML implements Formatador {

	@Override
	public void formatar(Imovel im) {
		System.out.printf("<tr>\n\t<td>%s</td>\n\t<td>%d</td>\n\t<td>%d</td>\n\t<td>%.1f</td>\n</tr>\n", 
				im.getCategoria().toString(),
				im.getDormitorios(),
				im.getVagas(),
				im.getArea());
	}

}
