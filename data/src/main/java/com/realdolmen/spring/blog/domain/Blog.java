package com.realdolmen.spring.blog.domain;

import javax.persistence.Entity;
import java.util.Date;

/**
 * Created by jeansmits on 15/06/15.
 */
@Entity
public class Blog {

    private String title;
    private Date creationDate;

    public Blog(String title, Date creationDate) {
        this.title = title;
        this.creationDate = creationDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
