package classes;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.Semaphore;

public class BuscaArquivo {
	private String textoBusca;
	private Semaphore semaforo = new Semaphore(2);
	
	public BuscaArquivo(String textoBusca) {
		this.textoBusca = textoBusca;
	}
	
	public void busca(String nomeArquivo) {
		String nome = Thread.currentThread().getName();
		try {
			semaforo.acquire();
            BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo));
            String line;
            int lineNumber = 0;

            while ((line = reader.readLine()) != null) {
                lineNumber++;

                if (line.toLowerCase().contains(textoBusca.toLowerCase())) {
                    System.out.println(nome+" encontrou o texto na linha " + lineNumber + ": " + line);
                }
            }

            reader.close();
        } catch (IOException e) {
        	e.printStackTrace();
        } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		semaforo.release();
	}
}
