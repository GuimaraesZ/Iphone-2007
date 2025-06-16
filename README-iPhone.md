# 📱 Projeto iPhone - Desafio POO DIO

## 🎯 Descrição
Este projeto implementa o desafio de Programação Orientada a Objetos (POO) da Digital Innovation One (DIO), modelando as funcionalidades principais do iPhone apresentado em 2007.

## 🏗️ Estrutura do Projeto

```
src/main/java/Account/iphone/
├── interfaces/
│   ├── ReprodutorMusical.java      # Interface para reprodução de música
│   ├── AparelhoTelefonico.java     # Interface para funcionalidades de telefone  
│   └── NavegadorInternet.java      # Interface para navegação web
├── iPhone.java                     # Classe principal que implementa todas as interfaces
└── TesteiPhone.java               # Classe de teste e demonstração
```

## 🔧 Funcionalidades Implementadas

### 🎵 Reprodutor Musical
- `tocar()` - Inicia a reprodução da música selecionada
- `pausar()` - Pausa a música que está tocando
- `selecionarMusica(String musica)` - Seleciona uma música para reprodução

### 📞 Aparelho Telefônico  
- `ligar(String numero)` - Realiza uma chamada para o número especificado
- `atender()` - Atende uma chamada recebida
- `iniciarCorreioVoz()` - Inicia o correio de voz

### 🌐 Navegador na Internet
- `exibirPagina(String url)` - Carrega e exibe uma página web
- `adicionarNovaAba()` - Adiciona uma nova aba no navegador
- `atualizarPagina()` - Atualiza a página atual

## 🚀 Como Executar

1. Compile o projeto:
```bash
javac src/main/java/Account/iphone/*.java src/main/java/Account/iphone/interfaces/*.java
```

2. Execute a demonstração:
```bash
java Account.iphone.TesteiPhone
```

## 🎨 Características do Design

- **Interfaces bem definidas**: Cada funcionalidade é representada por uma interface específica
- **Implementação única**: A classe `iPhone` implementa todas as interfaces, demonstrando polimorfismo
- **Encapsulamento**: Atributos privados com controle de estado interno
- **Feedback visual**: Saídas com emojis para melhor experiência do usuário
- **Tratamento de estados**: Validações para evitar operações inválidas

## 🏆 Conceitos de POO Aplicados

- **Abstração**: Interfaces definem contratos sem implementação
- **Encapsulamento**: Atributos privados e métodos públicos controlados
- **Herança**: Implementação de múltiplas interfaces
- **Polimorfismo**: Um objeto iPhone pode ser tratado como qualquer uma de suas interfaces

## 👨‍💻 Autor
Implementação baseada no desafio da DIO - Trilha Java Básico

## 📚 Referência
- [Desafio Original DIO](https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/poo)
- [Vídeo do Lançamento iPhone 2007](https://www.youtube.com/watch?v=9ou608QQRq8)
