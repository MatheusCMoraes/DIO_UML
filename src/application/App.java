package application;
import resources.Iphone;

public class App {

	public static void main(String[] args) {
		
		Iphone iphoneX =  new Iphone();

		iphoneX.atender();
		iphoneX.ligar();
		iphoneX.iniciarCorreioDeVoz();
		
		iphoneX.exibirPagina();
		iphoneX.atualizarPagina();
		iphoneX.adicionarNovaPagina();
		
		iphoneX.selecionarMusica();
		iphoneX.tocar();
		iphoneX.pausar();
	}

}
