package in.nexogen.collections.mapExamples;

import in.nexogen.com.innerclasses.Debug;

import java.util.HashMap;

/**
 * Created by dv on 3/8/17.
 */
// Contains values on the basis of key and value pair
// Map contains only unique keys
// Map is useful in situation where we have to search, update or delete elements in the basis of key
//
public class TestGenericMap {
    public static void main(String[] args) {
        HashMap<Animal, Cat> hm= new HashMap<Animal, Cat>();


        hm.put(new Animal("A", 1), new Cat("Red"));
        hm.put(new Animal("B", 2), new Cat("White"));
        hm.put(new Animal("C", 3), new Cat("Brown"));


        Cat c = hm.get(new Animal("A", 1));

        if (c != null) Debug.log(c.color);
        else Debug.log("c is null");
    }


    public static class Cat{
        public String color;
        public Cat(String color){
            this.color = color;
        }
    }

    public static class Animal{
        public String name;
        public int hash = 0;

        public Animal(String name, int hash) {
            this.name = name;
            this.hash = hash;
            Debug.log(name + "-->" + hashCode());
        }

        @Override
        public int hashCode() {
            return hash;
        }

        @Override
        public boolean equals(Object o) {
            if (o instanceof Animal)
                return (((Animal) o).name.equals(this.name) && ((Animal) o).hash == this.hash);
            else
                return false;
        }

        @Override
        public String toString() {
            String output = name + "---";
            return output;
        }
    }
}