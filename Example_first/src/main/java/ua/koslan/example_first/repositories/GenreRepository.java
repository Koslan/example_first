package ua.koslan.example_first.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.koslan.example_first.models.Genre;

public interface GenreRepository extends JpaRepository<Genre, Integer> {

}
