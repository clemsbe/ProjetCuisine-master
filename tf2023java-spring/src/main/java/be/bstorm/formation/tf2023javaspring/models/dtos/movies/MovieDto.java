package be.bstorm.formation.tf2023javaspring.models.dtos.movies;

import lombok.Builder;
import lombok.Data;

import java.util.List;

import static org.hibernate.validator.internal.util.CollectionHelper.newArrayList;

@Data
@Builder

public class MovieDto {
    private String title;

    private int duration;

    private List<String> directors = newArrayList();
}
