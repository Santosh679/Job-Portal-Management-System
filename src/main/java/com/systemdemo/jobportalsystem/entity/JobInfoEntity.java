package com.systemdemo.jobportalsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "job_info")
public class JobInfoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "job_type")
    private String jobType;

    private String description;

    private String salary;

    private String experience;

    @ManyToOne(cascade = CascadeType.ALL)
    private JobCategoryEntity jobCategoryEntity;

}
