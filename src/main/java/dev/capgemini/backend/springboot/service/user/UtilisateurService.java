package dev.capgemini.backend.springboot.service.user;

import dev.capgemini.backend.springboot.entity.Utilisateur;
import dev.capgemini.backend.springboot.exception.ResourceNotFoundException;
import dev.capgemini.backend.springboot.repository.UtilisateurRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UtilisateurService implements IUtilisateurService{

    private UtilisateurRepository utilisateurRepository;


    @Override
    public Utilisateur getUtilisateurByEmail(String mail) {
        return Optional.ofNullable(utilisateurRepository.getUtilisateursByMail(mail)).orElseThrow(()-> new ResourceNotFoundException("Utilisateur introuvable"));

    }


}
