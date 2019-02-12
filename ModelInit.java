import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class ModelInit {
	public ModelInit() {
		
	}
    public static List<String> getPiece(){
		int i;
		List<String> list = new ArrayList<String>();
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
}
