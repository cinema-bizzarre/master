package HomeWorkLessonFive;

public class Employee {
       private String surname;
        private String name;
        private String patronymic;
       private String position;
        private Double salary;

       private String sex;
       private int age;
       private String email;
       private String phone;
       private String address;

        private String maritalStatus;
       private String children;
      private String education;
       private String hobby;

       public Employee (String surname,String name, String patronymic, String position, Double salary, String sex,
                        int age, String email, String phone, String address, String maritalStatus, String children,
                        String education, String hobby) {
           this.surname = surname;
           this.name = name;
           this.patronymic = patronymic;
           this.position = position;
           this.salary = salary;
           this.sex = sex;
           this.age = age;
           this.email = email;
           this.phone = phone;
           this.address = address;
           this.maritalStatus = maritalStatus;
           this.children = children;
           this.education = education;
           this.hobby = hobby;
       }

       public void registrationCard() {
               System.out.println(surname +
                       " " + name +
                       " " + patronymic+
                       "Должность" + position+ '\'' +
                       " " + sex +
                       " " + age +
                       " " + email +
                       " " + phone +
                       " " + address +
                       " " + maritalStatus +
                       " " + children +
                       " " + education +
                       " " + hobby );
           }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getEducation() {
        return education;
    }
}
