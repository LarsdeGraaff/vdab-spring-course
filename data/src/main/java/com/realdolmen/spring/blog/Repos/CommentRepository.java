package com.realdolmen.spring.blog.Repos;

import com.realdolmen.spring.blog.domain.Comment;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by jeansmits on 15/06/15.
 */

@Configuration
@EnableJpaRepositories(basePackages="com.acme.spittr.db")
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
