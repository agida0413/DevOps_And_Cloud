# Docker 명령어 모음

## Dockerfile 명령어

### 1. FROM
- 베이스 이미지를 지정합니다.
FROM <이미지이름>:<태그> # 예: FROM ubuntu:20.04

### 2. COPY
- 호스트의 파일이나 디렉토리를 컨테이너로 복사합니다.
COPY <소스경로> <대상경로> # 예: COPY index.html /usr/local/apache2/htdocs/

### 3. ADD
- 파일이나 디렉토리를 복사하며, URL에서 파일을 다운로드할 수도 있습니다.
ADD <소스경로> <대상경로> # 예: ADD https://example.com/file.tar.gz /tmp/


### 4. RUN
- 컨테이너를 빌드하는 동안 명령어를 실행합니다.
RUN <명령어> # 예: RUN apt-get update && apt-get install -y curl


### 5. CMD
- 컨테이너가 시작될 때 실행할 기본 명령어를 설정합니다.
CMD ["실행파일", "인수1", "인수2"] # 예: CMD ["apachectl", "-D", "FOREGROUND"]


### 6. ENTRYPOINT
- 컨테이너가 시작될 때 실행할 명령을 설정합니다.
ENTRYPOINT ["실행파일", "인수1", "인수2"] # 예: ENTRYPOINT ["python3", "app.py"]



### 7. WORKDIR
- 이후 명령어가 실행될 작업 디렉토리를 설정합니다.
WORKDIR <디렉토리경로> # 예: WORKDIR /app


### 8. ENV
- 환경 변수를 설정합니다.
ENV <변수명>=<값> # 예: ENV APP_ENV=production


### 9. EXPOSE
- 컨테이너가 수신 대기할 포트를 지정합니다.
EXPOSE <포트번호> # 예: EXPOSE 80



### 10. VOLUME
- 데이터 저장을 위한 볼륨을 지정합니다.
VOLUME ["/데이터경로"] # 예: VOLUME ["/data"]


### 11. LABEL
- 메타데이터를 추가합니다.
LABEL <키>=<값> # 예: LABEL maintainer="your_email@example.com"


### 12. ARG
- 빌드 타임에 사용할 수 있는 변수를 정의합니다.
ARG <변수명>=<값> # 예: ARG VERSION=1.0


### 13. SHELL
- 기본 셸을 변경합니다.
SHELL ["<셸명>", "<옵션>"] # 예: SHELL ["/bin/bash", "-c"]


## 추가 Docker 명령어

### 이미지 관련
- `docker tag <원본이미지>:<태그> <새이미지>:<새태그>`  # 이미지 태그 추가
- `docker history <이미지이름>`  # 이미지의 레이어 및 변경 이력 확인
- `docker save -o <파일명>.tar <이미지이름>`  # 이미지 저장
- `docker load -i <파일명>.tar`  # 저장한 이미지 불러오기

### 컨테이너 관련
- `docker exec -it <컨테이너ID> <명령어>`  # 실행 중인 컨테이너 내에서 명령어 실행
- `docker start <컨테이너ID>`  # 중지된 컨테이너 시작
- `docker restart <컨테이너ID>`  # 컨테이너 재시작
- `docker rename <기존이름> <새이름>`  # 컨테이너 이름 변경
- `docker top <컨테이너ID>`  # 컨테이너에서 실행 중인 프로세스 확인

### 네트워킹 관련
- `docker network inspect <네트워크이름>`  # 네트워크 세부 정보 확인
- `docker network rm <네트워크이름>`  # 네트워크 삭제

### 볼륨 관련
- `docker volume inspect <볼륨이름>`  # 볼륨 세부 정보 확인
- `docker volume rm <볼륨이름>`  # 볼륨 삭제

### 시스템 관리
- `docker info`  # Docker 시스템 정보 확인
- `docker version`  # Docker 버전 확인
- `docker stats`  # 실시간 컨테이너 리소스 사용량 확인
- `docker prune`  # 사용하지 않는 컨테이너, 이미지, 볼륨, 네트워크 정리

### Docker Compose 추가 명령어
- `docker-compose logs`  # 서비스 로그 확인
- `docker-compose ps`  # 실행 중인 서비스 목록
- `docker-compose scale <서비스이름>=<개수>`  # 서비스 인스턴스 수 조정
- `docker-compose exec <서비스이름> <명령어>`  # 특정 서비스에서 명령어 실행

### Dockerfile 빌드 명령어
- `docker build -t test123:1.1 .`  # 현재 디렉토리의 Dockerfile로 이미지 빌드