# 🚗 Simulador de Corrida - Trabalho de Programação Orientada a Objetos (POO)

Este repositório contém o código-fonte de um **Simulador de Corrida entre Dois Veículos**, desenvolvido em Java, conforme os requisitos do trabalho prático da disciplina de Programação Orientada a Objetos (POO).

---

## 🚀 Status do Projeto e Aviso (LEIA ANTES DE ANALISAR O CÓDIGO)

O código presente neste repositório foi desenvolvido em um modo de "sprint" focado em **Funcionalidade Mínima Viável (MVP)**.

* **Status Atual:** O programa está **100% funcional** e cumpre todos os requisitos do PDF.
* **Aviso:** O código **não está limpo** e não segue as melhores práticas de POO, especialmente em termos de **Separação de Responsabilidades** e **Organização de Classes** (como deveria ser para um trabalho de POO mais robusto). Toda a lógica de simulação, controle de fluxo e regras do jogo está concentrada principalmente na classe `App.java`.
    **Não utilize este código como um guia de boas práticas em Java ou POO.**

---

## 🎯 Objetivo da Simulação

O objetivo do programa é simular uma corrida simples entre dois veículos, onde o avanço é determinado aleatoriamente a cada passo de simulação.

### Regras do Jogo

1.  **Veículos:** A simulação é entre dois veículos (Carro 1 e Carro 2).
2.  **Distância Inicial:** Velocidade e distância são iguais a zero no início da corrida.
3.  **Avanço:** A cada passo de simulação, uma nova velocidade é sorteada (podendo ser 1, 2 ou 3) e uma nova distância é calculada somando o valor da velocidade.
4.  **Representação:** A distância corresponde à distância entre a largada e o veículo, sendo representada na tela como espaços em branco.
5.  **Vitória:** Ganha o veículo que primeiro **atingir ou ultrapassar** a distância máxima estabelecida para a corrida.
6.  **Desempate:** Se ambos ultrapassarem a distância máxima, ganha aquele que apresentar a maior distância. Se as distâncias ao final forem iguais, é um empate.

---

## 🛠️ Estrutura do Projeto

O projeto segue uma estrutura de projeto Java simples, com o código principal na pasta `src`.

SIMULADORDECORRIDA

├── .vscode/

├── bin/

├── lib/

└── src/

  └── App.java  <-- Contém a lógica de simulação e regras.

## ⚙️ Como Executar

Para executar a simulação, você deve ter o Java Development Kit (JDK) instalado no seu sistema.

1.  Compile o arquivo `App.java`.
2.  Execute a class `App`.

O programa rodará no console, imprimindo a animação da corrida passo a passo com um atraso de 1 segundo entre cada rodada.

---

### Módulos Principais (Classes e Métodos em `App.java`)

| Método | Finalidade |
| :--- | :--- |
| `main()` | Lógica principal da simulação: loop da corrida, controle da distância, verificação de vitória e atualização da animação. |
| `aumentarVelocidade()` | Sorteia um valor aleatório de avanço (0 a 2) para o veículo em cada passo. |
| `animacao(int carro)` | Cria a string de espaços em branco (simulando a distância) para o console. |
| `status(int carro1, int carro2)` | Exibe o resultado final da corrida (vitória, derrota ou empate). |
| `limparTela()` | Adiciona várias linhas em branco para simular a "limpeza de tela" no console. |

---

> **Nota para os meus colegas (Robson, Antonio e Erick):** A complexidade deste problema sugere que ele deveria ter sido resolvido com a criação de classes como `Veículo` (para encapsular velocidade, distância e talvez o método de avanço), `Simulador` (para o loop da corrida) e uma classe de `Interface` (para a saída/IO), seguindo o paradigma de POO. Este é um exemplo de como **não fazer** em um projeto de grande escala.
