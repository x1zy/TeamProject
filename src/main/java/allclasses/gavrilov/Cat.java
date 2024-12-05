package allclasses.gavrilov;

import java.util.List;

public class Cat {
    List<String> _catList = List.of("Мурзик", "Барсик", "Снежок", "Пушок", "Борис");

    public String CheckCat(String catName){
        for (String cat : _catList) {
            if (catName.equals(cat)) {
                return "Ваш кот есть в базе данных";
            }
        }
        return "Вашего кота нет в базе данных";
    }
}