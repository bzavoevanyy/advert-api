package ru.otus.advertapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.otus.advertapi.dto.AdvertDto;
import ru.otus.advertapi.mapper.AdvertMapper;
import ru.otus.advertapi.repository.AdvertRepository;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * @author Bogdan Zavoevanyi
 */
@Service
@RequiredArgsConstructor
public class AdvertService {

    private final AdvertRepository advertRepository;
    private final AdvertMapper advertMapper;


    @Transactional(readOnly = true)
    public List<AdvertDto> getAll() {
        return advertRepository.findAll().stream().map(advertMapper::toDto).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public AdvertDto getById(UUID id) {
        return advertRepository.findById(id).map(advertMapper::toDto).orElseThrow();
    }

    @Transactional
    public void create(AdvertDto advertDto) {
        advertRepository.save(advertMapper.toEntity(advertDto));
    }

    @Transactional
    public void update(UUID id, AdvertDto advertDto) {
        final var advert = advertRepository.findById(id).orElseThrow();
        advertRepository.save(advertMapper.partialUpdate(advertDto, advert));
    }

    @Transactional
    public void delete(UUID id) {
        final var advert = advertRepository.findById(id).orElseThrow();
        advertRepository.delete(advert);
    }
}
