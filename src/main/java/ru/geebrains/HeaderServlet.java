package ru.geebrains;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/page_header")
public class HeaderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<ling rel='stylesheet' href ='"+ req.getContextPath()+ "/style.css'>");

        String header = (String) req.getAttribute("header");
        getServletContext().getRequestDispatcher("/WEB-INF/menu.jsp").include(req,resp);

    }
}
