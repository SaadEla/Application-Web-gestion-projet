package dao;

import bean.administrateurbean;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

public class daoconnexion {
	/* La liste qui contiendra tous les résultats de nos essais */
	private String messages;
        public String type=null;

	public String executerTest( HttpServletRequest request ) {
        try {
            System.out.println( "Chargement du driver..." );
            Class.forName( "com.mysql.jdbc.Driver" );
            System.out.println( "Driver chargé !" );
        } catch ( ClassNotFoundException e ) {
        	System.out.println( "Erreur lors du chargement : le driver n'a pas été trouvé dans le classpath ! <br/>"
                    + e.getMessage() );
        }
    	String url = "jdbc:mysql://localhost:3306/gestiondeprojet?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String utilisateur = "root";
        String motDePasse = "";
        Connection connexion = null;
        Statement statement = null;
        ResultSet resultat=null;
        String paramEmail = request.getParameter( "email" );
        String paramMotDePasse = request.getParameter( "password" );
        
        try {
      	    connexion = DriverManager.getConnection( url, utilisateur, motDePasse );
    	    /* Création de l'objet gérant les requêtes */
    	    statement = connexion.createStatement();
    	    String query="SELECT Email,MotDePasse FROM administrateur";
    	    resultat=statement.executeQuery(query);
            while ( resultat.next() ) {
                String Email = resultat.getString( "Email" );
                String MotDePasse = resultat.getString( "MotDePasse" );
                if(paramEmail.equals(Email) && paramMotDePasse.equals(MotDePasse)) {
                   messages="connexion reussie";
                   type="administrateur";
                }   
            }
        }catch ( SQLException e ) {}
        //SI IL EST CHEF DE PROJET
        try {
      	    connexion = DriverManager.getConnection( url, utilisateur, motDePasse );
    	    /* Création de l'objet gérant les requêtes */
    	    statement = connexion.createStatement();
    	    String query="SELECT EmailChef,MotDePasseChef FROM chefdeprojet";
    	    resultat=statement.executeQuery(query);
            while ( resultat.next() ) {
                String Email = resultat.getString( "EmailChef" );
                String MotDePasse = resultat.getString( "MotDePasseChef" );
                if(paramEmail.equals(Email) && paramMotDePasse.equals(MotDePasse)) {
                   messages="connexion reussie";
                   type="chef de projet";
                }   
            }



        }catch ( SQLException e ) {}
        try {
      	    connexion = DriverManager.getConnection( url, utilisateur, motDePasse );
    	    /* Création de l'objet gérant les requêtes */
    	    statement = connexion.createStatement();
    	    String query="SELECT Email,MotDePasse FROM collaborateur";
    	    resultat=statement.executeQuery(query);
            while ( resultat.next() ) {
                String Email = resultat.getString( "Email" );
                String MotDePasse = resultat.getString( "MotDePasse" );
                if(paramEmail.equals(Email) && paramMotDePasse.equals(MotDePasse)) {
                   messages="connexion reussie";
                   type="collaborateur";
                }   
            }



        }catch ( SQLException e ) {}
        finally {
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
        return messages;
    
}

}
