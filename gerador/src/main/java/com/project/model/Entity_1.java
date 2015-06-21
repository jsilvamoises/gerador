package com.project.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Entity_1 implements Serializable {

    @Id
    private Long id1;

    public Entity_1() {

    }
   
    public Long getId1() {
        return this.id1;
    }

    public void setId1(Long id1) {
        this.id1 = id1;
    }
}
