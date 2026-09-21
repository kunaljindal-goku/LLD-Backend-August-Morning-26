package com.scaler.splitwise;

import com.scaler.splitwise.commands.Command;
import com.scaler.splitwise.commands.CommandExecutor;
import com.scaler.splitwise.commands.RegisterCommand;
import com.scaler.splitwise.commands.SettleUpCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
@EnableJpaAuditing
public class SplitwiseApplication implements CommandLineRunner {

	@Autowired
	private CommandExecutor commandExecutor;

	public static void main(String[] args) {

		SpringApplication.run(SplitwiseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String inputCommand = sc.nextLine();
		commandExecutor.executeCommand(inputCommand);

 	}
}
