package max.decorateur;

public class Main {

	public static void main(String[] args) 
	{
		Voiture laVoiture = new Porsche();
		
		System.out.println("Le prix de la voiture est : "+laVoiture.cout()+"$");
		
		Voiture laDeuxiemeVoiture = new Peugeot();
		ToitOuvrantDecorateur nouvelleDeuxieme = new ToitOuvrantDecorateur(laDeuxiemeVoiture);
		
		System.out.println(laDeuxiemeVoiture.getDescription());
		
		System.out.println(nouvelleDeuxieme.etatToit());
		
		nouvelleDeuxieme.ouvrirToit();
		
		System.out.println(nouvelleDeuxieme.etatToit());
	}

}
