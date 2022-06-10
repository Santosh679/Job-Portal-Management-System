package com.systemdemo.jobportalsystem.repository;

import com.systemdemo.jobportalsystem.entity.ApplicantEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicantRepository extends JpaRepository<ApplicantEntity, Long> {
}
