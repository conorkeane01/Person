package ie.atu.person.cicdperson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    private final PersonRepo personRepository;

    @Autowired
    public PersonService(PersonRepo personRepository) {
        this.personRepository = personRepository;
    }
    public void savePerson(Person person) {
        Person savedPerson = personRepository.save(person);
    }

    // Placeholder method to retrieve a person by employeeId
    public Person getPersonByEmployeeId(String employeeId) {
        return personRepository.findByEmployeeId(employeeId);
    }


}
