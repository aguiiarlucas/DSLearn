package com.devsuperior.dslearn.repositories;

import com.devsuperior.dslearn.entities.Offer;
import com.devsuperior.dslearn.entities.Reply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReplyRepository extends JpaRepository<Reply,Long> {


}
