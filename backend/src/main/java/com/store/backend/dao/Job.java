package com.store.backend.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "jobs")
@Data
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String title;
    @Column
    private String description;
    @Column
    private String company;
    @Column
    private String location;
    @Column
    private Double salaryFrom;
    @Column
    private Double salaryTo;
    @Column
    private String employmentType;
    @Column
    private String contact;
    @Column
    private String jobCategory;
    @Column
    private Boolean isRemote;
    @Column
    private Integer numberOfOpenings;

    @ManyToMany
    @JoinTable(
            name = "jobs_qualification",
            joinColumns = @JoinColumn(name = "job_id"),
            inverseJoinColumns = @JoinColumn(name = "qualification_id")
    )
    private List<Qualification> qualifications;

    @Column
    private Long applicationDeadline;
    @Column
    private Long createdAt;
    @Column
    private Long updatedAt;

}
