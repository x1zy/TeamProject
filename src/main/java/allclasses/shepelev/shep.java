package allclasses.shepelev;

import java.util.List;

public class shep {
    String _dogName;
    List<String> _dogList = List.of("Бобик", "Макс", "Денчик", "Рыжик", "Влад");

    public shep(String catName){
        _dogName = catName;
    }

    public String CheckDog(){
        for (String cat : _dogList) {
            if (_dogName.equals(cat)) {
                return "Ваша собака есть в базе данных";
            }
        }
        return "Вашей собаки нет в базе данных";
    }
}