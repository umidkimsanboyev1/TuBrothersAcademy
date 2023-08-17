package uz.master.demotest.services;

import org.springframework.stereotype.Service;
import uz.master.demotest.entity.auth.Callback;
import uz.master.demotest.repositories.CallbackMeRepository;

@Service
public class CallbackMeService {

    private final CallbackMeRepository repository;

    public CallbackMeService(CallbackMeRepository repository) {
        this.repository = repository;
    }

    public boolean saveCallBackMe(Callback callback){
        repository.save(callback);
        return true;
    }
}
