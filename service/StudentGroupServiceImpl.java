package service;

import data.StudentGroup;
import repository.Repository;
import repository.StudentRepository;



public class StudentGroupServiceImpl {

    private final Repository <StudentGroup, Integer> studentGroupRepository;






    public StudentGroupServiceImpl(Repository<StudentGroup, Integer> studentGroupRepository) {
        this.studentGroupRepository = studentGroupRepository;
    }

    public StudentGroup saveGroup (StudentGroup studentGroup) {
        return StudentRepository.saveGroup(studentGroup);
    }

    public StudentGroup findGroup(int groupNumber) {
        return studentGroupRepository.findById(groupNumber);
    }
}