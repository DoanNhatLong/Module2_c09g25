package ss5_modifier.management;

public class Management {
    static Student[] students = new Student[10];

    static {
        students[0] = new Student(1, "Long", "ĐN");
        students[1] = new Student(2, "Vinh", "HN");
        students[2] = new Student(3, "Le", "ĐN");
    }

    public void displayStudent() {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println(students[i]);
            } else {
                break;
            }
        }
    }

    public void addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }
    }

    public void deleteStudent(int id) {
        int index = 0;
        boolean flag = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getId() == id) {
                students[i] = null;
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("Không có id khớp");
        } else {
            for (int i = 0; i < students.length; i++) {
                if (students[i] != null) {
                    students[index++] = students[i];
                }
            }
            for (int i = index; i < students.length; i++) {
                students[i] = null;
            }
        }

    }
}
