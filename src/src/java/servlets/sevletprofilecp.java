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

public class sevletprofilecp extends HttpServlet {
    public static final String VU              = "/WEB-INF/profile cp.jsp";
    public static final String VUE              = "profilecp";
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher(VU).forward( request, response );
        
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String disponibilite = request.getParameter( "DisponibiliteChef" );
        String nomprenom = request.getParameter( "NomPrenomChef" );
        String datenaissance = request.getParameter( "DateNaissanceChef" );
        String adresse = request.getParameter( "AdresseChef" );
        String tel = request.getParameter( "TelephoneChef" );
        String email = request.getParameter( "EmailChef" );
        String diplome = request.getParameter( "DiplomeChef" );
        String  AnneeObtention= request.getParameter( "AnneeObtention" );
        String etablissement = request.getParameter( "EtablissementChef" );
        String competence = request.getParameter( "CompetencesChef" );
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
    	    String query="Update chefdeprojet set DisponibiliteChef='"+disponibilite+"',EmailChef='"+email+"',DateNaissanceChef='"+datenaissance+"',AdresseChef='"+adresse+"',TelephoneChef='"+tel+"',DiplomeChef='"+diplome+"',AnneeObtentionChef='"+AnneeObtention+"',CompetencesChef='"+competence+"',EtablissementChef='"+etablissement+"' where EmailChef='"+ident+"'";
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
