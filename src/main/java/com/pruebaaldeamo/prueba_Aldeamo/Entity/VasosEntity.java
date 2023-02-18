package com.pruebaaldeamo.prueba_Aldeamo.Entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "arrays", schema = "public")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class VasosEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "input_array")
    private String input;
}

