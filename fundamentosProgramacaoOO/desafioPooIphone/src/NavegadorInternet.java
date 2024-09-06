public interface NavegadorInternet {

    private void adicionarNovaAba(){
        System.out.println("Nova aba adicionada");
    }
    private void atualizarPagina(){
        System.out.println("Página atualizada");
    }
    private void exibirPagina(String url){
        System.out.println("Acesso a página com sucesso");
    }
}
