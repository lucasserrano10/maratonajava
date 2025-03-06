package academy.devdojo.maratonajava.ZZHpadroesProjetos.dominio;

public class Pessoa {
    private String firstName;
    private String lastName;
    private String username;
    private String email;

    @Override
    public String toString() {
        return "Pessoa{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    private Pessoa(String firstName, String email, String username, String lastName) {
        this.firstName = firstName;
        this.email = email;
        this.username = username;
        this.lastName = lastName;
    }


    public static final class PessoaBuilder {
        private String firstName;
        private String lastName;
        private String username;
        private String email;

        private PessoaBuilder() {
        }

        public static PessoaBuilder aPessoa() {
            return new PessoaBuilder();
        }

        public PessoaBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PessoaBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PessoaBuilder withUsername(String username) {
            this.username = username;
            return this;
        }

        public PessoaBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public Pessoa build() {
            return new Pessoa(firstName, email, username, lastName);
        }
    }
}
