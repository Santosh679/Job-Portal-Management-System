package com.systemdemo.jobportalsystem.mapper;

import com.systemdemo.jobportalsystem.dto.ApplicantDto;
import com.systemdemo.jobportalsystem.dto.CompanyDto;
import com.systemdemo.jobportalsystem.entity.ApplicantEntity;
import com.systemdemo.jobportalsystem.entity.CompanyEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

@Configurable
public class CompanyMapper extends GenericMapperImpl<CompanyEntity, CompanyDto>{
    private ModelMapper modelMapper;

    @Autowired
    public CompanyMapper(ModelMapper modelMapper) {
        super(modelMapper, CompanyEntity.class, CompanyDto.class);
    }
}
