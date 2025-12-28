package me.hanju.filedepot.api.dto;

/**
 * 다운로드 URL 응답
 *
 * @param downloadUrl   사전 서명된 다운로드 URL, NotNull / NotBlank
 * @param expirySeconds URL 만료 시간 (초), Min:1
 */
public record DownloadUrlResponse(
    String downloadUrl,
    int expirySeconds) {
}
