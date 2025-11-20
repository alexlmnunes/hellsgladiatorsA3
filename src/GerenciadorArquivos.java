package com.gladiators.util;

import com.gladiators.ranking.*;
import java.io.*;
import java.util.ArrayList;

public class GerenciadorArquivos {
    private static final String PASTA_DADOS = "dados/";
    private static final String ARQUIVO_RANKING = PASTA_DADOS + "ranking.txt";
    private static final String ARQUIVO_HISTORICO = PASTA_DADOS + "historico.txt";
    
    public GerenciadorArquivos() {
        // Cria pasta de dados se não existir
        File pasta = new File(PASTA_DADOS);
        if (!pasta.exists()) {
            pasta.mkdir();
        }
    }
    
    // RANKING
    public void salvarRanking(ArrayList<Estatisticas> rankings) {
        try {
            FileWriter writer = new FileWriter(ARQUIVO_RANKING);
            BufferedWriter buffer = new BufferedWriter(writer);
            
            for (Estatisticas stat : rankings) {
                buffer.write(stat.toString());
                buffer.newLine();
            }
            
            buffer.close();
        } catch (IOException e) {
            System.out.println("Erro ao salvar ranking: " + e.getMessage());
        }
    }
    
    public ArrayList<Estatisticas> carregarRanking() {
        ArrayList<Estatisticas> rankings = new ArrayList<>();
        
        try {
            File arquivo = new File(ARQUIVO_RANKING);
            if (!arquivo.exists()) {
                return rankings; // Retorna lista vazia
            }
            
            FileReader reader = new FileReader(arquivo);
            BufferedReader buffer = new BufferedReader(reader);
            
            String linha;
            while ((linha = buffer.readLine()) != null) {
                rankings.add(Estatisticas.fromString(linha));
            }
            
            buffer.close();
        } catch (IOException e) {
            System.out.println("Erro ao carregar ranking: " + e.getMessage());
        }
        
        return rankings;
    }
    
    // HISTÓRICO
    public void salvarHistorico(HistoricoBatalha batalha) {
        try {
            // Append no arquivo (não sobrescreve)
            FileWriter writer = new FileWriter(ARQUIVO_HISTORICO, true);
            BufferedWriter buffer = new BufferedWriter(writer);
            
            buffer.write(batalha.toString());
            buffer.newLine();
            
            buffer.close();
        } catch (IOException e) {
            System.out.println("Erro ao salvar histórico: " + e.getMessage());
        }
    }
    
    public void exibirHistorico() {
        try {
            File arquivo = new File(ARQUIVO_HISTORICO);
            if (!arquivo.exists()) {
                System.out.println("Nenhum histórico encontrado.");
                return;
            }
            
            FileReader reader = new FileReader(arquivo);
            BufferedReader buffer = new BufferedReader(reader);
            
            System.out.println("\\n╔════════════════════════════════╗");
            System.out.println("║       📖 HISTÓRICO 📖          ║");
            System.out.println("╚════════════════════════════════╝\\n");
            
            String linha;
            int contador = 1;
            while ((linha = buffer.readLine()) != null) {
                System.out.println(contador + ". " + linha);
                contador++;
            }
            
            buffer.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler histórico: " + e.getMessage());
        }
    }
}