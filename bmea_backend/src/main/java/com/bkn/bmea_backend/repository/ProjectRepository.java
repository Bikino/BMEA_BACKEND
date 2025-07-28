package com.bkn.bmea_backend.repository;

import com.bkn.bmea_backend.model.Project;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProjectRepository extends MongoRepository<Project, String> {
}
