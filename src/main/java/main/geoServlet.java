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
@WebServlet(name = "geoServlet", urlPatterns = {"/geoServlet"})
public class geoServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet geoServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet geoServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/view/geo.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String geo = request.getParameter("geometry");
        switch (geo) {
            case "circle": {
                request.setAttribute("imageSrc", "https://globalsymbols.com/uploads/production/image/imagefile/6977/14_6977_9bf09443-0b42-46d0-94f9-062d9eb94e1e.svg");
                request.setAttribute("description", "Circle");
                break;
            }
            case "square": {
                request.setAttribute("imageSrc", "https://d138zd1ktt9iqe.cloudfront.net/media/seo_landing_files/shape-of-square-1612779244.png");
                request.setAttribute("description", "Square");
                break;
            }
            case "triangle": {
                request.setAttribute("imageSrc", "https://d138zd1ktt9iqe.cloudfront.net/media/seo_landing_files/triangle-pqr-with-angles-sides-vertex-1620368538.png");
                request.setAttribute("description", "Triangle");
                break;
            }
            case "rectangle": {
                request.setAttribute("imageSrc", "https://d138zd1ktt9iqe.cloudfront.net/media/seo_landing_files/shape-of-rectangle-1612270511.png");
                request.setAttribute("description", "Rectangle");
                break;
            }
        }
        request.getRequestDispatcher("/view/pictureGeo.jsp").forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
