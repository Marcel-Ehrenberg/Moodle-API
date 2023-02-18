package de.laviereha.MoodleAPI.auszubildender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class AuszubildendenService {

    private final AuszubildendenRepository auszubildendenRepository;

    @Autowired
    public AuszubildendenService(AuszubildendenRepository auszubildendenRepository) {
        this.auszubildendenRepository = auszubildendenRepository;
    }

    public List<Auszubildender> getAuszubildende(){
        return auszubildendenRepository.findAll();
    }
}
