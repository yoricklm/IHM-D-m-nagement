
public class Meuble {
	private int id;
	private String nom;
	public Meuble(int i,String s) {
		this.id=i;
		this.nom=s;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
}
