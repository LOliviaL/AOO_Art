package com.example.testb;

import BDD.entityBDD.ArtisteBDD;
import BDD.interfaces.ArtisteInterface;
import BDD.repository.InscriptionObjet;
import Entity.Artiste;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;

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
        String[] checkArtiste = new String[6];

        checkArtiste[0] = request.getParameter("pseudo");
        checkArtiste[1] = request.getParameter("name");
        checkArtiste[2] = request.getParameter("surname");
        checkArtiste[3] = request.getParameter("photo");
        checkArtiste[4] = request.getParameter("dateNaiss");
        checkArtiste[5] = request.getParameter("password");

        ArtisteInterface artisteInterface = new ArtisteBDD();
        InscriptionObjet inscriptionObjet = new InscriptionObjet(checkArtiste, artisteInterface);
        inscriptionObjet.createCompte();

        response.sendRedirect("Login.jsp");


    }

}
