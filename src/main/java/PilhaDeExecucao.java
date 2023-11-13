public class PilhaDeExecucao {
    public static void metodo1() {
        System.out.println("[Inicio] - metodo1");

        metodo2();

        System.out.println("[Fim] - metodo1");
    }

    public static void metodo2() {
        System.out.println("[Inicio] - metodo2");

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        Usuario usuario = null;

            System.out.println(usuario.nome);

=======
        Usuario usuario = new Usuario("Vinicius");
        System.out.println(usuario.nome);
>>>>>>> c59dc4d (Projeto inicial)
=======
        Usuario usuario = new Usuario("Vinicius");
        System.out.println(usuario.nome);
>>>>>>> c59dc4d (Projeto inicial)
=======
        Usuario usuario = new Usuario("Vinicius");
        System.out.println(usuario.nome);
>>>>>>> c59dc4d (Projeto inicial)
=======
        Usuario usuario = new Usuario("Vinicius");
        System.out.println(usuario.nome);
>>>>>>> c59dc4d (Projeto inicial)

        System.out.println("[Fim] - metodo2");
    }

    public static void main(String[] args) {
        System.out.println("[Inicio] - main");

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        try {
            metodo1();
        }catch (NullPointerException ex){
            System.out.println("Usuário não encontrado");
        }
=======
        metodo1();
>>>>>>> c59dc4d (Projeto inicial)
=======
        metodo1();
>>>>>>> c59dc4d (Projeto inicial)
=======
        metodo1();
>>>>>>> c59dc4d (Projeto inicial)
=======
        metodo1();
>>>>>>> c59dc4d (Projeto inicial)

        System.out.println("[Fim] - main");
    }
}

class Usuario {
    public String nome;
    public Usuario(String nome) {
        this.nome = nome;
    }
}