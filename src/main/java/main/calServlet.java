/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package main;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author bong
 */
@WebServlet(name = "calServlet", urlPatterns = {"/calServlet"})
public class calServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet calServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet calServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/view/cal.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String f = request.getParameter("first");
        String s = request.getParameter("second");
        double first = Double.parseDouble(f);
        double second = Double.parseDouble(s);
        String operator = request.getParameter("operator");
        String result;

        if (f.isEmpty() || s.isEmpty()) {
            request.setAttribute("message", "Please fill in first and second number");
        } else {
            switch (operator) {
                case "+":{
                    request.setAttribute("result", first + second);
                    break;}
                case "-":{
                    request.setAttribute("result", first - second);
                    break;}
                case "*":{
                    request.setAttribute("result", first * second);
                    break;}
                case "/":{
                    if (second != 0) {
                        result = String.valueOf(first / second);
                    } else {
                        request.setAttribute("message","Error: Division by zero!");
                    }
                    break;}
            }
            request.setAttribute("first", f);
            request.setAttribute("second", s);
            request.setAttribute("operator", operator);
            request.getRequestDispatcher("/view/cal.jsp").forward(request, response);

        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
