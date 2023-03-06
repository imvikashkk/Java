
/*
    It is a special form of Association where:
    It represents Has-A’s relationship.

    It is a unidirectional association i.e. a one-way relationship. For example, a department 
    can have students but vice versa is not possible and thus unidirectional in nature.

    In Aggregation, both the entries can survive individually which means ending one entity will 
    not affect the other entity.



                      COLLEGE-----------STUDENT
                         |
                         |
                         |
                         |
                      TEACHER
 */
import java.util.*;

class student {
    String name;
    int id;
    String dept;

    student(String name, int id, String dept) {
        this.name = name;
        this.id = id;
        this.dept = dept;
    }
}

class department {
    String name;
    private List<student> std;

    department(String name, List<student> std) {
        this.name = name;
        this.std = std;
    }

    public List<student> getStudents() {
        return std;
    }
}

class institute {
    String instituteName;
    private List<department> depmnt;

    institute(String instituteName, List<department> depmnt) {
        this.instituteName = instituteName;
        this.depmnt = depmnt;
    }

    public int getTotalStdInIns
    {

    }
}

public class _02_X_Aggregation {

}
