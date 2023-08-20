package uz.master.demotest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.master.demotest.entity.support.Support;

import java.util.UUID;

public interface SupportRepository extends JpaRepository<Support, Long> {

    Support findSupportBySenderId(Long senderId);

}
