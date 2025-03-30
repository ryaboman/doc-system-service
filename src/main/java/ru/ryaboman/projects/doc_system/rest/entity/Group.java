package ru.ryaboman.projects.doc_system.rest.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "groups")
public class Group {

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
    @JoinTable(
            name = "users_groups"
            , joinColumns = @JoinColumn(name = "id_group")
            , inverseJoinColumns = @JoinColumn(name = "id_user")
    )
    List<User> userList;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_group")
    private int id;
    @Column(name = "group_name")
    private String name;

    @Column(name = "permission")
    private int permission;

    @Column(name = "description")
    private String description;

    public Group() {}

    public Group(String name, int permission, String description) {
        this.name = name;
        this.permission = permission;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void addUser(User user) {
        if (userList == null) {
            userList = new ArrayList<>();
        }
        userList.add(user);
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", permission=" + permission +
                ", description='" + description + '\'' +
                '}';
    }
}
