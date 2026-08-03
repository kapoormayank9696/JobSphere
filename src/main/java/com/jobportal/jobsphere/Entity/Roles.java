package com.jobportal.jobsphere.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Entity
@Table(name="Role")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Roles {
    @Id
    @Column(name="roleId")
    private BigInteger id;
}
