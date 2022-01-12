import shelter_stuff.AnimalShelter;
import shelter_stuff.City;
import shelter_stuff.Dog;
import shelter_stuff.DogBreed;

/*
Приют «Домашний» третий год подряд проводит благотворительный флешмоб
#ПесНаСчастье с целью привлечения внимания людей к собакам из московских
приютов и помочь им найти дом до начала следующего года. В этом деле
приюту помогают музыканты, журналисты, бизнесмены и многие другие.

Участники проекта размещают свою фотографию с питомцем приюта «Домашний»
в соцсетях с призывом найти конкретной собаке дом, а после — лично
передают своего подопечного новому хозяину.

Организаторы преследуют цель активировать нехитрый механизм: если хотя
бы один человек поможет одной собаке найти семью, беспризорных псов на
улицах города станет меньше.
 */
public class Main {
    public static void main(String[] args) {
        AnimalShelter domasniy = new AnimalShelter("Приют \"Домашний\"", City.MOSCOW);
        domasniy.addAnimal(new Dog("Tuzik", DogBreed.BULLDOG));
        domasniy.addAnimal(new Dog("Zuchka", DogBreed.LABRADOR));

        GlobalTime.getInstance();

        domasniy.makeEvent("#ПесНаСчастье");
        domasniy.endEvent("#ПесНаСчастье");
        GlobalTime.getInstance().passOneYear();

        domasniy.makeEvent("#ПесНаСчастье2");
        domasniy.endEvent("#ПесНаСчастье2");
        GlobalTime.getInstance().passOneYear();

        domasniy.makeEvent("#ПесНаСчастье3");





    }
}
