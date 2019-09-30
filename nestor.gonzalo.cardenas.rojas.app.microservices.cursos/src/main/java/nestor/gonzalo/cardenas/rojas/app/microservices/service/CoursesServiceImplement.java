package nestor.gonzalo.cardenas.rojas.app.microservices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nestor.gonzalo.cardenas.rojas.app.microservices.model.Courses;
import nestor.gonzalo.cardenas.rojas.app.microservices.repository.CoursesRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CoursesServiceImplement implements CoursesInterface {
	@Autowired
	public CoursesRepository coursesRepository;

	@Override
	public void create(Courses cources) {
		coursesRepository.save(cources).subscribe();
	}

	@Override
	public Flux<Courses> findAll() {
		return coursesRepository.findAll();
	}

	@Override
	public Mono<Courses> findById(String id) {
		return coursesRepository.findById(id);
	}

	@Override
	public Mono<Courses> save(Courses courses) {
		return coursesRepository.save(courses);
	}

	@Override
	public Mono<Void> delete(String id) {
		return coursesRepository.deleteById(id);
	}

}
