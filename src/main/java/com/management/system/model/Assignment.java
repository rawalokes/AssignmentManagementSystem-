package com.management.system.model;

import javax.persistence.*;

@NamedQueries({
        @NamedQuery(
                name="findusingid",
                query="FROM Assignment a where id=:id"
        ),
        @NamedQuery(
                name="DeleteusingId",
                query="FROM Assignment a where a.id=:id"
        ),

})
@Entity
public class Assignment {
    @Id
    @GeneratedValue
    private int no;
    private String  name;
    private String date;
    private String expDate;
    private  String file;

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getExpDate() {
        return expDate;
    }
    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }



}