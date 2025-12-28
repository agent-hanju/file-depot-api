package me.hanju.filedepot.api.dto;

import java.util.List;

/**
 * 일괄 다운로드 요청
 *
 * @param ids 파일 식별자 목록, List: NotEmpty, String: NotNull / NotBlank / UUID
 */
public record BatchDownloadRequest(
    List<String> ids) {
}
