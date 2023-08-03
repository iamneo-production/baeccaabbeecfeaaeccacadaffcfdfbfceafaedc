package com.examly.springapp.repository;
import org.springframework.data.jpa.repository.JpaRepository;  
import org.springframework.stereotype.Repository;
import com.examly.springapp.model.Springapp;  
@Repository
public interface SpringappRepository extends JpaRepository<Springapp,Integer> {
    
}



package com.examly.springapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringappApplication.class, args);
	}

}