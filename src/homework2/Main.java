package homework2;

public class Main {
    public static void main(String[] args) {

        PartyGuestList listaInvitados = new PartyGuestList();

        listaInvitados.addGuest("Florencia");
        listaInvitados.addGuest("Gabriel");
        listaInvitados.addGuest("Gianfranco");
        listaInvitados.addGuest("fiorella");
        listaInvitados.printGuests();
        System.out.println(" ");
        System.out.println("Invitados despues de borrar");
        listaInvitados.removeGuest("Gianfranco");
        System.out.println(" ");
        listaInvitados.printGuests();
        System.out.println(" ");
        System.out.println("imprimos la total de invitados");
        listaInvitados.getTotalGuests();
        System.out.println("imprimos si esta en la lista");
        listaInvitados.isGuestInList("Gabriel");
        listaInvitados.isGuestInList("Lucas");
    }
}