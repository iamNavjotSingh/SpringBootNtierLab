package com.example.mongolab.DAO;

import com.example.mongolab.Entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository <Book,Integer> {


}
