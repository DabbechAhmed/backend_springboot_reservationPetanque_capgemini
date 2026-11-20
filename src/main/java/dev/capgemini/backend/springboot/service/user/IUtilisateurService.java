package dev.capgemini.backend.springboot.service.user;

import dev.capgemini.backend.springboot.entity.Utilisateur;
import dev.capgemini.backend.springboot.repository.UtilisateurRepository;

public interface IUtilisateurService {
   Utilisateur getUtilisateurByEmail(String mail);
}
