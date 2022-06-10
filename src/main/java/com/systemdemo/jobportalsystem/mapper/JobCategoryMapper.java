package com.systemdemo.jobportalsystem.mapper;

import com.systemdemo.jobportalsystem.dto.JobCategoryDto;
import com.systemdemo.jobportalsystem.entity.JobCategoryEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

@Configurable
public class JobCategoryMapper extends GenericMapperImpl<JobCategoryEntity, JobCategoryDto> {

    private ModelMapper modelMapper;

    @Autowired
    public JobCategoryMapper(ModelMapper modelMapper) {
        super(modelMapper, JobCategoryEntity.class, JobCategoryDto.class);
    }
}
