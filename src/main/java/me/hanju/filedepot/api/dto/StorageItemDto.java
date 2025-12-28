package me.hanju.filedepot.api.dto;

import java.time.Instant;

import jakarta.annotation.Nullable;
import me.hanju.filedepot.api.enums.ProcessingStatus;

public record StorageItemDto(
    String id,
    String fileName,
    Long size,
    String contentType,
    ProcessingStatus processingStatus,
    Instant createdAt,
    @Nullable String content) {
}
