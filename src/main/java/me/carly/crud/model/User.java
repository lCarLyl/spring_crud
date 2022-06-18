package me.carly.crud.model;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private @NonNull String name;
    @Column(name = "lastname")
    private @NonNull String lastname;
    @Column(name = "surname")
    private @NonNull String surname;

}
