package ru.otus.advertapi.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.UUID;

/**
 * DTO for {@link ru.otus.advertapi.model.Advert}
 */
public record AdvertDto(UUID id, String header, String content, String userName, String phoneNumber,
                        Instant createdDate, Instant lastModifiedDate) implements Serializable {
}