# File Depot API

File Depot API DTOs- File Depo 서버와 클라이언트 간의 통신에 사용되는 DTO 공유 라이브러리

## DTO

### CommonResponseDto

모든 API 응답을 위한 제네릭 래퍼입니다.

```java
CommonResponseDto<StorageItemDto> response = CommonResponseDto.success(storageItem);
CommonResponseDto<Void> errorResponse = CommonResponseDto.error("파일을 찾을 수 없습니다.");
```

### StorageItemDto

저장소 아이템의 메타데이터입니다.

| 필드             | 타입             | 설명              |
| ---------------- | ---------------- | ----------------- |
| id               | String           | 아이템 식별자     |
| size             | Long             | 파일 크기(바이트) |
| contentType      | String           | MIME 타입         |
| processingStatus | ProcessingStatus | 처리 상태         |
| createdAt        | Instant          | 생성 시간         |

### UploadUrlResponse

업로드 세션 생성 응답입니다.

| 필드          | 타입   | 설명                   |
| ------------- | ------ | ---------------------- |
| id            | String | 업로드 세션 ID         |
| uploadUrl     | String | 사전 서명된 업로드 URL |
| expirySeconds | int    | URL 만료 시간(초)      |

### DownloadUrlResponse

다운로드 URL 생성 응답입니다.

| 필드          | 타입   | 설명                     |
| ------------- | ------ | ------------------------ |
| downloadUrl   | String | 사전 서명된 다운로드 URL |
| expirySeconds | int    | URL 만료 시간(초)        |

### BatchDownloadRequest

여러 파일을 한 번에 다운로드하기 위한 요청입니다.

```java
BatchDownloadRequest request = new BatchDownloadRequest(List.of("id1", "id2", "id3"));
```

### ConfirmUploadRequest

업로드 완료를 확인하기 위한 요청입니다.

```java
ConfirmUploadRequest request = new ConfirmUploadRequest("upload-session-id");
```

## 열거형

### ProcessingStatus

파일 처리 상태를 나타냅니다.

| 값         | 설명         |
| ---------- | ------------ |
| PENDING    | 처리 대기 중 |
| PROCESSING | 처리 중      |
| COMPLETED  | 처리 완료    |
| FAILED     | 처리 실패    |

## 관련 프로젝트

- [file-depot](https://github.com/agent-hanju/file-depot) - File Depot 서버
- [file-depot-client](https://github.com/agent-hanju/file-depot-client) - File Depot 클라이언트
