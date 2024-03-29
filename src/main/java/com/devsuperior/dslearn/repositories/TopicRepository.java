package com.devsuperior.dslearn.repositories;

import com.devsuperior.dslearn.entities.Task;
import com.devsuperior.dslearn.entities.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepository extends JpaRepository<Topic,Long> {


}
