public class HomeWork {

    public static void main(String[] args) {

        Employee[] employArray = new Employee[5]; // Вначале объявляем массив объектов
        employArray[0] = new Employee(" Ivan", "Ivanov", "Ivanovich", "Engineer", "ivivan@mailbox.com", "+792312312", 3000.00, 25);
        employArray[1] = new Employee(" Nikolay", "Harper", "Vasilyevich", "diplomat", "Vasilyevich@mailbox.com", "+79257039674", 6050.50, 23);
        employArray[2] = new Employee(" Oliver", "Bryant", "Gordeevich", "Cabinetmaker", "Gordeevich@mailbox.com", "79252506853", 2400.00, 45);
        employArray[3] = new Employee(" Ivan", "Ferguson", "Valeryevich", "Plumber", "Valeryevich@mailbox.com", "79681399639", 4045.00, 50);
        employArray[4] = new Employee("Fil", "Glagolev", "Vladislavovich", "juniorQA", "filQA@mail.ru", "+79104582145", 134562.0, 2);

        for (int i = 0; i < employArray.length; i++) {
            if (employArray[i].getAge() > 40) {
                employArray[i].info();
            }
        }

    }
}


