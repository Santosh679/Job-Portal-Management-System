package com.systemdemo.jobportalsystem.dto;

import com.systemdemo.jobportalsystem.entity.ApplicantEntity;
import com.systemdemo.jobportalsystem.entity.JobInfoEntity;

import javax.persistence.ManyToOne;

public class JobInfoApplicantDto {

    private Long id;

    private Long jobInfoId;

    private Long applicantId;
}
