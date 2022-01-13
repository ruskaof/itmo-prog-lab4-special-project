import human_stuff.Human;
import human_stuff.Photo;
import human_stuff.Post;
import human_stuff.Profession;
import shelter_stuff.*;

import java.util.HashSet;

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

        GlobalTime.getInstance(); // 2019
//
//        domasniy.makeEvent();
//        domasniy.endEvent();
        GlobalTime.getInstance().passOneYear(); // 2020
//
//        domasniy.makeEvent();
//        domasniy.endEvent();
        GlobalTime.getInstance().passOneYear(); // 2021

        // ДАЛЕЕ САМИ СОБЫТИЯ ФЛЕШМОБА

        // Пусть в objects будут храниться собаки, которых раздают подопечным
        domasniy.makeEvent(new Organization.Event("#ПёсНаСчастье3", domasniy) {
            @Override
            public void doEventAction() {
                try {
                    HashSet<Animal> remainingAnimals = ((AnimalShelter)getHolder()).getAnimals();
                    for (Human human : getParticipants()) {
                        for (Animal animal: remainingAnimals) {
                            Post post = new Post(new Photo(human, animal),"text", human);
                            human.getSocialLife().makePost(post);
                            remainingAnimals.remove(animal);
                            break;
                        }
                    }
                } catch (IllegalArgumentException e) {
                    // TODO
                }
            }
        });

        domasniy.getCurrentEvent().addParticipant(new Human("Max Pri", Profession.BUSINESSMAN));
        domasniy.getCurrentEvent().addParticipant(new Human("Emo Kid", Profession.MUSICIAN));

        domasniy.getCurrentEvent().getParticipants();



    }
}
