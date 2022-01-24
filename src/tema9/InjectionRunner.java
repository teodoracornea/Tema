package tema9;

import tema5.Professor;
import tema5.Student;

public class InjectionRunner {
    public static void main(String[] args) {
        HumanRepository<Student> studentRepositoryToInject = new HumanRepository<>();
        HumanRepository<Professor> professorRepositoryToInject = new HumanRepository<>();

        HumanService humanService = new HumanService(studentRepositoryToInject, professorRepositoryToInject);

        humanService.exercise1();
        humanService.exercise2();
        humanService.exercise3();
        humanService.exercise31();


    }
}
