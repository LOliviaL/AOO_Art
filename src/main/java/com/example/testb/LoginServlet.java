package com.example.testb;

import BDD.entityBDD.ArtisteBDD;
import Entity.Artiste;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet(name = "login", urlPatterns = "/log")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("Login.jsp");
        dispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        try {
            findArtisteServlet(request, response);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    private void findArtisteServlet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {

        String pseudo = request.getParameter("pseudo");
        String password = request.getParameter("password");

        ArtisteBDD artisteBDD = new ArtisteBDD();
        ArrayList<Artiste> listeArtiste = artisteBDD.listeAllArtistes();
        for (Artiste artiste : listeArtiste){
            if (artiste.getPseudo()==pseudo || artiste.getPassword()==password){
                artisteBDD.findArtiste(artiste);
                request.setAttribute("artist", artiste);
            }
            else {
                System.out.println("Check your login or Password, Please!");
            }
        }
        response.sendRedirect("Homepage.jsp");

    }


}
