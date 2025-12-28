package me.hanju.filedepot.api.dto;

import java.time.Instant;

import jakarta.annotation.Nullable;
import me.hanju.filedepot.api.enums.ProcessingStatus;

/**
 * 저장된 파일 정보
 *
 * @param id               파일 식별자, NotNull / NotBlank / UUID
 * @param fileName         파일명, NotNull / NotBlank / MaxLength:255
 * @param size             파일 크기 (바이트), NotNull / Min:0
 * @param contentType      MIME 타입, NotNull / NotEmpty
 * @param processingStatus 처리 상태, NotNull
 * @param createdAt        생성 시간, NotNull
 * @param content          파싱된 텍스트 (withContent=true일 때만 포함), Nullable /
 *                         AllowEmpty
 */
public record StorageItemDto(
    String id,
    String fileName,
    Long size,
    String contentType,
    ProcessingStatus processingStatus,
    Instant createdAt,
    @Nullable String content) {
}
