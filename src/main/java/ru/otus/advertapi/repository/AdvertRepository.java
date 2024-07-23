package ru.otus.advertapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.otus.advertapi.model.Advert;

import java.util.UUID;

public interface AdvertRepository extends JpaRepository<Advert, UUID> {
}