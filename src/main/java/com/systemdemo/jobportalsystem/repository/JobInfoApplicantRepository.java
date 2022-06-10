package com.systemdemo.jobportalsystem.repository;

import com.systemdemo.jobportalsystem.entity.JobInfoApplicantEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobInfoApplicantRepository extends JpaRepository<JobInfoApplicantEntity, Long> {
}
