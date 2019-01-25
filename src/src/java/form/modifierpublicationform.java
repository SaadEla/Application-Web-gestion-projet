
package form;
import bean.agendabean;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.http.HttpServletRequest;
public class modifierpublicationform {
    public void modifier(HttpServletRequest request){
    	/*RECUPERATION DES CHAMPS*/
        String nomprenom = request.getParameter( "NomPrenom" );
        String projet = request.getParameter( "Projet" );
        String objet = request.getParameter( "Objet" );
        String comment = request.getParameter( "Comment" );
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
    	    String query="Update publication set Publicateur='"+nomprenom+"',Sujet='"+projet+"',ObjetPublication='"+objet+"',Contenu='"+comment+"'where id_Agenda='1'";
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
            String nomprenom = request.getParameter( "NomPrenom" );
            String projet = request.getParameter( "Projet" );
            String objet = request.getParameter( "Objet" );
            String comment = request.getParameter( "Comment" );
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
                String query="INSERT into publication (Publicateur,Sujet,ObjetPublication,Contenu) VALUES ('"+nomprenom+"','"+projet+"','"+objet+"','"+comment+"')";
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
