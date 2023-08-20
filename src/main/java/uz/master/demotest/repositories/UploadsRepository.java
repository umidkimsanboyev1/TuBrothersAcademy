package uz.master.demotest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.master.demotest.entity.file.Uploads;

import java.util.UUID;

public interface UploadsRepository extends JpaRepository<Uploads, UUID> {
}
