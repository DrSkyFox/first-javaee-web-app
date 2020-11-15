package ru.geebrains.database_demo;

import java.time.LocalDate;

public class ToDo {

    private Integer id;

    private String description;

    private LocalDate targetDate;

    public ToDo() {
    }

    public ToDo(Integer id, String description, LocalDate targetDate) {
        this.id = id;
        this.description = description;
        this.targetDate = targetDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }
}
