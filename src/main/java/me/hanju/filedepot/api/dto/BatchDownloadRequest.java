package me.hanju.filedepot.api.dto;

import java.util.List;

public record BatchDownloadRequest(
    List<String> ids) {
}
