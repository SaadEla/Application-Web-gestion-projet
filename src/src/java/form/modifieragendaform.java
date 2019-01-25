
package form;
import bean.agendabean;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.http.HttpServletRequest;
public class modifieragendaform {
    public void modifier(HttpServletRequest request){
    	/*RECUPERATION DES CHAMPS*/
        int id = Integer.parseInt(request.getParameter("id"));
        String nom = request.getParameter( "NomProjet" );
        String chefprojet = request.getParameter( "ChefProjet" );
        String datedebut = request.getParameter( "DateDebut" );
        String datefin = request.getParameter( "DateFin" );
        int etatavancement = Integer.parseInt(request.getParameter("EtatAvancement"));
        /*ETABLIR CONNEXION*/
        String url = "jdbc:mysql://localhost:3306/gestiondeprojet?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String utilisateur = "root";
        String motDePasse = "";
        Connection connexion = null;
        Statement statement = null;
        ResultSet resultat=null;
        try {
      	    connexion = DriverManager.getConnection( url, utilisateur, motDePasse );
    	    /* Création de l'objet gérant les requêtes */
    	    statement = connexion.createStatement();
    	    String query="Update agenda set IdentProjet='"+nom+"',ChefDeProjet='"+chefprojet+"',DateDebutProjet='"+datedebut+"',DateFinProjet='"+datefin+"',EtatAvancement='"+etatavancement+"'where id_Agenda='"+id+"'";
    	    statement.executeUpdate(query);
            
        }catch ( SQLException e ) {
        } finally {
            if ( resultat != null ) {
                try {
                    resultat.close();
                } catch ( SQLException ignore ) {
                }
            }
            if ( statement != null ) {
                try {
                    statement.close();
                } catch ( SQLException ignore ) {
                }
            }
            if ( connexion != null ) {
                try {
                    connexion.close();
                } catch ( SQLException ignore ) {
                }
            }
        }
    }
    public void Supprimer(HttpServletRequest request){
        int id = Integer.parseInt(request.getParameter("id"));
        String url = "jdbc:mysql://localhost:3306/gestiondeprojet?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String utilisateur = "root";
        String motDePasse = "";
        Connection connexion = null;
        Statement statement = null;
        ResultSet resultat=null;
        try {
      	    connexion = DriverManager.getConnection( url, utilisateur, motDePasse );
    	    /* Création de l'objet gérant les requêtes */
    	    statement = connexion.createStatement();
    	    String query="delete from agenda where id_Agenda='"+id+"'";
    	    statement.executeUpdate(query);
            
        }catch ( SQLException e ) {
        } finally {
            if ( resultat != null ) {
                try {
                    resultat.close();
                } catch ( SQLException ignore ) {
                }
            }
            if ( statement != null ) {
                try {
                    statement.close();
                } catch ( SQLException ignore ) {
                }
            }
            if ( connexion != null ) {
                try {
                    connexion.close();
                } catch ( SQLException ignore ) {
                }
            }
        }
        
    
    }
    public void ajouter(HttpServletRequest request){
            /*RECUPERATION DES CHAMPS*/
            String NomProjet = request.getParameter("NomProjet");
            String ChefProjet = request.getParameter("ChefProjet");
            String DateDebut = request.getParameter("DateDebut");
            String DateFin = request.getParameter("DateFin");
            /*ETABLIR CONNEXION*/
            String url = "jdbc:mysql://localhost:3306/gestiondeprojet?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            String utilisateur = "root";
            String motDePasse = "";
            Connection connexion = null;
            Statement statement = null;
            ResultSet resultat=null;
            try {
                connexion = DriverManager.getConnection( url, utilisateur, motDePasse );
                /* Création de l'objet gérant les requêtes */
                statement = connexion.createStatement();
                String query="INSERT into agenda (IdentProjet,ChefDeProjet,DateDebutProjet,DateFinProjet) VALUES ('"+NomProjet+"','"+ChefProjet+"','"+DateDebut+"','"+DateFin+"')";
                statement.executeUpdate(query);

            }catch ( SQLException e ) {
            } finally {
                if ( resultat != null ) {
                    try {
                        resultat.close();
                    } catch ( SQLException ignore ) {
                    }
                }
                if ( statement != null ) {
                    try {
                        statement.close();
                    } catch ( SQLException ignore ) {
                    }
                }
                if ( connexion != null ) {
                    try {
                        connexion.close();
                    } catch ( SQLException ignore ) {
                    }
                }
            }
        }
}
