package br.com.sorteador.almoco.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id


@Entity
class Restaurante(@Id
                  @GeneratedValue
                  val id: Long = 0L,
                  val nome: String ="",
                  val local: String ="")
