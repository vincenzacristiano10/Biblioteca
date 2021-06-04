package Biblioteca.contrader.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Biblioteca.contrader.DTO.LibroDTO;

@RestController
@RequestMapping("/biblioteca/libro")
public class LibroController extends AbstractController<LibroDTO>{

}
