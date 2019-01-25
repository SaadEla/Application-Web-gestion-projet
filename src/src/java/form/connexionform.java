package form;

import java.sql.Connection;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;

import bean.administrateurbean;

public class connexionform {
    public administrateurbean connecterUtilisateur( HttpServletRequest request ) {
        /* Récupération des champs du formulaire */
    	String email = request.getParameter( "email" );
    	String password = request.getParameter( "password" );
    	administrateurbean adm=new administrateurbean();
        adm.setMotDePasse(password);
        adm.setEmail(email);


        return adm;
    	
    }	
    	

}
