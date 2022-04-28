# Desafio Vini Burgers

> Esta é uma homenagem ao jogador de futebol Vinicius Jr.

O objetivo dessa aplicação é ajudar a companhia fictícia chamada Vini Burgers a gerenciar seus processos.

Nossa aplicação ajudará Vini a:

- selecionar tipos de hamburguers
- inserir itens adicionais (`addtitions`) aos hamburguers
- inserir preços aos hamburguers

Nós iremos criar um hamburguer base e também dois outros tipos de hamburgueres que são populares na loja do Vini.

O hamburguer básico, deve ter os seguintes itens:

- Pão de hamburguer
- Carne
- 4 adicionais (alface, tomate, cenoura, bacon) que poderão ser adicionados pelo cliente

Cada um dos 4 itens incrementa o preço do produto. Assim, você precisa construir uma maneira de checar quantos itens foram adicionados e calcular o preço final (hamburguer base mais os itens adicionais).

O hamburguer tem um preço base. O preço do produto será aumentado se forem escolhidos mais de 4 itens adicionais, ou seja, cada item adicional terá cobrado à parte.

- Crie uma classe `Hamburguer` para lidar com as condições acima

    - O constructor deve incluir apenas o tipo de pão, carne, preço do produto e o nome do hamburguer
  
- Crie duas outras variedades de Hamburgueres (duas outras subclasses)

    - `Healthy burger`

      - ele terá pão marrom e mais dois itens poderão ser adicionados
      - ele poderá ter 6 itens adiconais no total
    
    > Dica: você precisará encontrar uma maneira de automaticamente adicionar esses
   > dois itens adicionais nessa nova classe (subclasse de Hamburguer), desde que os
   > dois itens adicionais sejam apenas apropriados para esta nova classe (em outras palavras,
   > o novo tipo de hamburguer)

    - `Deluxe Hamburguer`

        - ele terá batatas fritas e bebidas como adicionais
        - itens adicionais não serão permitidos
      
    > Dica: você deve encontrar uma maneira de automaticamente adicionar esses itens, no momento
  > em que o objeto deluxe burguer for criado, e previnir que outras adições sejam feitas.

- As 3 classes devem ter um método que pode ser chamado a qualquer momento:

    - O método deve poder:

        - Mostrar o preço base do hamburguer com todos os adicionais
        - Cada adicional deve ter seu nome e preço
        - Preço total do produto (preço base mais todos os adicionais)
