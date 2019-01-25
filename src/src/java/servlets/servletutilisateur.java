/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import form.modifierutilisateurform;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static servlets.servletagenda.VU;


public class servletutilisateur extends HttpServlet {
    public static final String VU              = "/WEB-INF/utilisateur.jsp";
    public static final String VUE              = "utilisateur";
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                this.getServletContext().getRequestDispatcher(VU).forward( request, response );
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        modifierutilisateurform agenda= new modifierutilisateurform();
        String form=request.getParameter("formulaire");
        if(form.equals("formChef")){
        agenda.modifierChef(request);
        }
        else{agenda.modifierColl(request);}
        response.sendRedirect( VUE );
    }


}
