package uz.master.demotest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.master.demotest.entity.auth.Callback;

import java.util.UUID;

public interface CallbackMeRepository extends JpaRepository<Callback, UUID> {
}
