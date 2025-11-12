## 🎯 Objetivo

Este trabalho tem como finalidade compreender e aplicar o conceito de *recursividade* por meio da construção de uma *Árvore Binária de Busca (Binary Search Tree - BST)* utilizando a linguagem *Java*.  
A proposta é implementar operações fundamentais como:
- Inserção de elementos;  
- Busca de valores;  
- Percursos em *pré-ordem, **em ordem* e *pós-ordem*.

O foco está em mostrar como funções recursivas substituem os laços de repetição tradicionais, simplificando o processo de navegação em estruturas hierárquicas.

---

## 🧠 Parte 1 – Conceito e Explicação

### ⿡ O que é recursividade?

Recursividade é uma técnica de programação em que uma função *resolve um problema chamando a si mesma*, mas com uma entrada reduzida ou simplificada.  
Esse processo continua até que uma condição de parada seja atingida, chamada de *caso base*.  
A partir daí, as chamadas começam a retornar seus resultados até completar a execução.

📘 *Exemplo ilustrativo:*
java
int soma(int n) {
    if (n == 0) return 0;       // Caso base: quando parar
    return n + soma(n - 1);     // Caso recursivo: chama a si mesma
}

## ⿢ Como a recursividade é usada na percorrência (travessia) de uma árvore binária?

A recursividade é essencial para percorrer árvores binárias, pois cada *nó* pode ser tratado como uma *subárvore independente* dentro da estrutura principal.  
Com isso, uma única função consegue visitar todos os nós apenas chamando a si mesma — sem precisar de laços for ou while.

A ideia é simples:  
- Para cada nó, a função chama a si mesma para visitar o *filho da esquerda*;  
- Em seguida, processa o *nó atual*;  
- E por fim, chama a si mesma para visitar o *filho da direita*.  

📘 *Exemplo prático – Percurso em ordem (in-order):*
java
void emOrdem(Node no) {
    if (no != null) {
        emOrdem(no.esquerda);             // Visita a subárvore esquerda
        System.out.print(no.valor + " ");  // Exibe o valor do nó atual
        emOrdem(no.direita);              // Visita a subárvore direita
    }
}
## ⿣ Qual a diferença entre recursão e laço (for/while)?

Tanto a **recursão** quanto os **laços de repetição** (`for` e `while`) são formas de executar tarefas repetitivas, porém funcionam de maneiras distintas.

Na **recursão**, uma função **chama a si mesma** para resolver versões menores do mesmo problema, até atingir uma condição que interrompe as chamadas (caso base).  
Nos **laços**, a repetição ocorre dentro de um mesmo bloco de código, controlada por uma variável e uma condição lógica.

| Característica | Recursão | Laço (for/while) |
|----------------|-----------|------------------|
| **Mecanismo** | A função se chama repetidamente | O código é repetido dentro de um bloco |
| **Controle** | Feito pela pilha de chamadas | Feito por contadores ou condições |
| **Parada** | Caso base (condição para encerrar as chamadas) | Condição lógica (`i < n`, por exemplo) |
| **Uso comum** | Árvores, grafos, problemas hierárquicos | Listas, vetores e repetições lineares |
| **Vantagem** | Código mais simples para estruturas recursivas | Mais eficiente em consumo de memória |
| **Desvantagem** | Pode ocupar mais memória (pilha) | Pode ser mais difícil de adaptar a estruturas hierárquicas |

📘 **Exemplo comparativo:**

**Recursivo:**
java
void contarRecursivo(int n) {
    if (n == 0) return; // Caso base
    System.out.println(n);
    contarRecursivo(n - 1); // Chamada recursiva
}
