package br.edu.utfpr.magicpatobranco.model;

import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Cartas {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(unique = true)
    private String nome;

    @Column(precision = 2)
    private Double value;

    @Column
    private Integer stocked;
}
