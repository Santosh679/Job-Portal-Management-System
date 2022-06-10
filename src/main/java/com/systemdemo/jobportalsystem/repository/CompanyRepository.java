package com.systemdemo.jobportalsystem.repository;

import com.systemdemo.jobportalsystem.entity.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<CompanyEntity, Long> {
}
