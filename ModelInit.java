import java.sql.*;
import java.awt.List;

public class ModelInit {
	public ModelInit() {
		
	}
    public List getPiece(){
		int i;
		List list = new List();
		try {
		    Class.forName("org.mariadb.jdbc.Driver");  
		    try {
				Connection con=DriverManager.getConnection("jdbc:mariadb://dwarves.iut-fbleau.fr/lemoing","lemoing","123456");
				try{
					
			   		PreparedStatement requete = con.prepareStatement("SELECT count(*) FROM Piece");
			   		ResultSet res = requete.executeQuery();
					res.first();
					i=res.getInt("count(*)");
					requete = con.prepareStatement("SELECT * FROM Piece");
					res = requete.executeQuery();
					res.first();
					for(int x=0;x<i;x++) {
						list.add(res.getString("NomPiece"));
						res.next();
					}
				    res.close();
				    requete.close();
				    con.close();
				}catch(SQLException e){
			    	System.err.println("Probleme de statement");
				}
		    }catch(SQLException e){
				System.err.println(e.getMessage());
			}
		}catch(ClassNotFoundException e){
		    System.err.println("Probleme de classe");
		    System.err.println(e.getMessage());
		}
		return(list);
    }
    public Meuble[] getBien(){
		int i;
		Meuble[] m=new Meuble[1];
		try {
		    Class.forName("org.mariadb.jdbc.Driver");  
		    try {
				Connection con=DriverManager.getConnection("jdbc:mariadb://dwarves.iut-fbleau.fr/lemoing","lemoing","123456");
				try{
					
			   		PreparedStatement requete = con.prepareStatement("SELECT count(*) FROM Bien");
			   		ResultSet res = requete.executeQuery();
					res.first();
					i=res.getInt("count(*)");
					m=new Meuble[i];
					requete = con.prepareStatement("SELECT * FROM Bien");
					res = requete.executeQuery();
					res.first();
					for(int x=0;x<i;x++) {
						m[x]=new Meuble(res.getInt("IdBien"),res.getString("Nom"));
						res.next();
					}
				    res.close();
				    requete.close();
				    con.close();
				}catch(SQLException e){
			    	System.err.println("Probleme de statement");
				}
		    }catch(SQLException e){
				System.err.println(e.getMessage());
			}
		}catch(ClassNotFoundException e){
		    System.err.println("Probleme de classe");
		    System.err.println(e.getMessage());
		}
		return(m);
    }
    public Meuble[] getBienPiece(String piece){
		int i;
		Meuble[] m=new Meuble[1];
		try {
		    Class.forName("org.mariadb.jdbc.Driver");  
		    try {
				Connection con=DriverManager.getConnection("jdbc:mariadb://dwarves.iut-fbleau.fr/lemoing","lemoing","123456");
				try{
					
			   		PreparedStatement requete = con.prepareStatement("SELECT count(*) FROM Bien WHERE Piece='"+piece+"';");
			   		ResultSet res = requete.executeQuery();
					res.first();
					i=res.getInt("count(*)");
					m=new Meuble[i];
					requete = con.prepareStatement("SELECT * FROM Bien WHERE Piece='"+piece+"';");
					res = requete.executeQuery();
					res.first();
					for(int x=0;x<i;x++) {
						m[x]=new Meuble(res.getInt("IdBien"),res.getString("Nom"));
						res.next();
					}
				    res.close();
				    requete.close();
				    con.close();
				}catch(SQLException e){
			    	System.err.println("Probleme de statement");
				}
		    }catch(SQLException e){
				System.err.println(e.getMessage());
			}
		}catch(ClassNotFoundException e){
		    System.err.println("Probleme de classe");
		    System.err.println(e.getMessage());
		}
		return(m);
    }
    public int[] getCartonPiece(String piece){
		int[] i= new int[5];
		
		try {
		    Class.forName("org.mariadb.jdbc.Driver");  
		    try {
				Connection con=DriverManager.getConnection("jdbc:mariadb://dwarves.iut-fbleau.fr/lemoing","lemoing","123456");
				try{
					
			   		PreparedStatement requete = con.prepareStatement("SELECT count(*) FROM Carton WHERE Piece='"+piece+"'&& "
			   				+ "TypeCarton='PETIT';");
			   		ResultSet res = requete.executeQuery();
					res.first();
					i[0]=res.getInt("count(*)");
					requete = con.prepareStatement("SELECT count(*) FROM Carton WHERE Piece='"+piece+"'&& "
			   				+ "TypeCarton='MOYEN';");
			   		res = requete.executeQuery();
					res.first();
					i[1]=res.getInt("count(*)");
					requete = con.prepareStatement("SELECT count(*) FROM Carton WHERE Piece='"+piece+"'&& "
			   				+ "TypeCarton='BARREL';");
			   		res = requete.executeQuery();
					res.first();
					i[2]=res.getInt("count(*)");
					requete = con.prepareStatement("SELECT count(*) FROM Carton WHERE Piece='"+piece+"'&& "
			   				+ "TypeCarton='PENDERIE';");
			   		res = requete.executeQuery();
					res.first();
					i[3]=res.getInt("count(*)");
					requete = con.prepareStatement("SELECT count(*) FROM Carton WHERE Piece='"+piece+"'&& "
			   				+ "TypeCarton='TABLEAUX';");
			   		res = requete.executeQuery();
					res.first();
					i[4]=res.getInt("count(*)");

				    res.close();
				    requete.close();
				    con.close();
				}catch(SQLException e){
			    	System.err.println("Probleme de statement");
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
}
