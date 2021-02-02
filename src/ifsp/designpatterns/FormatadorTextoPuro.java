package ifsp.designpatterns;

public class FormatadorTextoPuro implements Formatador {

	@Override
	public void formatar(Imovel im) {
		System.out.printf("%s %d %d %.1f\n", 
				im.getCategoria().toString(),
				im.getDormitorios(),
				im.getVagas(),
				im.getArea());
	}

}
