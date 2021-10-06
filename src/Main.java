import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        var inNetworkDoctors = new ArrayList<Doctor>();
        inNetworkDoctors.add(new Doctor("Pricey University", 400));
        inNetworkDoctors.add(new Surgeon("children's hospital", "fancy university", 1000));
        var sickPerson1 = new Person("Stu Dent");
        var sickPerson2 = new Person("Some Body");
        var picker = new Random();
        var choice = picker.nextInt(inNetworkDoctors.size());
        Doctor doc = inNetworkDoctors.get(choice);
        doc.treatPatient(sickPerson1);
        doc.treatPatient(sickPerson2);
        System.out.println(doc);
    }
}
