package bees.joro.bees.data.models.repositories;

import bees.joro.bees.data.models.base.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
