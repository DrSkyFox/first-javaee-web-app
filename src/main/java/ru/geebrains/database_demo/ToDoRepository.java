package ru.geebrains.database_demo;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ToDoRepository {

    private ArrayList<ToDo> toDos;
//    Long id, String description, LocalDate targetDate)

    public ToDoRepository()  {
        init();
    }

    private void init() {

        toDos = new ArrayList<>();
        toDos.add(new ToDo(1, "Item 1", LocalDate.now()));
        toDos.add(new ToDo(2, "Item 2", LocalDate.now()));
        toDos.add(new ToDo(3, "Item 3", LocalDate.now()));
        toDos.add(new ToDo(4, "Item 4", LocalDate.now()));
        toDos.add(new ToDo(5, "Item 5", LocalDate.now()));
        toDos.add(new ToDo(6, "Item 6", LocalDate.now()));
        toDos.add(new ToDo(7, "Item 7", LocalDate.now()));
        toDos.add(new ToDo(8, "Item 8", LocalDate.now()));
        toDos.add(new ToDo(9, "Item 9", LocalDate.now()));
    }

    public void insert(ToDo toDo) {
        toDos.add(toDo);
    }

    public void update(ToDo toDo) throws SQLException {
        if(toDo ==null) {
            return;
        }
        int id  = toDo.getId();
        toDos.get(id).setDescription(toDo.getDescription());
        toDos.get(id).setTargetDate(toDo.getTargetDate());
    }

    public void delete(long id) {
        toDos.remove(id);
    }

    public ToDo findById(Integer id) throws SQLException {

        if(toDos.get(id) != null) {
            return toDos.get(id);
        }
        else return new ToDo(-1, "null", LocalDate.now());
    }

    public List<ToDo> findAll() {
        return toDos;
    }


}