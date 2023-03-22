package com.exam.repositories;

import com.exam.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface ProjectRepository extends JpaRepository<Project,Integer> {
    @Override
    //recuperi date mtaa sprint
    List<Project> findBySprintListStartDateAfter(Date date);
}
