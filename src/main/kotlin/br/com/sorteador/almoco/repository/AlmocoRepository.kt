package br.com.sorteador.almoco.repository

import br.com.sorteador.almoco.model.Restaurante
import org.springframework.data.repository.CrudRepository

interface AlmocoRepository : CrudRepository<Restaurante, Long>
