
package form;
import bean.agendabean;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.http.HttpServletRequest;
public class modifierutilisateurform {
    public void modifierChef(HttpServletRequest request){
    	/*RECUPERATION DES CHAMPS*/
        int id = Integer.parseInt(request.getParameter("idChef"));
        String NomPrenom = request.getParameter("NomPrenom");
        String Email = request.getParameter("Email");
        String MotDePasse = request.getParameter("MotDePasse");
        String Fonction = request.getParameter("Fonction");
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
    	    String query="Update chefdeprojet set NomPrenomChef='"+NomPrenom+"',EmailChef='"+Email+"',MotDePasseChef='"+MotDePasse+"',FonctionChef='"+Fonction+"' where id_ChefDeProjet='"+id+"'";
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
    public void SupprimerChef(HttpServletRequest request){
        int id = Integer.parseInt(request.getParameter("idChef"));
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
    	    String query="delete from chefdeprojet where id_Agenda='"+id+"'";
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
    public void ajouterUtil(HttpServletRequest request){
            /*RECUPERATION DES CHAMPS*/
        String NomPrenom = request.getParameter("NomPrenom");
        String Email = request.getParameter("Email");
        String MotDePasse = request.getParameter("MotDePasse");
        String Fonction = request.getParameter("Fonction");
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
                if(Fonction.equals("Chef De Projet")){
                String query="INSERT into chefdeprojet (NomPrenomChef,EmailChef,MotDePasseChef,FonctionChef) VALUES ('"+NomPrenom+"','"+Email+"','"+MotDePasse+"','"+Fonction+"')";
                statement.executeUpdate(query);}
                else{
                String query="INSERT into collaborateur (NomPrenom,Email,MotDePasse,Fonction) VALUES ('"+NomPrenom+"','"+Email+"','"+MotDePasse+"','"+Fonction+"')";
                statement.executeUpdate(query);}

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
/*COLLABORATEEEEUR*/
    public void modifierColl(HttpServletRequest request){
    	/*RECUPERATION DES CHAMPS*/
        int id = Integer.parseInt(request.getParameter("idColl"));
        String NomPrenom = request.getParameter("NomPrenomColl");
        String Email = request.getParameter("EmailColl");
        String MotDePasse = request.getParameter("MotDePasseColl");
        String Fonction = request.getParameter("FonctionColl");
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
    	    String query="Update collaborateur set NomPrenom='"+NomPrenom+"',Email='"+Email+"',MotDePasse='"+MotDePasse+"',Fonction='"+Fonction+"' where id_Collaborateur='"+id+"'";
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
