package resources;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

	public void ligar() {
		System.out.println("Ligando");
	}
	
	public void atender() {
		System.out.println("Atendendo chamada");
	}
	
	public void iniciarCorreioDeVoz() {
		System.out.println("Iniciando correio de voz");
	}
	
	public void atualizarPagina() {
		System.out.println("Atualizando página");
	}
	
	public void adicionarNovaPagina() {
		System.out.println("Adicionando nova página");
	}
	
	public void exibirPagina() {
		System.out.println("Exibindo página");
	}
	
	
	public void tocar() {
		System.out.println("Reproduzindo música");
	}
	
	public void pausar() {
		System.out.println("Pausando música");
	}
	
	public void selecionarMusica() {
		System.out.println("Selecionando música");
	}
	

}
