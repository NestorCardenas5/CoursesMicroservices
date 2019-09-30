package nestor.gonzalo.cardenas.rojas.app.microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import nestor.gonzalo.cardenas.rojas.app.microservices.model.Courses;
import nestor.gonzalo.cardenas.rojas.app.microservices.service.CoursesServiceImplement;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class CoursesController {
	@Autowired
	private CoursesServiceImplement coursesServiceImplement;

	@PostMapping("/courses")
	public void create(@RequestBody Courses courses) {
		coursesServiceImplement.create(courses);
	}

	@GetMapping("/courses")
	public Flux<Courses> findAll() {
		return coursesServiceImplement.findAll();
	}

	@GetMapping("/courses/{id}")
	public Mono<Courses> getCourses(@PathVariable String id) {

		return coursesServiceImplement.findById(id);
	}

	@PutMapping("/courses")
	public Mono<Courses> save(@RequestBody Courses courses) {
		return coursesServiceImplement.save(courses);
	}
	@DeleteMapping("/courses/{id}")
	public void delete(@PathVariable("id") String id){
		coursesServiceImplement.delete(id).subscribe();
	}
}
