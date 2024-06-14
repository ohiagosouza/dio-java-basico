package SetInterface;

import java.util.Objects;

public class Convidado {
    // Atributos
    private String name;
    private int inviteCode;

    public Convidado(String name, int inviteCode) {
        this.name = name;
        this.inviteCode = inviteCode;
    }

    public String getName() {
        return name;
    }

    public int getInviteCode() {
        return inviteCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidado convidado)) return false;
        return getInviteCode() == convidado.getInviteCode();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getInviteCode());
    }

    @Override
    public String toString() {
        return "\nGuest Name: " + name + ", Invite Code: " + inviteCode;
    }
}
