package com.simplilearn.phase1.assessment;

import java.util.Date;
import java.util.UUID;

public class Document {
    private String name;
    private Date createdDate;
    private String id;

    public Document(String name) {
        this.name = name;
        this.createdDate = new Date();
        this.id = UUID.randomUUID().toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
