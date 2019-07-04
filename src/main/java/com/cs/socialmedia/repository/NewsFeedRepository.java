package com.cs.socialmedia.repository;

import com.cs.socialmedia.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.EntityManager;
import java.util.List;

public interface NewsFeedRepository extends JpaRepository<User, Integer> {

}
