package com.example.testb;

import BDD.entityBDD.OeuvreBDD;
import Entity.Oeuvre;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;

@WebServlet(name = "insepeinture", urlPatterns = "/ipein")
public class InsertOeuvreServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("MesOeuvre.jsp");
        dispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        try {
            insertOeuvreServlet(request, response);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void insertOeuvreServlet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        PrintWriter out=response.getWriter();
        String name = request.getParameter("name");
        String photo = request.getParameter("photo");
        String estimationPrice = request.getParameter("estimationPrice");
        String description = request.getParameter("description");
        String dateCreation = request.getParameter("dateCreation");
        String nameArtiste = null;

        Oeuvre newpeintur= new Oeuvre(name, photo,description, Float.parseFloat(estimationPrice), Date.valueOf(dateCreation), nameArtiste);
        OeuvreBDD oeuvreBDD =new OeuvreBDD();
        boolean status = oeuvreBDD.insertOeuvre(newpeintur);

        if(status){
            out.print("<p>Record saved successfully!</p>");
            request.getRequestDispatcher("MesOeuvre.jsp").include(request, response);
        }else{
            out.println("Sorry! unable to save record");
        }


    }

}
