package com.realdolmen.spring.blog.domain;

import javax.persistence.Entity;
import java.util.Date;

/**
 * Created by jeansmits on 15/06/15.
 */
@Entity
public class Comment {

    private String content;
    private Date creationDate;
    private String authorName;

    public Comment(String content, Date creationDate, String authorName) {
        this.content = content;
        this.creationDate = creationDate;
        this.authorName = authorName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
