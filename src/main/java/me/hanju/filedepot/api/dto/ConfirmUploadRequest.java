package me.hanju.filedepot.api.dto;

import jakarta.annotation.Nullable;

/**
 * 업로드 확인 요청
 *
 * @param id       파일 식별자, NotNull / NotBlank / UUID / Trim
 * @param fileName 원본 파일명(null일 시 임의의 uuid 배정), Nullable / NotEmpty /
 *                 MaxLength:255 / Trim
 */
public record ConfirmUploadRequest(
    String id,
    @Nullable String fileName) {
}
