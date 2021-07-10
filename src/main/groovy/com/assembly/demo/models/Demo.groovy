package com.assembly.demo.models

import javax.persistence.*
import java.time.LocalDate

@Entity
@Table(name = 'Demos')
class Demo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id

    @Column
    String unTexto

    @Column
    Boolean isUnCampoBool

    @Column
    LocalDate unaFecha

    @OneToMany(cascade = CascadeType.ALL)
    List<DemoItem> items = new ArrayList<>()

}
