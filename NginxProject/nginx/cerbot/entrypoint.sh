#!/bin/sh

# Nginx가 준비될 때까지 대기
until nc -z nginx 80; do
    sleep 1
done

# Certbot으로 인증서 발급
certbot certonly --webroot --webroot-path=/var/www/certbot \
    --email agida0413@naver.com \
    --agree-tos \
    --no-eff-email \
    -d example.com -d www.example.com

# Nginx 재시작
nginx -s reload

# 무한 루프를 통해 컨테이너 유지
tail -f /dev/null
