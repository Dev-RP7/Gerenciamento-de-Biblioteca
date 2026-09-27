package br.senac.sp.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.senac.sp.app.models.request.LivroRequest;
import br.senac.sp.app.models.response.LivroResponse;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.senac.sp.app.service.LivroService;

@RestController 
@RequestMapping("/Livro")
public class LivroController {
    private final LivroService Livro;

    public LivroController(LivroService livroService){
        this.Livro = livroService;
    }

    @PostMapping("/cadastrar") 
    public LivroResponse cadastrar(@RequestBody LivroRequest Livro) {
        this.Livro = LivroRequest;
      

    }
    
    

}
