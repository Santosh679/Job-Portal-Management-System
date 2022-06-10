package com.systemdemo.jobportalsystem.repository;

import com.systemdemo.jobportalsystem.entity.JobCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobCategoryRepository extends JpaRepository<JobCategoryEntity, Long> {
}
