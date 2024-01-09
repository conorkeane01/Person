package ie.atu.person.cicdperson;

import org.bson.types.ObjectId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepo extends MongoRepository<Person, Long> {
    Person findByEmployeeId(String employeeId);
}
