package com.example.louis.application;


public class Todo {
    public String name, desc, priority;

    public Todo(String name, String desc, String priority) {
        this.name = name;
        this.desc = desc;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}
