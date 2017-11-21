package com.naradevi.attendancemanager.domain;

import java.util.Date;

/**
 * Created by raunakshakya on 11/21/2017.
 */

public class Record {

    private int id;
    private Student student;
    private Class Class_;
    private Date date;
    private Boolean isPresent;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Class getClass_() {
        return Class_;
    }

    public void setClass_(Class class_) {
        Class_ = class_;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Boolean getPresent() {
        return isPresent;
    }

    public void setPresent(Boolean present) {
        isPresent = present;
    }

}
