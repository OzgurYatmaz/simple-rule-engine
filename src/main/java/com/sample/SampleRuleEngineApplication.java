package com.sample;

import com.sample.rules.model.Person;
import com.sample.rules.service.RuleService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleRuleEngineApplication implements CommandLineRunner {

  @Autowired
  private RuleService ruleService;

  public static void main(String[] args) {
    SpringApplication.run(SampleRuleEngineApplication.class, args);
  }

  @Override
  public void run(String... args) {

    List<Person> data = List.of(new Person("Abdulahir", 36), new Person("John", 17),
        new Person("Yahya", 19), new Person("Ali", 12));
    ruleService.evaluateRules(data);

  }
}
