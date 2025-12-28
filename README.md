# File Depot API

File Depot API DTOs - File Depot 서버와 클라이언트 간의 통신에 사용되는 DTO 공유 라이브러리

## DTO

### CommonResponseDto

모든 API 응답을 위한 제네릭 래퍼입니다.

```java
CommonResponseDto<StorageItemDto> response = CommonResponseDto.success(storageItem);
CommonResponseDto<Void> errorResponse = CommonResponseDto.error("파일을 찾을 수 없습니다.");
```

### StorageItemDto

저장된 파일 정보입니다.

| 필드             | 타입             | 설명                                    |
| ---------------- | ---------------- | --------------------------------------- |
| id               | String           | 파일 식별자 (UUID)                      |
| fileName         | String           | 파일명 (최대 255자)                     |
| size             | Long             | 파일 크기 (바이트)                      |
| contentType      | String           | MIME 타입                               |
| processingStatus | ProcessingStatus | 처리 상태                               |
| createdAt        | Instant          | 생성 시간                               |
| content          | String           | 파싱된 텍스트 (withContent=true일 때만) |

### ChunkDto

청크 정보입니다

| 필드      | 타입        | 설명                                    |
| --------- | ----------- | --------------------------------------- |
| id        | String      | 청크 식별자                             |
| index     | int         | 청크 순서 (0부터 시작)                  |
| content   | String      | 청크 텍스트                             |
| embedding | List<Float> | 임베딩 벡터 (withEmbedding=true일 때만) |

### UploadUrlResponse

업로드 세션 생성 응답입니다.

| 필드          | 타입   | 설명                   |
| ------------- | ------ | ---------------------- |
| id            | String | 업로드 세션 ID (UUID)  |
| uploadUrl     | String | 사전 서명된 업로드 URL |
| expirySeconds | int    | URL 만료 시간 (초)     |

### DownloadUrlResponse

다운로드 URL 생성 응답입니다.

| 필드          | 타입   | 설명                     |
| ------------- | ------ | ------------------------ |
| downloadUrl   | String | 사전 서명된 다운로드 URL |
| expirySeconds | int    | URL 만료 시간 (초)       |

### ConfirmUploadRequest

업로드 완료 확인 요청입니다.

| 필드     | 타입   | 설명                              |
| -------- | ------ | --------------------------------- |
| id       | String | 파일 식별자 (UUID)                |
| fileName | String | 원본 파일명 (null 시 UUID로 대체) |

### BatchDownloadRequest

여러 파일을 한 번에 다운로드하기 위한 요청입니다.

```java
BatchDownloadRequest request = new BatchDownloadRequest(List.of("id1", "id2", "id3"));
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

- [file-depot](https://github.com/kimdoyeon-goryeong23rd/file-depot) - File Depot 서버
- [file-depot-client](https://github.com/kimdoyeon-goryeong23rd/file-depot-client) - File Depot 클라이언트
