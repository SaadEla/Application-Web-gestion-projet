/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import bean.agendabean;
import form.modifieragendaform;
import form.modifiercollabform;
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
import static servlets.servletconnexion.VU;
import static servlets.servletconnexion.VUE;

public class servlettachecolabajouter extends HttpServlet {
    public static final String VU              = "/WEB-INF/ajoutercollab.jsp";
    public static final String VUE              = "tachecolabajouter";
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher(VU).forward( request, response );
        
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        modifiercollabform agenda= new modifiercollabform();
        agenda.ajouter(request);
        response.sendRedirect( VUE );
    }



}
