package uz.master.demotest.controller;

import org.springframework.stereotype.Service;
import uz.master.demotest.entity.HelperText;
import uz.master.demotest.enums.HelperTextType;
import uz.master.demotest.repositories.HelperTextRepository;

import java.util.List;

@Service
public class HelperTextService {

    private final HelperTextRepository helperTextRepository;

    public HelperTextService(HelperTextRepository helperTextRepository) {
        this.helperTextRepository = helperTextRepository;
    }

    public List<HelperText> getAdvantages() {
        return helperTextRepository.findHelperTextsByHelperTextTypeAndDeletedFalse(HelperTextType.ADVANTAGES);
    }
}
