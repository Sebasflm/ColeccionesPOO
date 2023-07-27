import java.util.LinkedList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        LinkedList<Persona> listapersonas = new LinkedList<>();
        listapersonas.add(new Persona("Sebastian","Ramirez",1755605233,17));
        listapersonas.add(new Persona("Gabriel","Alvarez",1556545233,22));
        listapersonas.add(new Persona("Juan","Munoz",177215233,31));
        listapersonas.add(new Persona("Nilow","Mora",1281552125,25));
        String borrar= "Sebastian";
        for(Persona persona1:listapersonas){
            if(persona1.getNombre().equals(borrar)){
                listapersonas.remove(persona1);
                break;
            }
        }
        for(Persona persona1:listapersonas){
            System.out.println("El nombre de la persona es: "+persona1.getNombre());
            System.out.println("El apellido de la persona es: "+persona1.getApellido());
            System.out.println("La cedula de la persona es: "+persona1.getCedula());
            System.out.println("La edad de la persona es: "+persona1.getEdad());
            System.out.println("------------------------------------------------------");
        }
    }

}