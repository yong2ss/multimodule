package dev.yong2ss.moduleapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(
		scanBasePackages = {"dev.yong2ss.moduleapi", "dev.yong2ss.modulecommon"}
) //scanBasePackages를 변경하거나 해당 어플리케이션 클래스 위치를 dev.yong2ss 패키지로 올린다
@EntityScan("dev.yong2ss.modulecommon.domain")
@EnableJpaRepositories(basePackages = "dev.yong2ss.modulecommon.repository")
public class ModuleApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModuleApiApplication.class, args);
	}

}
