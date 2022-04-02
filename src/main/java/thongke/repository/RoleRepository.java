package thongke.repository;

import thongke.model.Entity.Role;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.Optional;

@EnableMongoRepositories
public interface RoleRepository extends MongoRepository<Role, ObjectId> {
    Optional<Role> findByName(String name);
    Boolean existsByName(String name);
}