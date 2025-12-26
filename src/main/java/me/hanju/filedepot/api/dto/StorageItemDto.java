package me.hanju.filedepot.api.dto;

import java.time.Instant;

import me.hanju.filedepot.api.enums.ProcessingStatus;

public record StorageItemDto(
    String id,
    Long size,
    String contentType,
    ProcessingStatus processingStatus,
    Instant createdAt) {
}
