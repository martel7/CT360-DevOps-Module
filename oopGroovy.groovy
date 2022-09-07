class firstGroovyProgram{

    static void main(String[] args){

        Animal dog1 = new Dog();
        dog1.setHumanAge(10);
        dog1.setName("Dzeki");
        System.out.println("Dog is named: " + dog1.getName());
        System.out.println("Dog is " + dog1.getAge() + " year(s) old");
        dog1.makeSound();

        Dog dog2 = new Dog();
    }
}

public class Animal{

        int age;
        String name;

        public Animal(){
            System.out.println("An instance of an animal was created with a hash code: " + this.hashCode());
        }

        public void setHumanAge(int age){
            this.age = age * 7;
        }

        public void setName(String name){
            this.name = name;
        }

        public int getAge(){
            return this.age;
        }

        public String getName(){
            return this.name;
        }

        public void makeSound(){
            System.out.println("Default animal");
        }
    }

public class Dog extends Animal{

    public Dog(){
        System.out.println("An instance of a dog was created with a hash code:     " + this.hashCode());
    }

    public Dog(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public void makeSound(){
        System.out.println("Woof");
    }
}
