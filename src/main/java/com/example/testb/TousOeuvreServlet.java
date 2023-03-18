package com.example.testb;

import BDD.PeintureBDD;
import Entity.Peinture;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet(name = "tousoeuvre", value = "/toeuvre")
public class TousOeuvreServlet extends HttpServlet {

    private PeintureBDD peintureBDD;

    public void init() {
        peintureBDD = new PeintureBDD();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        try {
            listAllPeintureServlet(request, response);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

    }
    private void listAllPeintureServlet(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        ArrayList<Peinture> listePeinture = peintureBDD.listeAllPeinture();
        request.setAttribute("listoeuvre", listePeinture);
        RequestDispatcher dispatcher = request.getRequestDispatcher("AllOeuvres.jsp");
        dispatcher.forward(request, response);
    }

}
