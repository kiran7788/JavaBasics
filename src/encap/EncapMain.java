package encap;

public class EncapMain {
    public static void main(String[] args) {
        Person person = new Person("Kiran", "kumar");

        person.setAge("11-09-2001");
        person.setGender("Male");
        person.setBloodGroup("O+ve");
        
        String name = person.getFirstName()+" "+person.getLastName()+" "+person.getAge()+"/"+person.g;

        System.out.println(name);
    }
    
}
