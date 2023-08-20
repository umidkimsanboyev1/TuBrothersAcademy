package uz.master.demotest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.master.demotest.entity.HelperText;
import uz.master.demotest.enums.HelperTextType;

import java.util.List;

public interface HelperTextRepository  extends JpaRepository<HelperText, Long> {

        List<HelperText> findHelperTextsByHelperTextTypeAndDeletedFalse(HelperTextType helperTextType);
}
