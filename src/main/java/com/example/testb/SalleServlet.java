package com.example.testb;

import BDD.entityBDD.OeuvreBDD;
import BDD.interfaces.OeuvreInterface;
import BDD.repository.OeuvreObjet;
import Entity.Oeuvre;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet(name = "Salle1Servlet", value = "/salle")
public class SalleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext sc = getServletContext();
        RequestDispatcher rd = sc.getRequestDispatcher("/salle.jsp");
        try {
            listAllOeuvreServlet(request, response);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    private void listAllOeuvreServlet(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        OeuvreInterface oeuvreBDD = new OeuvreBDD();
        ArrayList<Oeuvre> listeOeuvre = oeuvreBDD.listeAllOeuvre();
        request.setAttribute("listoeuvre", listeOeuvre);
        RequestDispatcher dispatcher = request.getRequestDispatcher("salle.jsp");
        dispatcher.forward(request, response);
    }
}
