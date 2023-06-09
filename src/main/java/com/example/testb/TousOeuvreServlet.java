package com.example.testb;

import BDD.entityBDD.ArtisteBDD;
import BDD.entityBDD.OeuvreBDD;
import BDD.interfaces.ArtisteInterface;
import BDD.interfaces.OeuvreInterface;
import Entity.Artiste;
import Entity.Oeuvre;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "outmanoeuvre", value = "/oeuvre")
public class TousOeuvreServlet extends HttpServlet {

    public void init() {

    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext sc = getServletContext();
        RequestDispatcher rd = sc.getRequestDispatcher("/AllOeuvres.jsp");
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
        OeuvreInterface oeuvreInterface = new OeuvreBDD();
        ArrayList<Oeuvre> listeOeuvre = oeuvreInterface.listeAllOeuvre();
        request.setAttribute("listoeuvre", listeOeuvre);
        RequestDispatcher dispatcher = request.getRequestDispatcher("AllOeuvres.jsp");
        dispatcher.forward(request, response);
    }


}
