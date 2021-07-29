package com.example.demo.controllers;

import com.example.demo.entities.Vets;
import com.example.demo.repos.VetRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class VetController {

  private final VetRepository vets;

  public VetController(VetRepository clinicService) {
    this.vets = clinicService;
  }

  @GetMapping("/vets")
  public String showVetList(Map<String, Object> model) {
    Vets vets = new Vets();
    vets.getVetList().addAll(this.vets.findAll());
    model.put("vets", vets);
    model.put("pageName", "Veterinarians");
    return "vets/vetList";
  }

  @GetMapping({"/vets.xml"})
  public @ResponseBody
  Vets showResourcesVetList() {
    Vets vets = new Vets();
    vets.getVetList().addAll(this.vets.findAll());
    return vets;
  }
}
