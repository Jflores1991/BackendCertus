package com.example.demo;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface nameInterface extends CrudRepository <nameEntity,Integer> {
}
