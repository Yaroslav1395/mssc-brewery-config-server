package sakhno.springframework.msscconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Данный сервис выступает как конфигурационный сервер, через который остальные сервисы могут получить
 * настройки для запуска.
 */
@EnableConfigServer
@SpringBootApplication
public class MsscConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsscConfigServerApplication.class, args);
    }

}
