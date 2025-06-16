package Account.iphone;

import Account.iphone.interfaces.AparelhoTelefonico;
import Account.iphone.interfaces.NavegadorInternet;
import Account.iphone.interfaces.ReprodutorMusical;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    
    // Atributos do iPhone
    private String musicaAtual;
    private boolean tocando;
    private boolean chamadaAtiva;
    private String paginaAtual;
    
    public iPhone() {
        this.tocando = false;
        this.chamadaAtiva = false;
        this.musicaAtual = "";
        this.paginaAtual = "";
    }
    
    // ========== IMPLEMENTAÇÃO REPRODUTOR MUSICAL ==========
    
    @Override
    public void tocar() {
        if (!musicaAtual.isEmpty()) {
            tocando = true;
            System.out.println("🎵 Tocando música: " + musicaAtual);
        } else {
            System.out.println("❌ Nenhuma música selecionada para tocar");
        }
    }
    
    @Override
    public void pausar() {
        if (tocando) {
            tocando = false;
            System.out.println("⏸️ Música pausada: " + musicaAtual);
        } else {
            System.out.println("❌ Nenhuma música está tocando");
        }
    }
    
    @Override
    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("🎼 Música selecionada: " + musica);
    }
    
    // ========== IMPLEMENTAÇÃO APARELHO TELEFÔNICO ==========
    
    @Override
    public void ligar(String numero) {
        if (!chamadaAtiva) {
            chamadaAtiva = true;
            System.out.println("📞 Ligando para: " + numero);
            System.out.println("🔊 Chamada iniciada...");
        } else {
            System.out.println("❌ Já existe uma chamada ativa");
        }
    }
    
    @Override
    public void atender() {
        if (chamadaAtiva) {
            System.out.println("📱 Chamada atendida");
        } else {
            System.out.println("📞 Atendendo chamada recebida");
            chamadaAtiva = true;
        }
    }
    
    @Override
    public void iniciarCorreioVoz() {
        System.out.println("📬 Iniciando correio de voz...");
        System.out.println("🎤 Grave sua mensagem após o sinal");
    }
    
    // ========== IMPLEMENTAÇÃO NAVEGADOR INTERNET ==========
    
    @Override
    public void exibirPagina(String url) {
        this.paginaAtual = url;
        System.out.println("🌐 Exibindo página: " + url);
        System.out.println("⏳ Carregando conteúdo...");
        System.out.println("✅ Página carregada com sucesso!");
    }
    
    @Override
    public void adicionarNovaAba() {
        System.out.println("➕ Nova aba adicionada");
        System.out.println("🔗 Aba em branco pronta para navegação");
    }
    
    @Override
    public void atualizarPagina() {
        if (!paginaAtual.isEmpty()) {
            System.out.println("🔄 Atualizando página: " + paginaAtual);
            System.out.println("✅ Página atualizada!");
        } else {
            System.out.println("❌ Nenhuma página para atualizar");
        }
    }
    
    // ========== MÉTODOS AUXILIARES ==========
    
    public void encerrarChamada() {
        if (chamadaAtiva) {
            chamadaAtiva = false;
            System.out.println("📴 Chamada encerrada");
        }
    }
    
    public void exibirStatus() {
        System.out.println("\n📱 === STATUS DO iPHONE ===");
        System.out.println("🎵 Música: " + (musicaAtual.isEmpty() ? "Nenhuma" : musicaAtual));
        System.out.println("▶️ Tocando: " + (tocando ? "Sim" : "Não"));
        System.out.println("📞 Chamada: " + (chamadaAtiva ? "Ativa" : "Inativa"));
        System.out.println("🌐 Página: " + (paginaAtual.isEmpty() ? "Nenhuma" : paginaAtual));
        System.out.println("========================\n");
    }
}
