package in.nexogen.com.innerclasses;

/**
 * Created by dv on 3/8/17.
 */
public class Animal {
    public Cat cat;
    public Animal(){
        cat = new Cat("White");
        cat = new Cat("Red");
        cat = new Cat("Black");
        cat = new Cat("White");
    }

    public class Cat{
        private String color;
        public Cat(String color){
            this.color = color;
        }

        public String getColor() {
            return color;
        }
    }
}
