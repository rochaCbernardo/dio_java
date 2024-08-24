public class Escola {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        estudante1.setName("Bernardo Rocha");
        estudante1.setAge(23);
        
        System.out.println("Aluno: " + estudante1.getName() + "; Idade: " + estudante1.getAge());
    }
}
