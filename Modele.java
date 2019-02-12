import java.sql.*;

public class Modele {
	public Modele() {
		
	}
    public int ajoutMeuble(String img,String nom,String des,int lon,int lar,int hau,int nbelem,String piece){
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
					PreparedStatement requete = con.prepareStatement("INSERT INTO Bien(IdBien, Nom, Photo, Description, Longueur, Largeur, Hauteur, NbElement, Piece) "
							+"VALUES('"+i+"','"+nom+"','"+img+"','"+des+"','"+lon+"','"+lar+"','"+hau+"','"+nbelem+"','"+piece+"');");
			   		requete.executeUpdate();
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
    public void AjoutCarton(String type,String des, String piece,int bien) {
		try {
		    Class.forName("org.mariadb.jdbc.Driver");  
		    try {
				Connection con=DriverManager.getConnection("jdbc:mariadb://dwarves.iut-fbleau.fr/lemoing","lemoing","123456");
				try{
					PreparedStatement requete = null;
					if(bien!=-1)
						requete = con.prepareStatement("INSERT INTO  Carton(TypeCarton,Description,Piece,IdBien)"
				   				+"VALUES('"+type+"','"+des+"','"+piece+"','"+bien+"');");
					else
						requete = con.prepareStatement("INSERT INTO  Carton(TypeCarton,Description,Piece)"
				   				+"VALUES('"+type+"','"+des+"','"+piece+"');");
					requete.executeUpdate();
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
    public int ajoutFacture(int idBien,int valeur ,String facture){
    	int i=0;
		try {
		    Class.forName("org.mariadb.jdbc.Driver");  
		    try {
				Connection con=DriverManager.getConnection("jdbc:mariadb://dwarves.iut-fbleau.fr/lemoing","lemoing","123456");
				try {
					PreparedStatement requete = con.prepareStatement("INSERT INTO Facture(IdBien, Valeur, Facture) "
							+"VALUES('"+idBien+"','"+valeur+"','"+facture+"');");
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
    public void AjoutCartonEstime(int petit,int moyen,int barrel,int penderie,int tableaux, String piece) {
		try {
		    Class.forName("org.mariadb.jdbc.Driver");  
		    try {
				Connection con=DriverManager.getConnection("jdbc:mariadb://dwarves.iut-fbleau.fr/lemoing","lemoing","123456");
				try{
					PreparedStatement requete =null;
					for(int i=0;i<petit;i++) {
						requete = con.prepareStatement("INSERT INTO  CartonEstime(TypeCarton,Piece)"
				   				+"VALUES('PETIT','"+piece+"');");
						requete.executeUpdate();
					}
					for(int i=0;i<moyen;i++) {
						requete = con.prepareStatement("INSERT INTO  CartonEstime(TypeCarton,Piece)"
			   				+"VALUES('MOYEN','"+piece+"');");
						requete.executeUpdate();
					}
					for(int i=0;i<barrel;i++) {
						requete = con.prepareStatement("INSERT INTO  CartonEstime(TypeCarton,Piece)"
								+"VALUES('BARREL','"+piece+"');");
						requete.executeUpdate();
					}
					for(int i=0;i<penderie;i++) {
						requete = con.prepareStatement("INSERT INTO  CartonEstime(TypeCarton,Piece)"
								+"VALUES('PENDERIE','"+piece+"');");
						requete.executeUpdate();
					}
					for(int i=0;i<tableaux;i++) {
						requete = con.prepareStatement("INSERT INTO  CartonEstime(TypeCarton,Piece)"
								+"VALUES('TABLEAUX','"+piece+"');");
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
