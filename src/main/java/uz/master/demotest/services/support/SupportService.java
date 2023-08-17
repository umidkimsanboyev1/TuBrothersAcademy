package uz.master.demotest.services.support;


import org.springframework.stereotype.Service;
import uz.master.demotest.entity.support.Support;
import uz.master.demotest.repositories.SupportRepository;

@Service
public class SupportService {

    private final SupportRepository supportRepository;

    public SupportService(SupportRepository supportRepository) {
        this.supportRepository = supportRepository;
    }


    public boolean createSupport(Support support) {
        return false;
    }
}
