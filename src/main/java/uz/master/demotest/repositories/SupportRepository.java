package uz.master.demotest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.master.demotest.entity.support.Support;

public interface SupportRepository extends JpaRepository<Support, Long> {
}
