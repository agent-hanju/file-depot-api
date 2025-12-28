package me.hanju.filedepot.api.dto;

import jakarta.annotation.Nullable;

/**
 * 공통 API 응답 래퍼.
 *
 * @param success 성공 여부
 * @param data    응답 데이터, Nullable
 * @param message 오류 메시지, Nullable (성공 시)
 * @param <T>     응답 데이터 타입
 */
public record CommonResponseDto<T>(
    boolean success,
    @Nullable T data,
    @Nullable String message) {

  /**
   * 성공 응답 생성
   *
   * @param data 응답 데이터, Nullable (API 규약에 따라 상이)
   * @return 성공 응답
   */
  public static <T> CommonResponseDto<T> success(T data) {
    return new CommonResponseDto<>(true, data, null);
  }

  /**
   * 오류 응답 생성
   *
   * @param message 오류 메시지, NotNull
   * @return 오류 응답
   */
  public static <T> CommonResponseDto<T> error(String message) {
    return new CommonResponseDto<>(false, null, message);
  }

  /**
   * 데이터 포함 오류 응답 생성 (API 규약에 따라 미사용 가능성 있음)
   *
   * @param message 오류 메시지, NotNull
   * @param data    추가 데이터, Nullable
   * @return 오류 응답
   */
  public static <T> CommonResponseDto<T> error(String message, T data) {
    return new CommonResponseDto<>(false, data, message);
  }
}
