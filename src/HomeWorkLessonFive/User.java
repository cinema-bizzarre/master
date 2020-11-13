package HomeWorkLessonFive;

public class User {
    public static void main(String[] args) {

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ким",
                "Денис",
                "Валерьевич",
                "Генеральный директор",
                700000.00,
                "мужской",
                30,
                "kimdenis@gmail.com",
                "89351974503",
                "Санкт-Петербург, ул.Осипенко,д.4, кв.596",
                "женат",
                "один",
                "высшее",
                " Компьютерные игры"
        );
        employees[1] = new Employee(
                "Коренькова",
                "Людмила",
                "Ивановна",
                "Делопроизводитель",
                50000.00,
                "женский",
                49,
                "korenkova@gmail.com",
                "89141689438",
                "Saint-Petersburg-city,Timurovskaia street,15 - 73",
                "вдова",
                "один",
                "Среднее профессиональное",
                "разгадывание кроссвордов");
        employees[2] = new Employee(
                "Лысенко",
                "Валентина",
                "Борисовна",
                "Бухгалтер",
                120000.00,
                "женский",
                56,
                "lysenkovb@gmail.com",
                "89236390418",
                "Sortavala-city,Mira avenue,7",
                "разведена",
                "три",
                "Высшее",
                "разведение собак");

        employees[3] = new Employee(
                "Заровняева",
                "Надежда",
                "Радомировна",
                "Менеджер",
                70000.00,
                "женский",
                32,
                "zarovnaeva@gmail.com",
                "89248436720",
                "Saint-Petersburg-city,Nekrasova street,20 - 5",
                "незамужем",
                "нет",
                "Высшее",
                "путешествия");

        employees[4] = new Employee(
                "Петрухина",
                "Татьяна",
                "Васильевна",
                "Топ-менеджер",
                100000.00,
                "женский",
                35,
                "petrukhina@gmail.com",
                "89356130483",
                "г.Мурино,ул.Графская,29 - 11",
                "незамужем",
                "нет",
                "Высшее",
                "просмотр сериалов");
        for (Employee employee : employees){
            if (employee.getAge()>40){
                employee.registrationCard();


        }

        }
    }
}




