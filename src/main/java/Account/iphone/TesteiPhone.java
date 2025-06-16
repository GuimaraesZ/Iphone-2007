package Account.iphone;

public class TesteiPhone {
    
    public static void main(String[] args) {
        // Criando uma instância do iPhone
        iPhone meuiPhone = new iPhone();
        
        System.out.println("🍎 === DEMONSTRAÇÃO DO iPHONE 2007 ===\n");
        
        // Exibindo status inicial
        meuiPhone.exibirStatus();
        
        // ========== TESTANDO REPRODUTOR MUSICAL ==========
        System.out.println("🎵 === TESTANDO REPRODUTOR MUSICAL ===");
        meuiPhone.tocar(); // Tentativa sem música selecionada
        meuiPhone.selecionarMusica("Hotel California - Eagles");
        meuiPhone.tocar();
        meuiPhone.pausar();
        meuiPhone.selecionarMusica("Bohemian Rhapsody - Queen");
        meuiPhone.tocar();
        System.out.println();
        
        // ========== TESTANDO APARELHO TELEFÔNICO ==========
        System.out.println("📞 === TESTANDO APARELHO TELEFÔNICO ===");
        meuiPhone.ligar("(11) 99999-8888");
        meuiPhone.ligar("(11) 88888-7777"); // Tentativa com chamada ativa
        meuiPhone.atender();
        meuiPhone.iniciarCorreioVoz();
        meuiPhone.encerrarChamada();
        System.out.println();
        
        // ========== TESTANDO NAVEGADOR INTERNET ==========
        System.out.println("🌐 === TESTANDO NAVEGADOR INTERNET ===");
        meuiPhone.atualizarPagina(); // Tentativa sem página carregada
        meuiPhone.exibirPagina("https://www.apple.com");
        meuiPhone.adicionarNovaAba();
        meuiPhone.exibirPagina("https://www.dio.me");
        meuiPhone.atualizarPagina();
        System.out.println();
        
        // Exibindo status final
        meuiPhone.exibirStatus();
        
        System.out.println("✅ Demonstração concluída com sucesso!");
        System.out.println("🚀 iPhone 2007 - Revolucionando a tecnologia!");
    }
}
