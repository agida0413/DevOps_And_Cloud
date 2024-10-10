### Docker 기본 명령어

#### 이미지 관리

- `docker images` # 이미지 목록 확인
- `docker pull <이미지이름>:<태그>` # 이미지 다운로드
- `docker rmi <이미지ID>` # 이미지 삭제

#### 컨테이너 관리

- `docker run <옵션> <이미지이름>` # 컨테이너 실행
- `docker run -d <이미지이름>` # 백그라운드 실행
- `docker ps` # 실행 중인 컨테이너 목록
- `docker ps -a` # 모든 컨테이너 목록
- `docker stop <컨테이너ID>` # 컨테이너 중지
- `docker rm <컨테이너ID>` # 컨테이너 삭제

#### 로그 및 상태

- `docker logs <컨테이너ID>` # 컨테이너 로그 확인
- `docker inspect <컨테이너ID>` # 상태 확인

### Dockerfile 및 이미지 빌드

- `docker build -t <이미지이름>:<태그> .` # 이미지 빌드

### 네트워킹

- `docker network ls` # 네트워크 목록 확인
- `docker network create <네트워크이름>` # 네트워크 생성
- `docker run --network <네트워크이름> <이미지이름>` # 네트워크에 컨테이너 연결

### 볼륨 관리

- `docker volume ls` # 볼륨 목록 확인
- `docker volume create <볼륨이름>` # 볼륨 생성
- `docker run -v <볼륨이름>:<컨테이너내경로> <이미지이름>` # 볼륨 마운트

### Docker Compose

- `docker-compose up` # 서비스 시작
- `docker-compose down` # 서비스 중지