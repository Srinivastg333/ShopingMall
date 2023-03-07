package com.example.ShoppingMall.Modules;

import lombok.*;

import javax.persistence.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name="address1")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    private String Street;
    private String City;
    private String State;
    private String ZIP_code;

    @OneToOne(mappedBy ="address")
    private CustomerDT customerDT;
}
