package com.example.testb;

import BDD.entityBDD.SalleBDD;
import BDD.interfaces.SalleInterface;
import Entity.Salle;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet(name = "ExpositionServlet", value = "/exposition")
public class ExpositionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext sc = getServletContext();
        RequestDispatcher rd = sc.getRequestDispatcher("/exposition.jsp");
        try {
            listAllSalleServlet(request, response);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    private void listAllSalleServlet(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        SalleInterface salleBDD = new SalleBDD();
        ArrayList<Salle> listeSalle = salleBDD.listeAllSalle();
        request.setAttribute("listsalle", listeSalle);
        RequestDispatcher dispatcher = request.getRequestDispatcher("exposition.jsp");
        dispatcher.forward(request, response);
    }
}
