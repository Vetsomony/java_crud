package Dao;

import Border.Border;
import Dto.StudentDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentDao {
    static Border border = new Border();
    private List<Map<String , StudentDto>> students = new ArrayList<>();;

    public void insert(StudentDto studentDto){
        Map<String , StudentDto> stringStudentDtoMap = new HashMap<>();
        stringStudentDtoMap.put(String.valueOf(studentDto.getId()),studentDto);
        students.add(stringStudentDtoMap);
    }
    public void showAll(){
        border.printTableHeader();
        for (Map<String , StudentDto> stringStudentDtoMap : students){
            for (StudentDto studentDto : stringStudentDtoMap.values()){
                System.out.println(studentDto);
            }
        }
        border.printTableFooter();
    }
    public boolean delete(int id) {
        for (Map<String, StudentDto> stringStudentDtoMap : students) {
            if (stringStudentDtoMap.containsKey(String.valueOf(id))) {
                stringStudentDtoMap.remove(String.valueOf(id));
                return true; // Return true when deletion is successful
            }
        }
        return false; // Return false when ID is not found
    }
    public boolean update(int id, int newAge) {
        for (Map<String, StudentDto> stringStudentDtoMap : students) {
            if (stringStudentDtoMap.containsKey(String.valueOf(id))) {
                StudentDto studentDto = stringStudentDtoMap.get(String.valueOf(id));
                if (studentDto != null) {
                    studentDto.setAge(newAge);
                    return true; // Return true when update is successful
                }
            }
        }
        return false; // Return false when ID is not found
    }
    public StudentDto searchById(int id) {
        for (Map<String, StudentDto> stringStudentDtoMap : students) {
            if (stringStudentDtoMap.containsKey(String.valueOf(id))) {
                return stringStudentDtoMap.get(String.valueOf(id));
            }
        }
        return null; // Return null when ID is not found
    }
}
