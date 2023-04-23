
public class Usuario {

	public static void main(String[] args) {

		SmartTv smartTv = new SmartTv();
		
		System.out.println("TV ligada? : " + smartTv.ligada);
		
		smartTv.ligar();
		System.out.println("Novo Status -> TV ligada? : " + smartTv.ligada);
		smartTv.desligar();
		System.out.println("Novo Status -> TV ligada? : " + smartTv.ligada);
		
		System.out.println("------------------- / / -------------");
		
		System.out.println("Canal atual: " + smartTv.canal);
		smartTv.mudarCanal(13);
		System.out.println("Canal atual: " + smartTv.canal);
		
		System.out.println("------------------- / / -------------");
		
		System.out.println("Volume atual: " + smartTv.volume);
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.aumentarVolume();
		System.out.println("Volume atual: " + smartTv.volume);
	
	}

}
