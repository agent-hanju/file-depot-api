package me.hanju.filedepot.api.dto;

public record UploadUrlResponse(
    String id,
    String uploadUrl,
    int expirySeconds) {
}
