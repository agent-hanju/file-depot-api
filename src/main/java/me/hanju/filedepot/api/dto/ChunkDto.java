package me.hanju.filedepot.api.dto;

import java.util.List;

import jakarta.annotation.Nullable;

/**
 * 청크 정보
 *
 * @param id        청크 식별자, NotNull / NotBlank
 * @param index     청크 순서, Min:0
 * @param content   청크 텍스트, NotNull / NotBlank
 * @param embedding 임베딩 벡터(withEmbedding=true일 때만 포함), List: Nullable /
 *                  NotEmpty, Float: NotNull
 */
public record ChunkDto(
    String id,
    int index,
    String content,
    @Nullable List<Float> embedding) {
}
