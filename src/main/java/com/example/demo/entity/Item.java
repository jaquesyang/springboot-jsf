package com.example.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by jaquesyang on 2017/7/5.
 */
@Entity
@Table(name="item")
@Data
@NoArgsConstructor
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "`desc`")
    private String desc;


    @Temporal(value = TemporalType.TIMESTAMP)
    private Date modified;

}
