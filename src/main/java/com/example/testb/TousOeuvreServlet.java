package com.example.testb;

import BDD.PeintureBDD;
import Entity.Peinture;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet(name = "tousoeuvre", value = "/toeuvre")
public class TousOeuvreServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        try {
            PeintureBDD peintureBDD =new PeintureBDD();
            ArrayList<Peinture> listePeinture = peintureBDD.listeAllPeinture();
            request.setAttribute("oeuvre_list", listePeinture);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("AllOeuvres.jsp");
            requestDispatcher.forward(request, response);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

    }

}
