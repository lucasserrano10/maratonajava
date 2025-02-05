package academy.devdojo.maratonajava.ZZDoptional.test;

import academy.devdojo.maratonajava.ZZDoptional.dominio.Manga;
import academy.devdojo.maratonajava.ZZDoptional.repositorio.MangaRepositorio;

public class OptionalTest02 {
    public static void main(String[] args) {
        MangaRepositorio.findByTitle("Pokemon").ifPresent(m -> m.setTitle("Pokemon 2"));

        MangaRepositorio.findById(1).orElseThrow(IllegalArgumentException::new);

        MangaRepositorio.findByTitle("Laland").orElse(new Manga(3,"Laland", 20));;
    }
}
