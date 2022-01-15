import abstract_things.GlobalTime;
import human_stuff.Human;
import human_stuff.Profession;
import human_stuff.SocialNetwork;
import shelter_stuff.*;

import java.util.ArrayList;

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
    public static ArrayList<SocialNetwork> socialNetworks = new ArrayList<>();

    public static void main(String[] args) {

        SocialNetwork facebook = new SocialNetwork("Facebook");
        SocialNetwork instagram = new SocialNetwork("Instagram");
        socialNetworks.add(facebook);
        socialNetworks.add(instagram);


        AnimalShelter domasniy = new AnimalShelter("Приют \"Домашний\"", City.MOSCOW);
        domasniy.addAnimal(new Dog("Tuzik", DogBreed.BULLDOG));
        domasniy.addAnimal(new Dog("Zuchka", DogBreed.LABRADOR));

        GlobalTime.getInstance(); // 2019

//        domasniy.makeEvent();
//        domasniy.endEvent();
        GlobalTime.getInstance().passOneYear(); // 2020

//        domasniy.makeEvent();
//        domasniy.endEvent();
        GlobalTime.getInstance().passOneYear(); // 2021

        // ДАЛЕЕ САМИ СОБЫТИЯ ФЛЕШМОБА
        String[] captions = new String[4];
        captions[0] = "Смотрите, какой лапочка!";
        captions[1] = "Сам бы его забрал, но девушка не разрешает :(";
        captions[2] = "Это просто чудо!";
        captions[3] = "Милоты вам в ленту";
        domasniy.makeEvent(new DomashniyFlashmob("#ПесНаСчастье", domasniy, captions));
        domasniy.getCurrentEvent().addParticipant(new Human("Max Pri", Profession.BUSINESSMAN));
        domasniy.getCurrentEvent().addParticipant(new Human("Emo Kid", Profession.MUSICIAN));
        domasniy.getCurrentEvent().doEventAction();


        domasniy.getCurrentEvent().end();

    }
}
