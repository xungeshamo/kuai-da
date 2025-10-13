package com.xun.kuaida;

import dev.langchain4j.community.store.embedding.redis.spring.RedisEmbeddingStoreAutoConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {RedisEmbeddingStoreAutoConfiguration.class})
@MapperScan("com.xun.kuaida.mapper")
public class KuaiDaApplication {

    public static void main(String[] args) {
        SpringApplication.run(KuaiDaApplication.class, args);
    }

}
