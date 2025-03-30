package ru.ryaboman.projects.doc_system.rest.entity;

import jakarta.persistence.*;

@Entity
@Table(name="designators")
public class Designator {

    @Id
    @Column(name = "id_designator")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "id_prefix")
    private Morpheme prefix;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "id_postfix")
    private Morpheme postfix;

    @Column(name="update_method")
    private int updateMethod;

    @Column(name="status_designator")
    private int statusDesignator;

    public Designator() {}

    public Designator(int updateMethod, int statusDesignator) {
        this.updateMethod = updateMethod;
        this.statusDesignator = statusDesignator;
    }

    public int getUpdateMethod() {
        return updateMethod;
    }

    public void setUpdateMethod(int updateMethod) {
        this.updateMethod = updateMethod;
    }

    public int getStatusDesignator() {
        return statusDesignator;
    }

    public void setStatusDesignator(int statusDesignator) {
        this.statusDesignator = statusDesignator;
    }


    public Morpheme getPrefix() {
        return prefix;
    }

    public void setPrefix(Morpheme prefix) {
        this.prefix = prefix;
    }

    public Morpheme getPostfix() {
        return postfix;
    }

    public void setPostfix(Morpheme postfix) {
        this.postfix = postfix;
    }

    @Override
    public String toString() {
        return "Designator{" +
                "prefix=" + prefix +
                ", postfix=" + postfix +
                ", updateMethod=" + updateMethod +
                ", statusDesignator=" + statusDesignator +
                '}';
    }
}
