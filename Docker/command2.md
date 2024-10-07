추가 Docker 명령어
이미지 관련
docker tag <원본이미지>:<태그> <새이미지>:<새태그> # 이미지 태그 추가
docker history <이미지이름> # 이미지의 레이어 및 변경 이력 확인
docker save -o <파일명>.tar <이미지이름> # 이미지 저장
docker load -i <파일명>.tar # 저장한 이미지 불러오기
컨테이너 관련
docker exec -it <컨테이너ID> <명령어> # 실행 중인 컨테이너 내에서 명령어 실행
docker start <컨테이너ID> # 중지된 컨테이너 시작
docker restart <컨테이너ID> # 컨테이너 재시작
docker rename <기존이름> <새이름> # 컨테이너 이름 변경
docker top <컨테이너ID> # 컨테이너에서 실행 중인 프로세스 확인
네트워킹 관련
docker network inspect <네트워크이름> # 네트워크 세부 정보 확인
docker network rm <네트워크이름> # 네트워크 삭제
볼륨 관련
docker volume inspect <볼륨이름> # 볼륨 세부 정보 확인
docker volume rm <볼륨이름> # 볼륨 삭제
시스템 관리
docker info # Docker 시스템 정보 확인
docker version # Docker 버전 확인
docker stats # 실시간 컨테이너 리소스 사용량 확인
docker prune # 사용하지 않는 컨테이너, 이미지, 볼륨, 네트워크 정리
Docker Compose 추가 명령어
docker-compose logs # 서비스 로그 확인
docker-compose ps # 실행 중인 서비스 목록
docker-compose scale <서비스이름>=<개수> # 서비스 인스턴스 수 조정
docker-compose exec <서비스이름> <명령어> # 특정 서비스에서 명령어 실행