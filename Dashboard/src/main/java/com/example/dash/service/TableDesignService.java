package com.example.dash.service;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.dash.model.TableDesign;

public interface TableDesignService extends MongoRepository<TableDesign, String>{

}
