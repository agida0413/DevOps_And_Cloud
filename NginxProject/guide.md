1. ec2우분투 접속  ssh -i [키 패스] ubuntu@도메인

2. 우분투 업데이트 및 도커 설치

3. 디렉토리생성

$ mkdir -p /home/ubuntu/data/


4. 컴포즈 파일 및 초기스크립트 전송
   scp -i {pem key} {복사할 파일} {호스트}@{도메인}:{복사할 위치}/{이름}
   scp -i {pem key} {복사할 파일} {호스트}@{도메인}:{복사할 위치}/{이름}

5. 스크립트 실행
   chmod +x init-letsencrypt.sh
   ./init-letsencrypt.sh
