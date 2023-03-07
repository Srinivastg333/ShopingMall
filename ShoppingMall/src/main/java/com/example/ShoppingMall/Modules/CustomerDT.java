package com.example.ShoppingMall.Modules;

import com.example.ShoppingMall.SD.AccountStatus;
import com.example.ShoppingMall.SD.Gender;
import com.example.ShoppingMall.SD.Roles;
import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "users1")
public class CustomerDT {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty(message = "Name is mandatory")
    @Size(min=1,max=10,message = "Enter the Name between 1 to 10 Charectors")
    @Column(name = "name")
    private String Name;

    @NotEmpty(message = "Email is mandatory")
    @Size(message = "Enter the Email between 1 to 10 Charectors")
    @Column(name = "email")
    private String Email;

    @NotEmpty(message = "Password is mandatory")
    @Size(min = 1,max=9,message="Password should be under 1-9 Numbers")
    private String Password;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id",referencedColumnName = "id")
    private Address address;
    @Size(min=1,max=10,message = "Enter the PhoneNumber between 1 to 10 numbers")
    @Column(name = "PhoneNo")
    private BigInteger PhoneNo;
    @Temporal(TemporalType.DATE)
    private Date DateOfBirth;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Enumerated(EnumType.STRING)
    private AccountStatus accountStatus;
    @Temporal(TemporalType.DATE)
    private Date AccountCreationDate;
    @Temporal(TemporalType.DATE)
    private Date LastLoginDate;
    @Enumerated(EnumType.STRING)
    private Roles roles;
}
