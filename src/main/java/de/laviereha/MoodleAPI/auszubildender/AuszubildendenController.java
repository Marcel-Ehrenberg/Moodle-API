package de.laviereha.MoodleAPI.auszubildender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/auszubildender")
public class AuszubildendenController {

    private final AuszubildendenService auszubildendenService;

    @Autowired
    public AuszubildendenController(AuszubildendenService auszubildendenService) {
        this.auszubildendenService = auszubildendenService;
    }

   @GetMapping
   public List<Auszubildender> getAuszubildende(){
        return auszubildendenService.getAuszubildende();
    }
}
