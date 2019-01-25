/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

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
import static servlets.servletagenda.VU;
import static servlets.servletagenda.VUE;
import static servlets.servletsupprimeragenda.VUE;

public class servletsupprimermessage extends HttpServlet {
    public static final String VU              = "/WEB-INF/messagerie.jsp";
    public static final String VUE              = "messagerie";
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        this.getServletContext().getRequestDispatcher(VU).forward( request, response );
        String source = request.getParameter("source");
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
    	    String query="delete from message where Source='"+source+"'";
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

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.sendRedirect( VUE ); 
            
 
}
}
