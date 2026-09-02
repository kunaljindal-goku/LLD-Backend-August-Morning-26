package model;

import java.util.Date;

public class BaseEntity {

    private Integer id;
    private Date createdAt;
    private Date updatedAt;

    // private String createdBy;
    // private String updatedBy;


    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
