package nestor.gonzalo.cardenas.rojas.app.microservices.service;

import nestor.gonzalo.cardenas.rojas.app.microservices.model.Courses;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CoursesInterface {
	void create(Courses courses);

	Flux<Courses> findAll();

	Mono<Courses> findById(String id);

	Mono<Courses> save(Courses courses);

	Mono<Void> delete(String id);

}
