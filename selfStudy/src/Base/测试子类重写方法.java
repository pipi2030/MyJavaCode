package Base;

public class 测试子类重写方法 {
    public static class Animal{
        public Animal() {
        }

        public void Said(){
            System.out.println("动物很好玩");
        }
    }
    public static class Dog extends Animal{
        @Override
        public void Said() {
            super.Said();
            System.out.println("狗狗很好玩");
        }
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal1 = new Dog();
        animal.Said();
        animal1.Said();
    }
}
