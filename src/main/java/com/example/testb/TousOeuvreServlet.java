package com.example.testb;

import BDD.entityBDD.PeintureBDD;
import Entity.Peinture;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet(name = "tousoeuvre", value = "/oeuvre")
public class TousOeuvreServlet extends HttpServlet {

    private PeintureBDD peintureBDD;

    public void init() {
        peintureBDD = new PeintureBDD();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext sc = getServletContext();
        RequestDispatcher rd = sc.getRequestDispatcher("/AllOeuvres.jsp");
        try {
            listAllPeintureServlet(request, response);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        rd.forward(request, response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    private void listAllPeintureServlet(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        ArrayList<Peinture> listePeinture = peintureBDD.listeAllPeinture();
        request.setAttribute("listoeuvre", listePeinture);
        RequestDispatcher dispatcher = request.getRequestDispatcher("AllOeuvres.jsp");
        dispatcher.forward(request, response);
    }

}
