package labo.tftic.projetcuisine.services;


import java.io.Serializable;
import java.util.Optional;
import java.util.stream.Stream;

public interface CrudService<TEntity, TKey extends Serializable> {
    TEntity save(TEntity entity);

    Stream<TEntity> readAll();

//    Stream<TEntity> readAll(Pageable pageable);

    Optional<TEntity> readOneByKey(TKey key);

    void delete(TKey key);

    void delete(TEntity entity);
}
