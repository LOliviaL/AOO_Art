package com.example.testb;

import BDD.ArtisteBDD;
import Entity.Artiste;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(name = "inscription", urlPatterns = "/ins")
public class InscripServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("Inscription.jsp");
        dispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        try {
            insertArtisteServlet(request, response);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    private void insertArtisteServlet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String photo = request.getParameter("photo");
        String dateNaiss = request.getParameter("dateNaiss");
        String password = request.getParameter("password");

        Artiste newArtiste = new Artiste(name, surname, photo, Date.valueOf(dateNaiss), password);

        ArtisteBDD artisteBDD = new ArtisteBDD();
        artisteBDD.insertArtiste(newArtiste);

        response.sendRedirect("Login.jsp");


    }

}
