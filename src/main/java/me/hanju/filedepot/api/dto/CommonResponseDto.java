package me.hanju.filedepot.api.dto;

public record CommonResponseDto<T>(
    boolean success,
    T data,
    String message) {

  public static <T> CommonResponseDto<T> success(T data) {
    return new CommonResponseDto<>(true, data, null);
  }

  public static <T> CommonResponseDto<T> error(String message) {
    return new CommonResponseDto<>(false, null, message);
  }

  public static <T> CommonResponseDto<T> error(String message, T data) {
    return new CommonResponseDto<>(false, data, message);
  }
}
