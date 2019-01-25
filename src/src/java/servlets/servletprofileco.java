/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import bean.agendabean;
import form.modifieragendaform;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import static servlets.servletconnexion.VU;
import static servlets.servletconnexion.VUE;

public class servletprofileco extends HttpServlet {
    public static final String VU              = "/WEB-INF/profile co.jsp";
    public static final String VUE              = "profileco";
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher(VU).forward( request, response );
        
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String disponibilite = request.getParameter( "Disponibilite" );
        String nomprenom = request.getParameter( "NomPrenom" );
        String datenaissance = request.getParameter( "DateNaissance" );
        String adresse = request.getParameter( "Adresse" );
        String tel = request.getParameter( "Telephone" );
        String email = request.getParameter( "Email" );
        String diplome = request.getParameter( "Diplome" );
        String  AnneeObtention= request.getParameter( "AnneeObtention" );
        String etablissement = request.getParameter( "Etablissement" );
        String competence = request.getParameter( "Competences" );
        HttpSession session = request.getSession();
        String ident=(String)session.getAttribute("sessionUtilisateur");
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
    	    String query="Update collaborateur set Disponibilite='"+disponibilite+"',Email='"+email+"',DateNaissance='"+datenaissance+"',Adresse='"+adresse+"',Telephone='"+tel+"',Diplome='"+diplome+"',AnneeObtention='"+AnneeObtention+"',Competences='"+competence+"',Etablissement='"+etablissement+"' where Email='"+ident+"'";
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
        response.sendRedirect( VUE );
    }



}
