# 🏛️ Hell's Gladiators

**Um jogo de combate entre gladiadores no Coliseu Romano**

---

## 📖 Sobre o Projeto

Hell's Gladiators é um jogo baseado em turnos desenvolvido em Java onde você escolhe um gladiador e enfrenta oponentes controlados por IA no Coliseu Romano. Cada classe de gladiador possui características únicas, armas especiais e habilidades que criam combates estratégicos e dinâmicos.

**Projeto desenvolvido como trabalho acadêmico de Programação Orientada a Objetos - 1º Semestre**

---

## 🎮 Características do Jogo

### **5 Classes de Gladiadores**
- 🛡️ **Murmillo** - Tanque pesado com alta resistência
- 🎯 **Retiarius** - Assassino ágil com controle de campo
- ⚖️ **Thraex** - Versátil com dano sustentado
- 🗡️ **Secutor** - Especialista anti-ágil
- ⚡ **Hoplomachus** - Glass cannon com alto dano inicial

### **Sistema de Armas**
- ⚔️ **Espada** - 20% de chance de duplo ataque
- 🔱 **Lança** - 20% de chance de desarmar
- 🪓 **Machado** - Quebra armadura após 2 golpes
- 🕸️ **Rede e Adaga** - Paralisa o oponente
- 🏹 **Arco e Flecha** - Ignora armadura completamente

### **Mecânicas Especiais**
- ⚡ Sistema de críticos (15% de chance, dobra o dano)
- 🩸 Efeitos de status (paralisia, sangramento, desarme)
- 🤖 IA estratégica com sistema de counters
- 🎲 Eventos aleatórios na arena (chuva, leão, vaias)
- 🏆 Sistema de ranking com persistência de dados

---

## 🚀 Como Jogar

### **Pré-requisitos**
- Java JDK 8 ou superior instalado
- Terminal/Prompt de Comando

### **Instalação e Execução**

1. **Clone ou baixe o projeto:**
```bash
git clone https://github.com/seu-usuario/hells-gladiators.git
cd HellsGladiators
```

2. **Compile todos os arquivos:**
```bash
javac *.java
```

3. **Execute o jogo:**
```bash
java Main
```

4. **Para limpar arquivos compilados:**
```bash
# Windows
del *.class

# Linux/Mac
rm *.class
```

---

## 🎯 Como Jogar

### **Menu Principal**
1. **Jogar** - Inicia uma nova batalha
2. **Ver Ranking** - Mostra o top 10 gladiadores
3. **Ver Histórico** - Exibe batalhas anteriores
4. **Sair** - Fecha o jogo

### **Durante a Batalha**
1. Escolha sua classe de gladiador
2. Digite o nome do seu gladiador
3. A IA escolherá automaticamente um oponente (possivelmente um counter)
4. Em cada turno você pode:
   - **Atacar** - Golpe normal com sua arma
   - **Esquivar** - Chance de evitar dano
   - **Defender** - Reduz dano recebido
   - **Avançar** - Move em direção ao oponente

### **Condições de Vitória**
- Reduza o HP do oponente a zero antes que ele faça o mesmo com você!

---

## ⚔️ Detalhes das Classes

### 🛡️ **Murmillo (Tanque Pesado)**
- **HP:** 10
- **Armadura:** 3 (reduz dano em 3)
- **Arma:** Machado (força 5)
- **Vantagem:** Máxima resistência e dano
- **Desvantagem:** Ataca sempre por último, sem críticos
- **Estilo:** Brutalidade consistente

### 🎯 **Retiarius (Assassino Ágil)**
- **HP:** 7
- **Armadura:** 0 (sem armadura)
- **Arma:** Rede e Adaga (força 2)
- **Vantagem:** 30% de imobilizar o oponente
- **Desvantagem:** Muito frágil
- **Estilo:** Hit-and-run, controle

### ⚖️ **Thraex (Versátil)**
- **HP:** 9
- **Armadura:** 2
- **Arma:** Espada (força 3)
- **Vantagem:** Pode causar sangramento (20%), troca de arma
- **Desvantagem:** Nenhuma específica
- **Estilo:** Adaptável e equilibrado

### 🗡️ **Secutor (Especialista Anti-Ágil)**
- **HP:** 9
- **Armadura:** 2
- **Arma:** Lança (força 4)
- **Vantagem:** +2 de dano contra Retiarius
- **Desvantagem:** -1 de dano contra outras classes
- **Estilo:** Counter pick estratégico

### ⚡ **Hoplomachus (DPS/Burst)**
- **HP:** 8
- **Armadura:** 1
- **Arma:** Arco e Flecha (força 2, ignora armadura)
- **Vantagem:** Primeiro ataque sempre crítico (4 de dano)
- **Desvantagem:** Frágil em combate próximo
- **Estilo:** Glass cannon, acabar rápido

---

## 🎲 Eventos Aleatórios

Durante a batalha, eventos podem ocorrer:

- ☔ **Chuva** - Reduz precisão de arcos em 30%
- 👎 **Vaias da Plateia** - Reduz precisão geral em 10%
- 🦁 **Leão na Arena** - O César invoca um leão que ataca ambos
- 🎉 **Plateia Eufórica** - Bônus de motivação

---

## 🏆 Sistema de Ranking

O jogo salva automaticamente:
- ✅ Vitórias e derrotas
- ✅ Total de kills
- ✅ Sequência de vitórias
- ✅ Win rate por classe
- ✅ Histórico completo de batalhas

Os dados são salvos em arquivos `.txt` na pasta `dados/` e persistem entre sessões.

---

## 📁 Estrutura do Projeto

```
HellsGladiators/
│
├── Main.java                    # Ponto de entrada do jogo
│
├── Gladiador.java              # Classe principal do gladiador
├── Arma.java                   # Sistema de armas
├── ConfiguracaoClasse.java     # Configurações das classes
├── StatusBatalha.java          # Gerencia efeitos temporários
│
├── SistemaCombate.java         # Orquestra as batalhas
├── CalculadorDano.java         # Lógica de dano e habilidades
├── GerenciadorTurnos.java      # Sistema de turnos
│
├── Arena.java                  # Ambiente da arena
├── EventoAleatorio.java        # Eventos da arena
├── Plateia.java                # Reações da torcida
│
├── IAOponente.java             # Inteligência artificial
├── EstrategiaMatchmaking.java  # Sistema de counters
│
├── GerenciadorRanking.java     # Sistema de ranking
├── Estatisticas.java           # Dados de estatísticas
├── HistoricoBatalha.java       # Registro de batalhas
│
├── InterfaceConsole.java       # Menus e interação
├── BarraVida.java              # Barras de vida ASCII
├── AnimacaoCombate.java        # Efeitos visuais
│
├── GerenciadorArquivos.java    # Leitura/escrita de arquivos
├── Aleatorio.java              # Utilitário de probabilidade
│
├── dados/                      # Arquivos de dados
│   ├── ranking.txt            # Ranking salvo
│   └── historico.txt          # Histórico de batalhas
│
└── README.md                   # Este arquivo
```

**Total:** 22 arquivos Java

---

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java (JDK 8+)
- **Paradigma:** Programação Orientada a Objetos
- **Interface:** Console/Terminal
- **Persistência:** Arquivos de texto (.txt)

### **Conceitos de POO aplicados:**
- Classes e Objetos
- Encapsulamento
- Construtores
- Métodos estáticos
- Arrays e ArrayLists
- Tratamento de exceções
- Leitura/Escrita de arquivos

---

## 👥 Equipe de Desenvolvimento

Este projeto foi desenvolvido por 5 alunos, com as seguintes responsabilidades:

- **Aluno 1:** Modelo de dados (Gladiador, Arma, ConfiguracaoClasse, StatusBatalha)
- **Aluno 2:** Sistema de combate (SistemaCombate, CalculadorDano, GerenciadorTurnos)
- **Aluno 3:** Interface do usuário (Main, InterfaceConsole, BarraVida, AnimacaoCombate)
- **Aluno 4:** IA e eventos (IAOponente, EstrategiaMatchmaking, Arena, EventoAleatorio, Plateia)
- **Aluno 5:** Persistência de dados (Aleatorio, GerenciadorRanking, Estatisticas, HistoricoBatalha, GerenciadorArquivos)

---

## 🎓 Contexto Acadêmico

**Disciplina:** Programação Orientada a Objetos  
**Semestre:** 1º  
**Prazo:** 11/11/2024 - 23/11/2024 (12 dias)  
**Objetivo:** Desenvolver um sistema completo aplicando conceitos de POO

---

## 🐛 Problemas Conhecidos

- Eventos aleatórios podem não aparecer em todas as batalhas
- Animações podem ser lentas em alguns terminais
- Arquivos de ranking podem corromper se editados manualmente

---

## 🔮 Melhorias Futuras

Possíveis expansões para versões futuras:

- [ ] Mais classes de gladiadores (Dimachaerus, Provocator)
- [ ] Sistema de equipamentos customizáveis
- [ ] Modo campanha com progressão
- [ ] Multiplayer local
- [ ] Interface gráfica (GUI)
- [ ] Sistema de achievements/conquistas
- [ ] Sons e música
- [ ] Dificuldades ajustáveis da IA
- [ ] Torneios com múltiplos oponentes

---

## 📄 Licença

Este projeto foi desenvolvido para fins educacionais.

---

## 🤝 Como Contribuir

1. Fork o projeto
2. Crie uma branch para sua feature (`git checkout -b feature/NovaFeature`)
3. Commit suas mudanças (`git commit -m 'Adiciona NovaFeature'`)
4. Push para a branch (`git push origin feature/NovaFeature`)
5. Abra um Pull Request

---

## 📞 Contato

Para dúvidas ou sugestões sobre o projeto, entre em contato com a equipe de desenvolvimento.

---

## 🙏 Agradecimentos

- Professor(a) da disciplina de POO
- Colegas de turma
- Comunidade Java
- História dos gladiadores romanos que inspirou o tema

---

<div align="center">

**🏛️ Hell's Gladiators 🏛️**

*"Ave, Caesar! Morituri te salutant!"*

*(Salve, César! Os que vão morrer te saúdam!)*

---

Desenvolvido com ☕ e ⚔️ por [Nomes da Equipe]

2024

</div>