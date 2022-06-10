package com.systemdemo.jobportalsystem.dto;

import com.systemdemo.jobportalsystem.entity.LocationEntity;

import javax.persistence.Column;
import javax.persistence.ManyToOne;

public class CompanyDto {

    private Long id;

    private String name;

    private String phoneNo;

    private String email;

    private String website;

    private Long locationId;
}
