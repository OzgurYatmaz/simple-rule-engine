package com.sample.rules.config;

import java.io.IOException;
import org.drools.compiler.compiler.DroolsParserException;
import org.kie.api.io.Resource;
import org.kie.api.runtime.KieSession;
import org.kie.internal.utils.KieHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DroolsConfig {

  @Bean
  public KieSession kieSession() throws IOException, DroolsParserException {
    KieHelper kieHelper = new KieHelper();

    Resource drl = org.kie.internal.io.ResourceFactory.newClassPathResource("rules/rules.drl");
    kieHelper.addResource(drl);

    return kieHelper.build().newKieSession();
  }
}
