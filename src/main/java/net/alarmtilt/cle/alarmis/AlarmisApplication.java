package net.alarmtilt.cle.alarmis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;

import net.alarmtilt.cle.alarmis.connection.TCPserver;

@SpringBootApplication
@EnableAsync
public class AlarmisApplication {
	

	public static void main(String[] args) throws InterruptedException {
		ConfigurableApplicationContext context = SpringApplication.run(AlarmisApplication.class, args);
		TCPserver tcpServer = context.getBean(TCPserver.class);
		tcpServer.startServer();
	}
}
