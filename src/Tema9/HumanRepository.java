package Tema9;

import Tema5.Human;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class HumanRepository<T extends Human> {

    List<T> humans = new ArrayList<>();

    public void add(T toAdd) {
        humans.add(toAdd);
    }

    public List<T> getAll() {
        return humans.stream().collect(Collectors.toList());

    }

    public void deleteById(String id) {
        UUID givenID = UUID.fromString(id);
        //humans // [{id:1, name:Petru} {id:2, name:Ana} {id:3, name:Maria}]
        humans.stream()
                .filter(humanx -> humanx.getUniqueID().equals(givenID))
                .forEach(humany -> humans.remove(humany));
    }

    public void updateById(String id, T humanUpdate){
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
         UUID givenID = UUID.fromString(id);
         return humans.stream()
                 .filter(human -> human.getUniqueID().equals(givenID))
                 .collect(Collectors.toList());
     }

    public List<T> getAllByName(String name){
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
