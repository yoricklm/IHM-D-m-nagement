import java.sql.*;

public class Modele {
	public Modele() {
		
	}
    public int ajoutMeuble(String img,String des,int lon,int lar,int hau,int nbelem,String piece){
    	int i=0;
		try {
		    Class.forName("org.mariadb.jdbc.Driver");  
		    try {
				Connection con=DriverManager.getConnection("jdbc:mariadb://dwarves.iut-fbleau.fr/lemoing","lemoing","123456");
				try{
					PreparedStatement requete = con.prepareStatement("SELECT count(*) FROM Bien");
			   		ResultSet res = requete.executeQuery();
					res.first();
					i=res.getInt("count(*)");
				}catch(SQLException e){
			    	System.err.println("Probleme de statement count");
				}try {
					PreparedStatement requete = con.prepareStatement("INSERT INTO Bien(IdBien, Photo, Description, Longueur, Largeur, Hauteur, NbElement, Piece) "
							+"VALUES('"+i+"','"+img+"','"+des+"','"+lon+"','"+lar+"','"+hau+"','"+nbelem+"','"+piece+"');");
					System.out.println("1");
			   		requete.executeUpdate();
			   		System.out.println("1");
				    requete.close();
				    con.close();
				}catch(SQLException e){
			    	System.err.println("Probleme de statement");
			    	System.err.println(e.getMessage());
				}
		    }catch(SQLException e){
				System.err.println(e.getMessage());
			}
		}catch(ClassNotFoundException e){
		    System.err.println("Probleme de classe");
		    			    	System.err.println(e.getMessage());

		}
		return(i);
    }
    public void ajoutElement(int x,int id,String[] des,int[] lon,int[] lar,int[] hau) {
		try {
		    Class.forName("org.mariadb.jdbc.Driver");  
		    try {
				Connection con=DriverManager.getConnection("jdbc:mariadb://dwarves.iut-fbleau.fr/lemoing","lemoing","123456");
				try{
					PreparedStatement requete=null;
					for(int i=0;i<x;i++) {
						requete = con.prepareStatement("INSERT INTO  Element(IdBien,Description,Longueur,Largeur,Hauteur)"
								+"VALUES('"+id+"','"+des[i]+"','"+lon[i]+"','"+lar[i]+"','"+hau[i]+"');");
						requete.executeUpdate();
				    }
					requete.close();
					con.close();
				}catch(SQLException e){
			    	System.err.println("Probleme de statement");
			    	System.err.println(e.getMessage());
				}
		    }catch(SQLException e){
				System.err.println(e.getMessage());
			}
		}catch(ClassNotFoundException e){
		    System.err.println("Probleme de classe");
		}
    }
    public void AjoutCarton(int petit,int moyen,int barrel,int penderie,int tableaux, String piece) {
		try {
		    Class.forName("org.mariadb.jdbc.Driver");  
		    try {
				Connection con=DriverManager.getConnection("jdbc:mariadb://dwarves.iut-fbleau.fr/lemoing","lemoing","123456");
				try{
					PreparedStatement requete =null;
					for(int i=0;i<petit;i++) {
						requete = con.prepareStatement("INSERT INTO  Carton(TypeCarton,Description,Piece)"
				   				+"VALUES('PETIT','NULL','"+piece+"');");
						requete.executeUpdate();
					}
					for(int i=0;i<moyen;i++) {
						requete = con.prepareStatement("INSERT INTO  Carton(TypeCarton,Description,Piece)"
			   				+"VALUES('MOYEN','NULL','"+piece+"');");
						requete.executeUpdate();
					}
					for(int i=0;i<barrel;i++) {
						requete = con.prepareStatement("INSERT INTO  Carton(TypeCarton,Description,Piece)"
								+"VALUES('BARREL','NULL','"+piece+"');");
						requete.executeUpdate();
					}
					for(int i=0;i<penderie;i++) {
						requete = con.prepareStatement("INSERT INTO  Carton(TypeCarton,Description,Piece)"
								+"VALUES('PENDERIE','NULL','"+piece+"');");
						requete.executeUpdate();
					}
					for(int i=0;i<tableaux;i++) {
						requete = con.prepareStatement("INSERT INTO  Carton(TypeCarton,Description,Piece)"
								+"VALUES('TABLEAUX','NULL','"+piece+"');");
						requete.executeUpdate();
					}
				    requete.close();
				    con.close();
				}catch(SQLException e){
			    	System.err.println("Probleme de statement");
			    	System.err.println(e.getMessage());
				}
		    }catch(SQLException e){
				System.err.println(e.getMessage());
			}
		}catch(ClassNotFoundException e){
		    System.err.println("Probleme de classe");
		}
    }
}
