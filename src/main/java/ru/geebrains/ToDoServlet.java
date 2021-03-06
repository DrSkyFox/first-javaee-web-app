package ru.geebrains;




import ru.geebrains.database_demo.ToDoRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = {"", "/"})
public class ToDoServlet extends HttpServlet {

    private ToDoRepository toDoRepository;

    @Override
    public void init() throws ServletException {
        toDoRepository = (ToDoRepository) getServletContext().getAttribute("todoRepository");
        if (toDoRepository == null) {
            throw new ServletException("ToDo repository not initialized");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}