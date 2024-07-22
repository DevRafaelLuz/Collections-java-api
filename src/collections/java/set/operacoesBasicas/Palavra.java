package collections.java.set.operacoesBasicas;

import java.util.Objects;

public class Palavra {
    private String palavras;

    public Palavra(String palavras) {
        this.palavras = palavras;
    }

    public String getPalavras() {
        return palavras;
    }

    @Override
    public String toString() {
        return palavras;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.palavras);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Palavra other = (Palavra) obj;
        return Objects.equals(this.palavras, other.palavras);
    }
}
