package max.decorateur;

public abstract class Voiture
{
	String m_Description = "Voiture inconnue";
	public double m_Prix;
	public int m_Vitesse;
	
	public String getDescription()
	{
		return this.m_Description;
	}
	
	public abstract double cout();
	
}
