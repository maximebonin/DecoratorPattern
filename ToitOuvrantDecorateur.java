package max.decorateur;

public class ToitOuvrantDecorateur extends DecorateurVoiture
{
	Voiture m_voiture;
	boolean m_ToitOuvert;
	
	public ToitOuvrantDecorateur(Voiture p_Voiture)
	{
		this.m_voiture = p_Voiture;
		this.m_ToitOuvert = false;
	}
	
	@Override
	public double cout() 
	{
		return this.m_voiture.cout()+850.23;
	}
	
	public String getDescription()
	{
		return this.m_voiture.getDescription()+" avec toit ouvrant";
	}
	
	public void ouvrirToit()
	{
		this.m_ToitOuvert = true;
	}
	
	public void fermerToit()
	{
		this.m_ToitOuvert = false;
	}
	
	public String etatToit()
	{
		if(this.m_ToitOuvert)
		{
			return "Le toit est ouvert !";
		}
		else
		{
			return "Le toit est fermé !";
		}
	}
	
}
