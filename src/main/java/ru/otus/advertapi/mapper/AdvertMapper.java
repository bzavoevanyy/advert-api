package ru.otus.advertapi.mapper;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;
import ru.otus.advertapi.dto.AdvertDto;
import ru.otus.advertapi.model.Advert;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface AdvertMapper {
    Advert toEntity(AdvertDto advertDto);

    AdvertDto toDto(Advert advert);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Advert partialUpdate(AdvertDto advertDto, @MappingTarget Advert advert);
}