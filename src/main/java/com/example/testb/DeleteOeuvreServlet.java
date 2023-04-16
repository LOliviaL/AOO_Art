package com.example.testb;

import BDD.entityBDD.OeuvreBDD;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "deletpeinture", value = "/deleto")
public class DeleteOeuvreServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String nom = request.getParameter("name");
            OeuvreBDD oeuvreBDD =new OeuvreBDD();
            oeuvreBDD.deleteOeuvre(nom);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        response.sendRedirect("MesOeuvre.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
