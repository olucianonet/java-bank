// Se minha exceção 'extender' Exception
// ela será checked, com RunTime ela é unchecked.
public class MinhaExcecao extends RuntimeException {

	public MinhaExcecao() {
		super();
	}
	
	public MinhaExcecao(String message) {
		super(message);
	}
}
