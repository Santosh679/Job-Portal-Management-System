package com.systemdemo.jobportalsystem.mapper;

import com.systemdemo.jobportalsystem.dto.JobInfoApplicantDto;
import com.systemdemo.jobportalsystem.entity.JobInfoApplicantEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

@Configurable
public class JobInfoApplicantMapper extends GenericMapperImpl<JobInfoApplicantEntity, JobInfoApplicantDto> {

    private ModelMapper modelMapper;

    @Autowired
    public JobInfoApplicantMapper(ModelMapper modelMapper) {
            super(modelMapper, JobInfoApplicantEntity .class, JobInfoApplicantDto .class);
    }
}
