package be.bstorm.tf.repositories;

import jakarta.persistence.EntityManager;

import java.io.Closeable;
import java.util.List;
import java.util.Optional;

public interface Repository<TEntity, TKey> extends Closeable {

    EntityManager getManager();

    List<TEntity> findAll();

    Optional<TEntity> findOneById(TKey id);

    void insert(TEntity entity);

    void update(TKey id, TEntity entity);

    void delete(TKey id);

}
