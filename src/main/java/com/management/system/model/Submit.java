package com.management.system.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Submit {
    @Id
    @GeneratedValue
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Assignment getNo() {
        return no;
    }

    public void setNo(Assignment no) {
        this.no = no;
    }

    public Student getStdid() {
        return stdid;
    }

    public void setStdid(Student stdid) {
        this.stdid = stdid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @OneToOne
    private Assignment no;
    @OneToOne
    private Student stdid;
    private String date;
}
