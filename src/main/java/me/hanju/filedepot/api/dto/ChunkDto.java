package me.hanju.filedepot.api.dto;

import java.util.List;

import jakarta.annotation.Nullable;

public record ChunkDto(
    String id,
    int index,
    String content,
    @Nullable List<Float> embedding) {
}
