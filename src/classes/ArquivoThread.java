package classes;


public class ArquivoThread implements Runnable {
	private BuscaArquivo busca;
	private String nomeArquivo;
	
	public ArquivoThread(BuscaArquivo busca, String nomeArquivo) {
		this.busca = busca;
		this.nomeArquivo = nomeArquivo;
	}
	
	@Override
	public void run() {
		this.busca.busca(nomeArquivo);
	}
}
