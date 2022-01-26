package tema9;

import tema10.EntityNotFoundException;
import tema10.ValidationException;
import tema5.Human;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class humanRepository<T extends Human> {

    List<T> humans = new ArrayList<>();

    public void add(T toAdd) {
        if (toAdd == null){
            throw new ValidationException("obj este null");
        }
        humans.add(toAdd);
    }

    public List<T> getAll() {
        return humans.stream().collect(Collectors.toList());

    }

    public void deleteById(String id) {
        if (id== null){
            throw new EntityNotFoundException("id este null");
        }
        UUID givenID = UUID.fromString(id);
        //humans // [{id:1, name:Petru} {id:2, name:Ana} {id:3, name:Maria}]
        List<T> toDelete = humans.stream()
                .filter(humanx -> humanx.getUniqueID().equals(givenID))
                .collect(Collectors.toList());
        toDelete.forEach(deleteMe -> humans.remove(deleteMe));
    }

    public void updateById(String id, T humanUpdate){
        if (id== null){
            throw new EntityNotFoundException("id este null");
        }
        if(humanUpdate == null){
            throw new ValidationException("humanupdate este null");
        }
        UUID givenID = UUID.fromString(id);
        humans.stream()
                .filter(human -> human.getUniqueID().equals(givenID))
                .forEach(human ->{
                        human.setFirstName(humanUpdate.getFirstName());
                        human.setLastName(humanUpdate.getLastName());
                        human.setDateOfBirth(humanUpdate.getDateOfBirth());
                        human.setDateOfHiring(humanUpdate.getDateOfHiring());
                        human.setFacultyName(humanUpdate.getFacultyName());
                        human.setSpecializationName(humanUpdate.getSpecializationName());
                        human.setType(humanUpdate.getType());
                });

    }

     public List<T> getById(String id) {
         if (id== null){
             throw new ValidationException("id este null");
         }
         UUID givenID = UUID.fromString(id);
         return humans.stream()
                 .filter(human -> human.getUniqueID().equals(givenID))
                 .collect(Collectors.toList());
     }

    public List<T> getAllByName(String name){
        if (name == null){
            throw new ValidationException("name este null");
        }
        return humans.stream()
                .filter(human -> human.getFirstName().equals(name))
                .collect(Collectors.toList());

    }

    @Override
    public String toString() {
        return "HumanRepository{" +
                "humans=" + humans  +
                '}';
    }
}
