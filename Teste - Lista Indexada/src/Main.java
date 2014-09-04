import com.senac.estruturas.ListaIndexada;
import com.senac.exceptions.ItemNaoEncontradoException;
import com.senac.exceptions.ListaVaziaException;


public class Main {
	public static void main(String[] args) {
		ListaIndexada<String> lista = new ListaIndexada<String>();
		
		lista.inserir("a");
		lista.inserir("b");
		lista.inserir("c");
		lista.inserir("d");
		
		try 
		{
			System.out.println(lista.procurar("c").getValor());
			System.out.println(lista.procurar("f").getValor());
		} 
		catch (ListaVaziaException | ItemNaoEncontradoException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
