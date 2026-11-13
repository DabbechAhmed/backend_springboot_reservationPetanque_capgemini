package dev.capgemini.backend.springboot.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "coordonnees")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Coordonnees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String laltitude;

    private String longitude;

}
