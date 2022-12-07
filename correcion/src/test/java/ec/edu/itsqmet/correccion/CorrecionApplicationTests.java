package ec.edu.itsqmet.correccion;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ec.edu.itsqmet.correccion.dto.BirdCategoryDTO;
import ec.edu.itsqmet.repository.IBirdCategoryRepository;

@SpringBootTest
class CorrecionApplicationTests {
	@Autowired
	private IBirdCategoryRepository birdCategoryRepository;

	@Test
	void contextLoads() {
		birdCategoryRepository.findAll();
		for (BirdCategoryDTO iterable_element : birdCategoryRepository.findAll()) {
			System.out.println("ID:" + iterable_element.getPK() + ", TYPE:" + iterable_element.getName());
		}
	}

}
