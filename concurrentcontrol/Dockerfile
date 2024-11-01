services:
  # 1. 캐시 전용 노드
  redis-cache:
    image: redis:latest
    container_name: redis-cache
    command: ["redis-server", "/usr/local/etc/redis/redis.conf"]
    volumes:
      - ./redis-cache.conf:/usr/local/etc/redis/redis.conf
    ports:
      - "6379:6379"

  # 2. 영구 저장용 메인 노드
  redis-persistent:
    image: redis:latest
    container_name: redis-persistent
    command: ["redis-server", "/usr/local/etc/redis/redis.conf"]
    volumes:
      - ./redis-persistent.conf:/usr/local/etc/redis/redis.conf
      - redis-persistent-data:/data
    ports:
      - "6380:6379"

  # 3. 영구 저장용 레플리카 노드
  redis-persistent-replica:
    image: redis:latest
    container_name: redis-persistent-replica
    command: ["redis-server", "/usr/local/etc/redis/redis.conf"]
    volumes:
      - ./redis-persistent-replica.conf:/usr/local/etc/redis/redis.conf
    depends_on:
      - redis-persistent
    ports:
      - "6381:6379"

  # 4. 채팅 노드
  redis-chat:
    image: redis:latest
    container_name: redis-chat
    command: ["redis-server", "/usr/local/etc/redis/redis.conf"]
    volumes:
      - ./redis-chat.conf:/usr/local/etc/redis/redis.conf
    ports:
      - "6382:6379"

  # 5. 채팅 노드 레플리카
  redis-chat-replica:
    image: redis:latest
    container_name: redis-chat-replica
    command: ["redis-server", "/usr/local/etc/redis/redis.conf"]
    volumes:
      - ./redis-chat-replica.conf:/usr/local/etc/redis/redis.conf
    depends_on:
      - redis-chat
    ports:
      - "6383:6379"

volumes:
  redis-persistent-data:
