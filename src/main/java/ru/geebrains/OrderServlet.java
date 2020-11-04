package ru.geebrains;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/order")
public class OrderServlet extends HttpServlet {

    private static Logger logger = LoggerFactory.getLogger(OrderServlet.class);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().println("<title>Order Page</title>");
        response.getWriter().println("<h1>This is Order Page</h1>");
        response.getWriter().println("<li><a href='"+request.getContextPath() +"/main'>Main Page</a></li>");
        response.getWriter().println("<li><a href='"+request.getContextPath() +"/catalog'>Catalog Page</a></li>");
        response.getWriter().println("<li><a href='"+request.getContextPath() +"/product'>Product Page</a></li>");
        response.getWriter().println("<li><a href='"+request.getContextPath() +"/cart'>Cart Page</a></li>");
        response.getWriter().println("<li><a href='"+request.getContextPath() +"/order'>Order Page</a></li>");
        response.getWriter().println("</ul>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }


}
