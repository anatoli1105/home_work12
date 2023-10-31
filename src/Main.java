import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String line="---------------------------";
/*Задача 1
Представьте, что вы работаете в небольшой компании.
Данные сотрудников хранятся в неструктурированном формате.
Бухгалтерия попросила написать программу, в которой  можно работать с Ф. И. О. сотрудников.
Напишите четыре строки:
С именем
firstName
 — для хранения имени.
С именем
middleName
 — для хранения отчества.
С именем
lastName
 — для хранения фамилии.
С именем
fullName
 — для хранения Ф. И. О. сотрудника в формате «Фамилия Имя Отчество».
Выведите в консоль фразу: «Ф. И. О. сотрудника — …».
В качестве данных для задачи используйте Ivanov Ivan Ivanovich.*/
        String firstName=" Ivan";
        String midleName=" Ivanov";
        String lastName=" Ivanovich";
        String fullName=firstName+midleName+lastName;
        System.out.println("Ф. И. О. сотрудника -> "+fullName);
        System.out.println(line);
/*Для ежемесячного отчета и ведения документации бухгалтерии нужны Ф. И. О.
 сотрудников, полностью написанные заглавными буквами (верхним регистром).
Напишите программу, которая изменит написание Ф. И. О. сотрудника с
Ivanov Ivan Ivanovich на полностью заглавные буквы.
В качестве строки с исходными данными используйте строку
fullName
.Результат программы выведите в консоль в формате: «Данные Ф. И. О. сотрудника для заполнения отчета — …».*/

        String fullNameLow=fullName.toLowerCase();

        String fullNameUp=fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета —"+fullNameUp);

        String[] fulNameChange=fullNameLow.split("");
        for(int i=0;i<fulNameChange.length;i++){
            fulNameChange[i].toUpperCase();
            if(fulNameChange[i].equals(" ")){
                i++;
                fulNameChange[i]=fulNameChange[i].toUpperCase();
            }
        }
        String fulNameNew=String.join("",fulNameChange);
        System.out.printf("Данные Ф. И. О. сотрудника для заполнения отчета —,%s",fulNameNew);
        System.out.println("\n"+line);
   /*Задача 3
Система, в которой мы работаем, не принимает символ «ё».
Напишите программу, которая заменяет символ «ё» на символ «е».
В качестве исходных данных используйте строку
fullName
и данные в ней — «Иванов Семён Семёнович».
Выведите результат программы в консоль в формате: «Данные Ф. И. О. сотрудника — ...».*/
        {
            fullName = "Иванов Семён Семёнович";
            System.out.println("Данные Ф. И. О. сотрудника — "+fullName);
            fullName = fullName.replace("ё", "e");
            System.out.println("Измененные данные Ф. И. О. сотрудника — "+fullName);

        }
    }
}