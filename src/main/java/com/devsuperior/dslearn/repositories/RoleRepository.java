package com.devsuperior.dslearn.repositories;

import com.devsuperior.dslearn.entities.Role;
import com.devsuperior.dslearn.entities.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {


}
