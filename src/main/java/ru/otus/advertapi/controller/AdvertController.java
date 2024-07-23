package ru.otus.advertapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.otus.advertapi.dto.AdvertDto;
import ru.otus.advertapi.service.AdvertService;

import java.util.List;
import java.util.UUID;

/**
 * @author Bogdan Zavoevanyi
 */
@RestController
@RequestMapping("/api/v1/advert")
@RequiredArgsConstructor
public class AdvertController {

    private final AdvertService advertService;

    @GetMapping
    public List<AdvertDto> getAll() {
        return advertService.getAll();
    }

    @GetMapping("/{id}")
    public AdvertDto getById(@PathVariable(name = "id") UUID id) {
        return advertService.getById(id);
    }

    @PostMapping
    public void create(@RequestBody AdvertDto advertDto) {
        advertService.create(advertDto);
    }

    @PatchMapping("/{id}")
    public void update(@PathVariable(name = "id") UUID id, @RequestBody AdvertDto advertDto) {
        advertService.update(id, advertDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable(name = "id") UUID id) {
        advertService.delete(id);
    }
}
