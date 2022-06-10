package com.systemdemo.jobportalsystem.mapper;

import java.util.List;

public interface IGenericMapper<T, DTO> {
    T mapToEntity(DTO dto);

    DTO mapToDto(T entity);

    List<T> mapToEntityList(List<DTO> dtoList);

    List<DTO> mapToDtoList(List<T> entityList);
}
