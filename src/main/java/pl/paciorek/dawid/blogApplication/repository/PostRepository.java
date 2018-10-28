package pl.paciorek.dawid.blogApplication.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.paciorek.dawid.blogApplication.model.Post;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {
}
