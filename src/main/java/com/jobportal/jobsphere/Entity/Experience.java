package com.jobportal.jobsphere.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Entity
@Table(name = "Experience")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "userId",nullable = false)
    private BigInteger userId;
}
