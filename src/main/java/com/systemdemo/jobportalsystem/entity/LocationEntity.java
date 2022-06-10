package com.systemdemo.jobportalsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "location")
public class LocationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String tole;

    private Long wardNo;

    private String municipality;

    private String district;

//    @ManyToOne(cascade = CascadeType.ALL)
//    private ApplicantEntity applicantEntity;
//
//    @ManyToOne(cascade = CascadeType.ALL)
//    private CompanyEntity companyEntity;


}
