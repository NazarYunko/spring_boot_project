package com.spring_boot_project.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Rate {

    @Id
    @GeneratedValue
    private long id;

    @NonNull
    private Byte rate;

    @NonNull
    @ManyToOne
    private User user;

    @NonNull
    @ManyToOne
    private Movie movie;
}
