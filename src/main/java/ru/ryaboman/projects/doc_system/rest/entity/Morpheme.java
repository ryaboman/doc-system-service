package ru.ryaboman.projects.doc_system.rest.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;

@Entity
@Table(name="morphemes")
public class Morpheme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_morpheme")
    private int id;

    @Column(name="name_morpheme")
    private String name;

    @Column(name="permission")
    private int permission;

    @Column(name="last_update")
    @UpdateTimestamp
    private Timestamp lastUpdate;

    public Morpheme() {}

    public Morpheme(String name, int permission, Timestamp lastUpdate) {
        this.name = name;
        this.permission = permission;
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        return "Morpheme{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", permission=" + permission +
                ", lastUpdate=" + lastUpdate +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPermission() {
        return permission;
    }

    public void setPermission(int permission) {
        this.permission = permission;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
