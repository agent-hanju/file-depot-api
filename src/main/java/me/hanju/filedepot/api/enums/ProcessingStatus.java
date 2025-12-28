package me.hanju.filedepot.api.enums;

/** 파일 처리 상태 */
public enum ProcessingStatus {
  /** 처리 대기 중 */
  PENDING,
  /** 처리 중 */
  PROCESSING,
  /** 처리 완료 */
  COMPLETED,
  /** 처리 실패 */
  FAILED
}
