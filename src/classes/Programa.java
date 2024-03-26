package classes;

public class Programa {

	public static void main(String[] args) {
		BuscaArquivo busca = new BuscaArquivo("dia");
		
		Thread arquvivo1 = new Thread
				(new ArquivoThread (busca, "arquivosNomes/nomescompletos-00.txt"));
		Thread arquvivo2 = new Thread
				(new ArquivoThread (busca, "arquivosNomes/nomescompletos-01.txt"));
		Thread arquvivo3 = new Thread
				(new ArquivoThread (busca, "arquivosNomes/nomescompletos-02.txt"));
		Thread arquvivo4 = new Thread
				(new ArquivoThread (busca, "arquivosNomes/nomescompletos-03.txt"));
		Thread arquvivo5 = new Thread
				(new ArquivoThread (busca, "arquivosNomes/nomescompletos-04.txt"));
		Thread arquvivo6 = new Thread
				(new ArquivoThread (busca, "arquivosNomes/nomescompletos-05.txt"));
		Thread arquvivo7 = new Thread
				(new ArquivoThread (busca, "arquivosNomes/nomescompletos-06.txt"));
		Thread arquvivo8 = new Thread
				(new ArquivoThread (busca, "arquivosNomes/nomescompletos-07.txt"));
		Thread arquvivo9 = new Thread
				(new ArquivoThread (busca, "arquivosNomes/nomescompletos-08.txt"));
		Thread arquvivo10 = new Thread
				(new ArquivoThread (busca, "arquivosNomes/nomescompletos-09.txt"));
		
		
		arquvivo1.start();
		arquvivo2.start();
		arquvivo3.start();
		arquvivo4.start();
		arquvivo5.start();
		arquvivo6.start();
		arquvivo7.start();
		arquvivo8.start();
		arquvivo9.start();
		arquvivo10.start();
	}

}
