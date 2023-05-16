package com.devsuperior.dslearn.repositories;

import com.devsuperior.dslearn.entities.Role;
import com.devsuperior.dslearn.entities.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {


}
