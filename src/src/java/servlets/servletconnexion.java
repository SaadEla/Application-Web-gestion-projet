package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.administrateurbean;
import dao.daoconnexion;
import form.connexionform;

public class servletconnexion extends HttpServlet {
    public static final String VUE              = "/WEB-INF/Connexion.jsp";
    public static final String VU              = "/GestionDeProjets/accueiladmin.jsp";
    public static final String ATT_SESSION_USER = "sessionUtilisateur";
    public static final String ATT_USER         = "adm";
    public static final String ATT_FORM         = "type";

    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
    	this.getServletContext().getRequestDispatcher(VUE).forward( request, response );
    }
    public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        connexionform form = new connexionform();
        daoconnexion cnx=new daoconnexion();
        /* Traitement de la requête et récupération du bean en résultant */
        administrateurbean adm = form.connecterUtilisateur( request );
        /*recupere le nom pour afficher dans l'accueil*/
        String email=adm.getEmail();
        /* Récupération de la session depuis la requête */
        HttpSession session = request.getSession();
        String co=cnx.executerTest(request);
        String type=cnx.type;

        if ( co=="connexion reussie" ) {
            if(type=="administrateur" ){
            session.setAttribute( ATT_SESSION_USER, email );
            response.sendRedirect( VU );}
            if(type=="chef de projet" ){
            session.setAttribute( ATT_SESSION_USER, email );
            response.sendRedirect("/GestionDeProjets/accueilchefdeprojet.jsp");}
            if(type=="collaborateur" ){
            session.setAttribute( ATT_SESSION_USER, email );
            response.sendRedirect("/GestionDeProjets/accueilcollaborateur.jsp");}
        } else {
            session.setAttribute( ATT_SESSION_USER, null );
            response.sendRedirect( "Connexion" );
            
        }

        /* Stockage du formulaire et du bean dans l'objet request */
        session.setAttribute( ATT_SESSION_USER, email );
        session.setAttribute( ATT_FORM, type );
        request.setAttribute( ATT_USER, adm );

    }
    	
}