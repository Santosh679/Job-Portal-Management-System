package com.systemdemo.jobportalsystem.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class GenericMapperImpl<T, DTO> implements IGenericMapper<T, DTO>{
    private ModelMapper modelMapper;
    private Class<T> entityType;
    private Class<DTO> dtoType;

    @Autowired
    public GenericMapperImpl(ModelMapper modelMapper, Class<T> entityType, Class<DTO> dtoType) {
        this.modelMapper = modelMapper;
        this.entityType = entityType;
        this.dtoType = dtoType;
    }

    @Override
    public T mapToEntity(DTO dto) {
        return modelMapper.map(dto, entityType);
    }

    @Override
    public DTO mapToDto(T entity) {
        return modelMapper.map(entity, dtoType);
    }

    @Override
    public List<T> mapToEntityList(List<DTO> dtos) {
//        return dtos.stream().map(dto -> modelMapper.map(dto, entityType)).collect(Collectors.toList());
        return dtos.stream().map(dto -> mapToEntity(dto)).collect(Collectors.toList());
    }

    @Override
    public List<DTO> mapToDtoList(List<T> entityList) {
        return entityList.stream().map(entity -> mapToDto(entity)).collect(Collectors.toList());
    }
}
