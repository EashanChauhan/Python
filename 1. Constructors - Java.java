public class Person {

  private String first, last;

  public Person(String first, String last) {
    this.first = first;
    this.last = last;
  }
  
  public String getFullName() {
    return this.first + " " + this.last
  }

}

public class AnotherClass {

  public static void main(String[] args) {
    Person person = new Person("Eashan", "Chauhan");
    System.out.println(person.getFullName());
  }
  
}
