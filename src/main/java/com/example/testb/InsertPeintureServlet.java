package com.example.testb;

import BDD.PeintureBDD;
import Entity.Peinture;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;

@WebServlet(name = "insepeinture", urlPatterns = "/ipein")
public class InsertPeintureServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("MesOeuvre.jsp");
        dispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        try {
            insertPeintureServlet(request, response);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void insertPeintureServlet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        String name = request.getParameter("name");
        String photo = request.getParameter("photo");
        String estimationPrice = request.getParameter("estimationPrice");
        String description = request.getParameter("description");
        String dateCreation = request.getParameter("dateCreation");
        String nameArtiste = null;

        Peinture newpeintur= new Peinture(name, photo,description, Float.parseFloat(estimationPrice), Date.valueOf(dateCreation), nameArtiste);
        PeintureBDD peintureBDD =new PeintureBDD();
        peintureBDD.insertPeinture(newpeintur);

        response.sendRedirect("MesOeuvre.jsp");

    }

}
