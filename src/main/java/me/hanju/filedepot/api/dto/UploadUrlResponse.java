package me.hanju.filedepot.api.dto;

/**
 * 업로드 URL 응답
 *
 * @param id            업로드 세션 식별자, NotNull / NotBlank / UUID
 * @param uploadUrl     사전 서명된 업로드 URL, NotNull / NotBlank
 * @param expirySeconds URL 만료 시간 (초), Min:1
 */
public record UploadUrlResponse(
    String id,
    String uploadUrl,
    int expirySeconds) {
}
