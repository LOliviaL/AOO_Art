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

@WebServlet(name = "editpeinture", value = "/edito")
public class EditOeuvreServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        try {
            updateOeuvreServlet(request, response);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    private void updateOeuvreServlet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        PrintWriter out=response.getWriter();
        String name = request.getParameter("name");
        String photo = request.getParameter("photo");
        String estimationPrice = request.getParameter("estimationPrice");
        String description = request.getParameter("description");
        String dateCreation = request.getParameter("dateCreation");
        String nameArtiste = null;

        Oeuvre newpeintur= new Oeuvre(name, photo,description, Float.parseFloat(estimationPrice), Date.valueOf(dateCreation), nameArtiste);
        OeuvreBDD oeuvreBDD =new OeuvreBDD();
        boolean status = oeuvreBDD.updateOeuvre(newpeintur);

        if(status){
            out.print("<p>Record saved successfully!</p>");
            response.sendRedirect("MesOeuvre.jsp");

        }else{
            out.println("Sorry! unable to save record");
        }


    }

}
