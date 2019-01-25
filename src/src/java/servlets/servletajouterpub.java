/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import form.modifieragendaform;
import form.modifierpublicationform;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static servlets.servletagenda.VU;
import static servlets.servletagenda.VUE;


public class servletajouterpub extends HttpServlet {
    public static final String VU              = "/WEB-INF/actualite.jsp";
    public static final String VUE              = "publication";
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher(VU).forward( request, response );
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        modifierpublicationform agenda= new modifierpublicationform();
        agenda.ajouter(request);
        response.sendRedirect( VUE );
        
    }
}
