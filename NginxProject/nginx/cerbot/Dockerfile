FROM certbot/certbot

COPY entrypoint.sh /entrypoint.sh
RUN chmod +x /entrypoint.sh

EXPOSE
ENTRYPOINT ["/entrypoint.sh"]