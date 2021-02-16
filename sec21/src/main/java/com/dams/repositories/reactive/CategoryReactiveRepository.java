package com.dams.repositories.reactive;

import com.dams.domain.Category;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface CategoryReactiveRepository extends ReactiveMongoRepository<Category, Long> {
    Mono<Category> findByDescription(String description);
}
