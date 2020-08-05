package bees.joro.bees.data.models.repositories;

import bees.joro.bees.data.models.base.BeeFarm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeeFarmRepository extends JpaRepository<BeeFarm, Long> {

}
