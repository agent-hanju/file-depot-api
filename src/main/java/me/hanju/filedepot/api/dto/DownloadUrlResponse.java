package me.hanju.filedepot.api.dto;

public record DownloadUrlResponse(
    String downloadUrl,
    int expirySeconds) {
}
