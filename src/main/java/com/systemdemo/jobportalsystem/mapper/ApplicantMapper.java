package com.systemdemo.jobportalsystem.mapper;

import com.systemdemo.jobportalsystem.dto.ApplicantDto;
import com.systemdemo.jobportalsystem.entity.ApplicantEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

@Configurable
public class ApplicantMapper extends GenericMapperImpl<ApplicantEntity, ApplicantDto>{
    private ModelMapper modelMapper;

    @Autowired
    public ApplicantMapper(ModelMapper modelMapper) {
        super(modelMapper, ApplicantEntity.class, ApplicantDto.class);
    }
}
