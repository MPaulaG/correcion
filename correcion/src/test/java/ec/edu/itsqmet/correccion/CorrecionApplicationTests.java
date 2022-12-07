package ec.edu.itsqmet.correccion;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ec.edu.itsqmet.correccion.dto.BirdCategoryDTO;
import ec.edu.itsqmet.correccion.repository.IBirdCategoryRepository;
import ec.edu.itsqmet.correccion.singleton.Singleton;

@SpringBootTest
class CorrecionApplicationTests {
	@Autowired
	private IBirdCategoryRepository birdCategoryRepository;

	@Test
	void contextLoads() {
		for (BirdCategoryDTO iterable_element : Singleton.getBirds(birdCategoryRepository)) {
			System.out.println("ID:" + iterable_element.getPK() + ", TYPE:" + iterable_element.getName());
		}
	}

}
