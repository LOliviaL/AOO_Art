package com.example.testb;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "paiementservlet", value = "/pavement")
public class PaiementServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nom = request.getParameter("nom");
        String numero = request.getParameter("numero");
        String date = request.getParameter("date");
        String cvv = request.getParameter("cvv");

        // Vérifier que tous les champs ont été remplis
        if (nom != null && !nom.isEmpty() && numero != null && !numero.isEmpty() && date != null && !date.isEmpty() && cvv != null && !cvv.isEmpty()) {
            // TODO : Vérifier les informations de paiement
            // Si les informations sont valides, rediriger vers la page de confirmation
            response.sendRedirect("confirmation.jsp");
        } else {
            // Si tous les champs ne sont pas remplis, afficher un message d'erreur
            request.setAttribute("message", "Tous les champs sont obligatoires");
            request.getRequestDispatcher("paiement.jsp").forward(request, response);
        }
    }
}
