package com.spring_boot_project.dto;

import com.spring_boot_project.entity.*;

public class DtoUtilMapper {

    public static ActorDto actorToActorDto(Actor actor) {
        return new ActorDto(actor.getId(), actor.getName(), actor.getLastName(),
                actor.getCountry(), actor.getCity(), actor.getPathImage());
    }

    public static GenreDto genreToGenreDto(Genre genre) {
        return new GenreDto(genre.getId(), genre.getName());
    }

    public static MovieDto movieToMovieDto(Movie movie) {
        return new MovieDto(movie.getId(), movie.getName(), movie.getCountry(),
                movie.getTime(), movie.getPremiere());
    }

    public static RateDto rateToRateDto(Rate rate) {
        return new RateDto(rate.getId(), rate.getRate(),
                userToUserDto(rate.getUser()), movieToMovieDto(rate.getMovie()));
    }

    public static UserDto userToUserDto(User user) {
        return new UserDto(user.getId(), user.getLogin(),
                user.getEmail(), user.getPassword(), user.getPathImage());
    }

}
