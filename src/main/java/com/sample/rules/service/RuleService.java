package com.sample.rules.service;

import com.sample.rules.model.Person;
import java.util.List;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Service;

@Service
public class RuleService {

  private final KieSession kieSession;

  public RuleService(KieSession kieSession) {
    this.kieSession = kieSession;
  }

//  public void evaluateRules(Person person) {
//    kieSession.insert(person);
//    kieSession.fireAllRules();
//  }


public void evaluateRules(List<Person> persons) {
//    for (Person p : persons){
//      kieSession.insert(p);
//    }
  persons.forEach(kieSession::insert);
  kieSession.fireAllRules();
  kieSession.dispose();
}
}