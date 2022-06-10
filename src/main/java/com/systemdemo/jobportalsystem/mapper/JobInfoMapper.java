package com.systemdemo.jobportalsystem.mapper;

import com.systemdemo.jobportalsystem.dto.JobInfoDto;
import com.systemdemo.jobportalsystem.entity.JobInfoEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

@Configurable
public class JobInfoMapper extends GenericMapperImpl<JobInfoEntity, JobInfoDto> {

    private ModelMapper modelMapper;

    @Autowired
    public JobInfoMapper(ModelMapper modelMapper) {
        super(modelMapper, JobInfoEntity.class, JobInfoDto.class);
    }
}
