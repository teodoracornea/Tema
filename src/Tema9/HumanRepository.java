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
        humans.stream().
                filter(human -> human.getUniqueID().equals(givenID))
                .forEach(human -> humans.remove(human));
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
                });

    }

    // public T getById(String id){
      //  UUID givenID = UUID.fromString(id);
      //  humans.stream()
      //          .filter(human -> human.getUniqueID().equals(givenID))
     //           .forEach(human -> return human  );

  //  getAllByName(String name)

}
