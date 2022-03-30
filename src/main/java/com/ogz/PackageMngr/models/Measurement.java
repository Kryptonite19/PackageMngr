package com.ogz.PackageMngr.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "measurement")
@Setter
@Getter
public class Measurement {
    @Id
    private Long id;
    @Column(name = "length")
    private float length;
    @Column(name = "height")
    private float   height;
    @Column(name = "width")
    private float width;
    @Column(name = "weight")
    private float weight;
    @Column(name = "date")
    private Date date;
    @Column(name = "dimUnit")
    private float dimUnit;
    @Column(name = "lenUnit")
    private float lenUnit;
    @Column(name = "username")
    private String username;
}