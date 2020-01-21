package br.com.sorteador.almoco.controller

import br.com.sorteador.almoco.model.Restaurante
import br.com.sorteador.almoco.repository.AlmocoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("almoco")
class AlmocoController{

    @Autowired
    lateinit var almocoRepository: AlmocoRepository

    @GetMapping
    fun list(): List<Restaurante>{
      return almocoRepository.findAll().toList()
    }

    @PostMapping
    fun add(@RequestBody restaurante: Restaurante): Restaurante {
        return almocoRepository.save(restaurante)
    }

    @PutMapping("{id}")
    fun alter(@PathVariable id: Long, @RequestBody restaurante: Restaurante): Restaurante{
        if (almocoRepository.existsById(id)){
            val safeNote = restaurante.copy(id)
            return almocoRepository.save(safeNote)
        }
        return Restaurante()
    }

    @DeleteMapping("{id}")
    fun delete(@PathVariable id: Long){
        if(almocoRepository.existsById(id)){
            almocoRepository.deleteById(id)
        }
    }

}