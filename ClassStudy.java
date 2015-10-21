class Dog{
  String name;
}

class ClassStudy{
  public static void main(String[] args){
    Dog dog1 = new Dog();
    dog1.name = "Taro";
    Dog dog2 = new Dog();
    dog2.name = "Pochi";
    Dog dog3 = dog2;  //dog2への参照をdog3に代入
    System.out.println(dog3.name);  // Pochi
    dog3.name = "Jiro"; //dog3とdog2は同じインスタンスを参照
    System.out.println(dog2.name);  // Jiro

  }
}
