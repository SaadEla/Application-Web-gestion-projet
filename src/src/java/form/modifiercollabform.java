
package form;
import bean.agendabean;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.http.HttpServletRequest;
public class modifiercollabform {
    public void modifier(HttpServletRequest request){
    	/*RECUPERATION DES CHAMPS*/
        int id = Integer.parseInt(request.getParameter("id"));
        String collab = request.getParameter( "Collaborateur" );
        String tache = request.getParameter( "Tache" );
        String datedebut = request.getParameter( "DateDebutTache" );
        String datefin = request.getParameter( "DateFinTache" );
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
    	    String query="Update tache set Collaborateur='"+collab+"',Tache='"+tache+"',EtatAvancement='"+etatavancement+"',DateDebutTache='"+datedebut+"',DateFinTache='"+datefin+"'where id_Tache='"+id+"'";
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
    	    String query="delete from tache where id_Tache='"+id+"'";
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
            int id = Integer.parseInt(request.getParameter("id"));
            String Collab = request.getParameter("Collaborateur");
            String Tache = request.getParameter("Tache");
            String DateDebut = request.getParameter("DateDebutTache");
            String DateFin = request.getParameter("DateFinTache");
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
                String query="INSERT into tache (id_Projet,Collaborateur,Tache,DateDebutTache,DateFinTache) VALUES ('"+id+"','"+Collab+"','"+Tache+"','"+DateDebut+"','"+DateFin+"')";
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
