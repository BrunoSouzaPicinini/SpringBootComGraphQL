package br.com.bspicinini.projetographql;

import graphql.kickstart.tools.GraphQLMutationResolver;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class BookGraphQL implements GraphQLQueryResolver, GraphQLMutationResolver {

    private BookRepository bookRepository;

    public List<Book> findBooks() {
        return bookRepository.findAll();
    }

    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    public Book findOneBook(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

}
