package com.systemdemo.jobportalsystem.repository;

import com.systemdemo.jobportalsystem.entity.JobInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobInfoRepository extends JpaRepository<JobInfoEntity, Long> {
}
