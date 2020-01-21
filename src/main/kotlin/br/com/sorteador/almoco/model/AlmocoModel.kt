package br.com.sorteador.almoco.model

import com.fasterxml.jackson.annotation.JsonProperty
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id


@Entity
data class Restaurante(@Id
                  @GeneratedValue
                  @JsonProperty(value = "id", access = JsonProperty.Access.READ_ONLY)
                  val id: Long = 0L,
                  val nome: String ="",
                  val local: String ="")
