package dev.capgemini.backend.springboot.controller;

import dev.capgemini.backend.springboot.service.user.IUtilisateurService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/users")
@RequiredArgsConstructor
public class UtilisateurController {

    private IUtilisateurService utilisateurService;

    @GetMapping("/{mail}")
    private Ent


}
