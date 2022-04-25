package br.com.bspicinini.projetographql;

import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class HelloGraphQL implements GraphQLQueryResolver {

    public String sayHello() {
        return "Hello World!";
    }
}
