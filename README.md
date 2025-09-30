# 🚗 Simulador de Corrida - Projeto em Java

Este repositório contém o código-fonte de um **Simulador de Corrida entre Dois Veículos**, desenvolvido em Java, para demonstrar conceitos de lógica e controle de fluxo.

---

## 🚀 Sobre o Projeto

Este projeto é uma simulação simples de uma corrida de dois carros, onde o avanço de cada veículo é aleatório e a corrida é exibida diretamente no console.

* **Status Atual:** O programa está **100% funcional** e executa a simulação completa.
* **Aviso:** O código foi escrito com foco em funcionalidade e demonstração, e não segue as melhores práticas de Programação Orientada a Objetos (POO). A lógica principal está toda concentrada na classe `App.java`.

---

## 🎯 Objetivo da Simulação

O objetivo do programa é simular uma corrida simples entre dois veículos, onde o avanço é determinado aleatoriamente a cada passo da simulação.

### Regras do Jogo

1.  **Veículos:** A simulação é entre dois veículos (Carro 1 e Carro 2).
2.  **Distância Inicial:** A distância de ambos os carros é zero no início da corrida.
3.  **Avanço:** A cada passo da simulação, um valor aleatório de avanço (entre 1 e 3) é sorteado para cada carro, e sua distância é atualizada.
4.  **Representação:** A distância é representada na tela por uma sequência de espaços em branco, mostrando a posição de cada carro.
5.  **Vitória:** O carro que primeiro **atingir ou ultrapassar** a distância final de 20 pontos vence a corrida.
6.  **Desempate:** Se ambos os carros ultrapassarem a distância final, o vencedor é aquele que alcançou a maior distância total. Se as distâncias forem as mesmas, a corrida termina em empate.

---

## 🛠️ Estrutura do Projeto

O projeto segue uma estrutura de projeto Java simples, com o código principal na pasta `src`.

---

## ⚙️ Como Executar

Para executar a simulação, você deve ter o Java Development Kit (JDK) instalado no seu sistema.

1.  Compile o arquivo `App.java`.
2.  Execute a classe `App`.

O programa rodará no console, imprimindo a animação da corrida passo a passo com um atraso de 1 segundo entre cada rodada.

---

### Módulos Principais (Métodos na classe `App.java`)

| Método | Finalidade |
| :--- | :--- |
| `main()` | Contém a lógica principal da simulação, incluindo o loop da corrida, a verificação da vitória e a exibição da animação. |
| `aumentarDistancia()` | Sorteia um valor aleatório de avanço (1, 2 ou 3) para o veículo em cada passo. |
| `animacao(int distanciaCarro)` | Cria a string de espaços em branco (simulando a distância) para exibição no console. |
| `status(int carro1, int carro2)` | Exibe o resultado final da corrida (vitória, derrota ou empate). |
| `limparTela()` | Adiciona várias linhas em branco para simular a "limpeza de tela" no console, melhorando a visualização da animação. |
