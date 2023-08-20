package uz.master.demotest.services.support;


import org.springframework.stereotype.Service;
import uz.master.demotest.entity.auth.AuthUser;
import uz.master.demotest.entity.support.Support;
import uz.master.demotest.repositories.SupportRepository;
import uz.master.demotest.services.auth.AuthUserService;

@Service
public class SupportService {

    private final SupportRepository supportRepository;
    private final AuthUserService authUserService;

    public SupportService(SupportRepository supportRepository, AuthUserService authUserService) {
        this.supportRepository = supportRepository;
        this.authUserService = authUserService;
    }


    public boolean createSupport(Support support) {
        AuthUser sessionUser1 = authUserService.getSessionUser();
        support.setSenderId(sessionUser1.getId());
        support.setSenderName(sessionUser1.getFullName());
        return false;
    }

    public Support getSupportBySenderId(){
        AuthUser sessionUser1 = authUserService.getSessionUser();
        Support supportBySenderId = supportRepository.findSupportBySenderId(sessionUser1.getId());
        return supportBySenderId;
    }
}
