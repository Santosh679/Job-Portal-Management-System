package com.systemdemo.jobportalsystem.mapper;

import com.systemdemo.jobportalsystem.dto.LocationDto;
import com.systemdemo.jobportalsystem.entity.LocationEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

@Configurable
public class LocationMapper extends GenericMapperImpl<LocationEntity, LocationDto> {

    private ModelMapper modelMapper;

    @Autowired
    public LocationMapper (ModelMapper modelMapper) {
        super(modelMapper, LocationEntity.class, LocationDto.class);
    }
}
