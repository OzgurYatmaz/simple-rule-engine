package com.sample;

import com.sample.rules.model.Person;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class ManualTest {

  public static void main(String[] args) {
    KieServices ks = KieServices.Factory.get();
    KieContainer kc = ks.getKieClasspathContainer();
    KieSession session = kc.newKieSession();

    Person a1 = new Person("Abdulahir", 22);

    session.insert(a1);
    session.fireAllRules();
    session.dispose();
  }
}
