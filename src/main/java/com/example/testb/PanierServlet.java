package com.example.testb;

import BDD.entityBDD.OeuvreBDD;
import BDD.interfaces.OeuvreInterface;
import Entity.Panier;
import Entity.Oeuvre;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "PanierServlet", value = "/panier")
public class PanierServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        OeuvreInterface oeuvreInterface = new OeuvreBDD();
        Panier panier = (Panier) session.getAttribute("panier");

        if (panier == null) {
            panier = new Panier();
            session.setAttribute("panier", panier);
        }

        String action = request.getParameter("action");

        if (action != null) {
            switch (action) {
                case "ajouter":
                    String namePeinture = request.getParameter("namePeinture");
                    Oeuvre oeuvre = oeuvreInterface.getOeuvreByName(namePeinture);
                    panier.ajouterOeuvre(oeuvre);
                    break;
                case "supprimer":
                    String peintureSupprimer = request.getParameter("namePeinture");
                    Oeuvre oeuvreASupprimer = oeuvreInterface.getOeuvreByName(peintureSupprimer);
                    panier.supprimerOeuvre(oeuvreASupprimer);
                    break;
                case "vider":
                    panier.vider();
                    break;
            }
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher("panier.jsp");
        dispatcher.forward(request, response);
    }

}
