package com.example.dash.service;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.dash.model.DashBoard;

public interface DashboardPropertiesService extends MongoRepository<DashBoard, Long>{

	public int modifyTable(int i);

}
