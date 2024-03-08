package homework2;

import java.util.HashSet;
import java.util.Set;

public class PartyGuestList {
    Set<String> listInvitados = new HashSet<>();

    public void addGuest(String invitado){
        listInvitados.add(invitado);
    }
    public void removeGuest(String invitado){
        listInvitados.remove(invitado);
        System.out.println("El invitado: " + invitado + " ha sido eliminado con exito");
    }
    public boolean isGuestInList(String invitado){
       boolean verificacion =  listInvitados.contains(invitado);
       System.out.println(verificacion);
       return verificacion;
    }
    public int getTotalGuests(){
        int numeroDeInvitados = listInvitados.size();
        System.out.println(numeroDeInvitados);
        return numeroDeInvitados;
    }
    public void printGuests() {
        for (String invitado: listInvitados
             ) {
            System.out.println(invitado);
        }
    }
}
