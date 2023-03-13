package com.example.testb;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(name = "inscripservlet", value = "/inscripservlet")
public class InscripServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("Inscription.jsp");
        dispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String email = request.getParameter("email");
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String adresse = request.getParameter("adresse");
        String password = request.getParameter("MP");

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:8889/Art?autoReconnect=true&useSSL=false","root","root");
            PreparedStatement preparedStatement = con.prepareStatement("INSERT INTO `users`( `name`, `email`, `prenom`, `adresse`, `password`) " +
                    "VALUES (?,?,?,?,?)");

        }
        catch(Exception e){ System.out.println(e);
        }
    }



}
